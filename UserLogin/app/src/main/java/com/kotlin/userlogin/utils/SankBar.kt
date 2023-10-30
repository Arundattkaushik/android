package com.kotlin.userlogin.utils

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class SankBar {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "CoroutineCreationDuringComposition")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun snakBar(coroutineScope: CoroutineScope, message:String){
        val snackbarHostState = remember {
            SnackbarHostState()
        }

        Scaffold(snackbarHost = { SnackbarHost(hostState = snackbarHostState)}) {
                coroutineScope.launch {
                    snackbarHostState.showSnackbar(
                        message = "$message",
                        withDismissAction = true
                    ) }
        }
    }
}