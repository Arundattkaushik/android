package com.kotlin.toastandsnackbars

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kotlin.toastandsnackbars.commons.CommonSnackBar

import com.kotlin.toastandsnackbars.ui.theme.ToastAndSnackbarsTheme


class MainActivity : ComponentActivity() {
    val sankbar = CommonSnackBar()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            ToastAndSnackbarsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Your code goes here....
                    val scope = rememberCoroutineScope()
                    Button( onClick = {
                        commonSnack(coroutineScope = scope, message = "done calling")
                    }
                       ) {
                        Text(text = "Click Me!")
                    }
                   }
                }
            }
    }
}
