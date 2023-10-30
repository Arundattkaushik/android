package com.kotlin.userlogin.loginscreens



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun Test(){

   Box(modifier = Modifier
      .background(Color.Cyan)
      .fillMaxHeight()
      .fillMaxWidth())
   {
      Text(text = "Parent Text ....", modifier = Modifier.offset(50.dp, 40.dp))
      Box(modifier = Modifier
         .background(Color.Green)
         .width(300.dp)
         .height(400.dp)
         .align(alignment = Alignment.Center)
         .padding(18.dp))
         {
             Text(text = "child Text.")
         }
   }
}