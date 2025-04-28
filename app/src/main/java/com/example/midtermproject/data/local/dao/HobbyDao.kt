package com.example.midtermproject.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.midtermproject.data.local.entity.HobbyEntity

@Dao
interface HobbyDao {

    @Query("SELECT * FROM hobbies LIMIT 1")
    suspend fun getHobby(): HobbyEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHobby(hobby: HobbyEntity)
}
