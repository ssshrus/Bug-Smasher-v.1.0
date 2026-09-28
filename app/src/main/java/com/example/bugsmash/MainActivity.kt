package com.example.bugsmash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.bugsmash.navigation.GameNavigation
import com.example.bugsmash.ui.theme.BugSmasherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BugSmasherTheme {
                GameNavigation()
            }
        }
    }
}