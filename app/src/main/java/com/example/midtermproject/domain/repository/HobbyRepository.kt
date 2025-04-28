package com.example.midtermproject.domain.repository

import com.example.midtermproject.domain.model.Hobby

interface HobbyRepository {
    suspend fun getHobby(): Hobby
}
