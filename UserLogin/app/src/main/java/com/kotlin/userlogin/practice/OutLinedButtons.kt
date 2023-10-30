package com.kotlin.userlogin.practice

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class OutLinedButtons {
    @Composable
    fun outLinedButtons(title:String){

        OutlinedButton(
            onClick = { /*TODO*/ }
            , modifier = Modifier
                .fillMaxWidth()
                .padding(start = 45.dp, end = 45.dp)) {
            Text(text = "$title")
        }

    }
}