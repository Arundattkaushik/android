package com.kotlin.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kotlin.practice.ui.theme.PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Your code goes here...
                    LazyGrid()
                }
            }
        }
    }
}






@Composable
fun LazyGrid(){
    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),
        content = {
            items(100){i ->
                Box(modifier = Modifier
                    .padding(8.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.Green),
                    contentAlignment = Alignment.Center
                ){
                        Text(text = "Item $i")
                }
            }
        }
    )
}

@Composable
fun Listing(){
    val srollState = rememberScrollState()

    Column(modifier = Modifier
        .verticalScroll(srollState)) {
        for (i in 1..50){
            Text(text = "Item $i",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .padding(start = 12.dp, top = 14.dp),
                textAlign = TextAlign.Center )
        }
    }
}

@Composable
fun LazyListing(){
    LazyColumn{
        items(50){
            Text(text = "Item $it",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .padding(start = 12.dp, top = 14.dp),
                textAlign = TextAlign.Center )
        }
    }
}


@Composable
fun LazyListingWithIndex(){
    LazyColumn{
        itemsIndexed(listOf("hello","this","is","jetpack","compose"))
        {index, string ->
            Text(
                text = string,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .padding(start = 12.dp, top = 14.dp),
                textAlign = TextAlign.Center )
        }
    }
}