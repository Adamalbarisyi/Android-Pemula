package com.example.finalprojectkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import kotlinx.android.synthetic.main.list_item_club.view.*

class ClubAdapter (private var  clubs : List<Club>, private var context : Context) : RecyclerView.Adapter<ClubAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_item_club, parent, false))

    override fun getItemCount() = clubs.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(clubs[position], context)

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(sith : Club, context: Context){
            itemView.item_clubs_name.text = sith.name
            itemView.item_clubs_image.load(sith.imageUrl)
            itemView.setOnClickListener{
                context.startActivity(Intent(context, DetailActivity::class.java).apply {
                    putExtra("SITH", sith)
                })
            }
        }
    }
}