package com.yourfarm.app.repo

import com.yourfarm.app.data.AppDatabase
import com.yourfarm.app.data.entity.ParentFlock

class PoultryRepository(private val db: AppDatabase) {
    suspend fun addFlock(flock: ParentFlock) = db.flockDao().insertFlock(flock)
    suspend fun listFlocks() = db.flockDao().getAllFlocks()
}
