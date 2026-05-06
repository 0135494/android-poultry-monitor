package com.yourfarm.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "parent_flocks")
data class ParentFlock(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val ageDays: Int,
    val diseaseHistory: String? = null,
    val vaccinations: String? = null,
    val outputRatePercent: Float? = null
)
