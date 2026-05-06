package com.yourfarm.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "vet_events",
    foreignKeys = [ForeignKey(
        entity = ParentFlock::class,
        parentColumns = ["id"],
        childColumns = ["flockId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("flockId")]
)
data class VetEvent(
    @PrimaryKey val id: String = java.util.UUID.randomUUID().toString(),
    val eventDate: Long,
    val vaccination: String? = null,
    val disease: String? = null,
    val medication: String? = null,
    val flockId: String
)
