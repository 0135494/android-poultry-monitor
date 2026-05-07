package com.yourfarm.app.data.dao

import androidx.room.*
import com.yourfarm.app.data.entity.Consumption

@Dao
interface ConsumptionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFlock(flock: Consumption)

    @Query("SELECT * FROM Consumption WHERE id = :id")
    suspend fun get Consumption(id: String): Consumption?

    @Query("SELECT * FROM Consumption")
    suspend fun getAllFlocks(): List<Consumption>
}
