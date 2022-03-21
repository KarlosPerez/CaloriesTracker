package com.karlosprojects.caloriestrackerapp.navigation

import androidx.navigation.NavController
import com.karlosprojects.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}