package com.example.recipeapplication.Data

import java.io.Serializable

data class Food(

    val id:Int,
    val title:String,
    val price:Int,
    val recipe:String,
    val foodimageid:Int,
    ):Serializable
