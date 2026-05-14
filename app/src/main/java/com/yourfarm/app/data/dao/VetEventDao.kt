package com.yourfarm.app.data.dao

import androidx.room.*
import com.yourfarm.app.data.entity.VetEvent

@Dao
interface VetEventDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFlock(flock: VetEvent)

    @Query("SELECT * FROM parent_flocks WHERE id = :id")
    suspend fun getFlock(id: String): VetEvent?

    @Query("SELECT * FROM parent_flocks")
    suspend fun getAllFlocks(): List<VetEvent>
}
