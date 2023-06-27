package com.example.recipeapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.recipeapplication.Data.Food

@Composable
fun FoodListItem(food: Food,navigateToProfile:(Food)->Unit) {
    Card(
        modifier = Modifier.padding(horizontal=8.dp,vertical=8.dp).fillMaxWidth(),
        shape=RoundedCornerShape(corner= CornerSize(16.dp))

    ) {


        Row(

      Modifier.clickable{navigateToProfile(food)}

        ) {
            FoodImage(food = food)
            Column(
                modifier = Modifier.padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)

            ) {
                Text(text = food.title, style = typography.headlineMedium)
                Text(text = "VIEW DETAILS", style = typography.headlineSmall)
            }
        }
    }
}

@Composable
private fun FoodImage(food:Food){

    Image(
        painter = painterResource(id=food.foodimageid),
        contentDescription=null,
        contentScale= ContentScale.Crop,
        modifier=Modifier.padding(8.dp).size(84.dp)
            .clip(RoundedCornerShape(corner=CornerSize(16.dp)))

    )

}