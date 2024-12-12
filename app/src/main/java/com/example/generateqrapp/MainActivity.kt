package com.example.generateqrapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyImage()
        }
    }
}

@Composable
fun MyImage() {
    AsyncImage(
        model = "https://upload.wikimedia.org/wikipedia/commons/d/dc/Young_cats.jpg",
        contentDescription = "Описание изображения"
    )
}
