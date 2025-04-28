package com.example.midtermproject.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hobbies")
data class HobbyEntity(
    @PrimaryKey val id: Int,
    val description: String,
    val imageResId: Int
)
