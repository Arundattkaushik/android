package com.kotlin.userlogin.loginscreens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun UserLoginScreen(){
    var userName by remember {
        mutableStateOf("")
    }

    var passWord by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello Again !",
            fontSize = 25.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )

        Text(text = "Sign In To Continue",
            fontSize = 15.sp,
            color = Color.Blue,
            fontWeight = FontWeight.SemiBold
        )

        OutlinedTextField(value = userName, onValueChange = {userName=it},
            leadingIcon = {
                          Icon(Icons.Default.Person, contentDescription = null)
            },
            label = {
                Text(text = "Username")
            },
            placeholder = {
                Text(text = "Enter Username")
            }
            )

        OutlinedTextField(value = passWord, onValueChange = {passWord=it},
           leadingIcon = {
               Icon(Icons.Default.Info, contentDescription = null)
           },
            label = {
                Text(text = "Password")
            },
            placeholder = {
                Text(text = "Enter Password")
            })

        OutlinedButton(onClick = {
            println(userName+""+passWord)
        }) {
            Text(text = "Login")
        }
    }
}