package com.karlosprojects.caloriestrackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.karlosprojects.caloriestrackerapp.ui.theme.CaloriesTrackerAppTheme
import com.karlosprojects.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloriesTrackerAppTheme {
                WelcomeScreen()
            }
        }
    }
}