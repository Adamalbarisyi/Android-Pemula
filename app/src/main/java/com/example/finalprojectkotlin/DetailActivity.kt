package com.example.finalprojectkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp)
        toolbar.setNavigationOnClickListener { finish() }
        supportActionBar?.title =clubs().name
        fill()
    }

    private fun clubs() : Club = intent.getParcelableExtra("SITH")

    private fun fill(){
        detail_name.text = clubs().name
        detail_desc.text = clubs().description
        detail_image.load(clubs().imageUrl)
    }

}