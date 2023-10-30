package com.kotlin.userlogin.loginscreens

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.kotlin.userlogin.practice.TrackWickLogin

import com.kotlin.userlogin.ui.theme.UserLoginTheme
import com.kotlin.userlogin.utils.toast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface{
                   // Code Goes here
                    TrackWickLogin()

                }
            }
        }
    }
}

@Composable
fun hello(){
    Text(text = "Hello")
}