package com.example.recipeapplication

import DataProvider
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.recipeapplication.Data.Food

@Composable
fun FoodHomeContent(navigateToProfile:(Food)->Unit ){
    val foodies=remember{DataProvider.foodList}
    
    LazyColumn(
        contentPadding = PaddingValues(horizontal=16.dp,vertical=8.dp)
    ){
        items(
            items=foodies,
            itemContent={
                FoodListItem(food=it,navigateToProfile)
            }
        )
    }
}

