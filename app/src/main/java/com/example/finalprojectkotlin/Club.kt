package com.example.finalprojectkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Club(var name : String, var description : String, var imageUrl : String) : Parcelable