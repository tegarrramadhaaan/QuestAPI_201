package com.example.mydatasiswa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.mydatasiswa.navigasi.DataSiswaApp
import com.example.mydatasiswa.ui.theme.MyDataSiswaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            MyDataSiswaTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    DataSiswaApp()
                }
            }
        }
    }
}