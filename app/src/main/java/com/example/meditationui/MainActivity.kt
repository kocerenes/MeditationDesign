package com.example.meditationui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.meditationui.presentation.screens.home.HomeScreen
import com.example.meditationui.presentation.ui.theme.MeditationUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUITheme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
            }
        }
    }
}
