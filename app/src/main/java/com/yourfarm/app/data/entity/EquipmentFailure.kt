package com.yourfarm.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "equipment_failures",
    foreignKeys = [ForeignKey(
        entity = ParentFlock::class,
        parentColumns = ["id"],
        childColumns = ["flockId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("flockId")]
)
data class EquipmentFailure(
    @PrimaryKey val id: String = java.util.UUID.randomUUID().toString(),
    val equipmentName: String,
    val reportedAt: Long,
    val expectedRepairUntil: Long,
    val description: String? = null,
    val flockId: String
)
