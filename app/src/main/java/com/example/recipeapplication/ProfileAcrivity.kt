package com.example.recipeapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.recipeapplication.Data.Food
import com.example.recipeapplication.ui.theme.RecipeApplicationTheme
import com.example.recipeapplication.ui.theme.RecipeScreen

class ProfileAcrivity : AppCompatActivity() {

    private val food:Food by lazy {
        intent?.getSerializableExtra(FOOD_ID) as Food
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeApplicationTheme {
               RecipeScreen(food = food)
            }
        }
    }



        companion object{
            private const val FOOD_ID ="food_id"
            fun newIntent(context: Context,food: Food)=
                Intent(context,ProfileAcrivity::class.java).apply {
                    putExtra(FOOD_ID,food)
                }
        }
    }
