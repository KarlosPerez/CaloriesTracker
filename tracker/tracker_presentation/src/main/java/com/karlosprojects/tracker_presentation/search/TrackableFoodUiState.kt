package com.karlosprojects.tracker_presentation.search

import com.karlosprojects.tracker_domain.model.TrackableFood

data class TrackableFoodUiState(
    val food: TrackableFood,
    val isExpanded: Boolean = false,
    val amount: String = ""
)
