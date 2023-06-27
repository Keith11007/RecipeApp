package com.example.recipeapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import com.example.recipeapplication.Data.Food
import com.example.recipeapplication.R


@Composable
fun RecipeScreen(food: Food) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ) {

                    // TODO:
                    RecipeHeader(food = food, containerHeight = this@BoxWithConstraints.maxHeight)
                    RecipeContent(food = food,containerHeight = this@BoxWithConstraints.maxHeight)
                }

            }
        }
    }
}

@Composable
private fun RecipeHeader(
    food:Food,
    containerHeight:Dp)
{
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxSize(),
        painter = painterResource(id = food.foodimageid),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun RecipeContent(
    food:Food,
    containerHeight: Dp)
{
    Column {
        Title(food=food)
        RecipeProperties(stringResource(id = R.string.recipe), value =food.recipe)

        Spacer(modifier=Modifier.height((containerHeight-320.dp).coerceAtLeast(0.dp)))
    }
}

@Composable
private fun Title(food:Food){
    Column( modifier=Modifier.padding(16.dp)) {
        Text(text = food.title,
            style= MaterialTheme.typography.headlineMedium,
            fontWeight= FontWeight.Bold
        )
    }
}

@Composable
private fun RecipeProperties ( label:String,value:String){
    Column (modifier=Modifier.padding(start=16.dp,end=16.dp,bottom=16.dp)){

        Divider(modifier=Modifier.padding(bottom=4.dp))
        Text(text=label,
        modifier=Modifier.height(24.dp),
            style = MaterialTheme.typography.headlineMedium
        )

        Text(text=value,
            modifier=Modifier.height(24.dp),
            style = MaterialTheme.typography.headlineMedium,
            overflow = TextOverflow.Visible
            )

    }

}
