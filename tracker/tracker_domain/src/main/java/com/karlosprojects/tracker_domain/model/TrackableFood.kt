package com.karlosprojects.tracker_domain.model

data class TrackableFood(
    val name: String,
    val image: String?,
    val caloriesPer100g: Int,
    val carbsPer100g: Int,
    val proteinPer100g: Int,
    val fat100g: Int
)
