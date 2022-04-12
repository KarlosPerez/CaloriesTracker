package com.karlosprojects.tracker_domain.use_case

import com.karlosprojects.tracker_domain.model.TrackedFood
import com.karlosprojects.tracker_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

class GetFoodForDate(
    private val repository: TrackerRepository
) {

    operator fun invoke(
        date: LocalDate
    ): Flow<List<TrackedFood>> {
        return repository.getFoodsForDate(date)
    }
}