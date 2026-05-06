package com.yourfarm.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "microclimate_samples",
    foreignKeys = [ForeignKey(
        entity = ParentFlock::class,
        parentColumns = ["id"],
        childColumns = ["flockId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("flockId")]
)
data class MicroclimateSample(
    @PrimaryKey val id: String = java.util.UUID.randomUUID().toString(),
    val timestamp: Long,
    val temperatureC: Float,
    val humidityPct: Float,
    val co2Ppm: Float,
    val ventilationPct: Float? = null,
    val flockId: String
)
