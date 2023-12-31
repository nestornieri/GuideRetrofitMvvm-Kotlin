package com.example.nest101.data.model

import com.google.gson.annotations.SerializedName

data class ParticipantsModel(
    @SerializedName("activity") val activity:String = "none",
    @SerializedName("type") val type:String,
    @SerializedName("participants") val participants:Int,
    @SerializedName("price") val price:Float,
    @SerializedName("link") val link:String,
    @SerializedName("key") val key:String,
    @SerializedName("accessibility") val accessibility:Float

)
