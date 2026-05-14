package com.yourfarm.app.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yourfarm.app.data.entity.ParentFlock
import com.yourfarm.app.repo.PoultryRepository
import kotlinx.coroutines.launch

class FlockViewModel(private val repo: PoultryRepository) : ViewModel() {
    fun createFlock(days: Int, rate: Float?) {
        val flock = ParentFlock(ageDays = days, outputRatePercent = rate)
        viewModelScope.launch {
            repo.addFlock(flock)
        }
    }
}
