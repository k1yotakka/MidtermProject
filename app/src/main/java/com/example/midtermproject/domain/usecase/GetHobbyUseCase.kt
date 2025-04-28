package com.example.midtermproject.domain.usecase

import com.example.midtermproject.domain.model.Hobby
import com.example.midtermproject.domain.repository.HobbyRepository

class GetHobbyUseCase(
    private val repository: HobbyRepository
) {
    suspend fun execute(): Hobby {
        return repository.getHobby()
    }
}
