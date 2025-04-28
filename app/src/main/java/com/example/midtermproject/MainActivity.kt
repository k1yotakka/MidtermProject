package com.example.midtermproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.midtermproject.presentation.navigation.AppNavigation
import com.example.midtermproject.ui.theme.MidtermProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MidtermProjectTheme {
                AppNavigation()
            }
        }
    }
}
