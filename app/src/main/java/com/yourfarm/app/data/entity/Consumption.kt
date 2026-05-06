package com.yourfarm.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "consumptions",
    foreignKeys = [ForeignKey(
        entity = ParentFlock::class,
        parentColumns = ["id"],
        childColumns = ["flockId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("flockId")]
)
data class Consumption(
    @PrimaryKey val id: String = java.util.UUID.randomUUID().toString(),
    val date: Long,
    val feedKg: Float? = null,
    val waterLiters: Float? = null,
    val flockId: String
)
