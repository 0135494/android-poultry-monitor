package com.yourfarm.app.data.dao

import androidx.room.*
import com.yourfarm.app.data.entity.ParentFlock

@Dao
interface FlockDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFlock(flock: ParentFlock)

    @Query("SELECT * FROM parent_flocks WHERE id = :id")
    suspend fun getFlock(id: String): ParentFlock?

    @Query("SELECT * FROM parent_flocks")
    suspend fun getAllFlocks(): List<ParentFlock>
}
