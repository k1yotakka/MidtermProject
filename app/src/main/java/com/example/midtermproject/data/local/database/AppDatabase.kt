package com.example.midtermproject.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.midtermproject.data.local.dao.HobbyDao
import com.example.midtermproject.data.local.entity.HobbyEntity

@Database(entities = [HobbyEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun hobbyDao(): HobbyDao
}
