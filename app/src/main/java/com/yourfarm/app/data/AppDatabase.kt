package com.yourfarm.app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yourfarm.app.data.entity.*

@Database(
    entities = [
        ParentFlock::class,
        FeedBatch::class,
        VetEvent::class,
        MicroclimateSample::class,
        Consumption::class,
        EquipmentFailure::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun flockDao(): FlockDao
    abstract fun batchDao(): FeedBatchDao
    abstract fun vetDao(): VetEventDao
    abstract fun microDao(): MicroclimateDao
    abstract fun consumptionDao(): ConsumptionDao
    abstract fun failureDao(): EquipmentFailureDao
}
