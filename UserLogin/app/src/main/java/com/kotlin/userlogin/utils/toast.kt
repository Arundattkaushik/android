package com.kotlin.userlogin.utils

import android.content.Context
import android.widget.Toast

fun toast(context: Unit, message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}