package com.yourfarm.app.data.dao

import androidx.room.*
import com.yourfarm.app.data.entity.Microclimate

@Dao
interface MicroclimateDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFlock(flock: Microclimate)

    @Query("SELECT * FROM Microclimate WHERE id = :id")
    suspend fun getFlock(id: String): Microclimate?

    @Query("SELECT * FROM Microclimate")
    suspend fun getAllFlocks(): List<Microclimate>
}
