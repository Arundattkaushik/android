package com.kotlin.userlogin.practice

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kotlin.userlogin.utils.SankBar
import com.kotlin.userlogin.utils.toast

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TrackWickLogin(){
    val snakbar = SankBar()
    val scope = rememberCoroutineScope()
    var button = OutLinedButtons()

    Surface {
        var username by remember {
            mutableStateOf("")
        }

        var password by remember {
            mutableStateOf("")
        }

        Column(modifier = Modifier
            .fillMaxSize())
        {
            Spacer(modifier = Modifier.height(140.dp))
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopCenter)

            {
                Box(modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight(0.4f)
                    .background(Color.White),
                    contentAlignment = Alignment.TopCenter)
                {

                    Column {


                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Text(text = "LOGIN", fontSize = 20.sp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 30.dp, end = 10.dp),
                                textAlign = TextAlign.Center
                            )
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        OutlinedTextField(value = username, onValueChange = {username = it},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 8.dp, end = 8.dp),

                            label = {
                                Text(text = "Username")
                            },
                            leadingIcon = {
                                Icon(Icons.Default.Person, contentDescription = null )
                            },
                            placeholder = {
                                Text(text = "Enter username or mobile")
                            }
                        )

                        Spacer(modifier = Modifier.height(18.dp))

                        OutlinedTextField(value = password, onValueChange = {password = it},
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 8.dp, end = 8.dp),
                            leadingIcon = {
                                Icon(Icons.Default.Info, contentDescription = null )
                            },
                            label = {
                                Text(text = "Password")
                            },
                            placeholder = {
                                Text(text = "Enter user password")
                            })

                        Spacer(modifier = Modifier.height(18.dp))

                        Row (modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp),
                            horizontalArrangement = Arrangement.Center) {
                            Button(onClick = {
                                    if (username=="arun"&&password=="123456"){
                                      toast(, "Logged In SuccessFull")
                                    }
                                    else{

                                    }
                                })
                            {
                                Text(text = "LOGIN")

                            }
                        }

                    }
                }

            }

            Spacer(modifier = Modifier.height(25.dp))
            button.outLinedButtons("Login with OTP")
            Spacer(modifier = Modifier.height(25.dp))
            button.outLinedButtons("Microsoft 365")
            Spacer(modifier = Modifier.height(25.dp))
            button.outLinedButtons("Google")
        }
    }
}