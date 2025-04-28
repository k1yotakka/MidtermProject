package com.example.midtermproject.di

import com.example.midtermproject.domain.repository.HobbyRepository
import com.example.midtermproject.domain.usecase.GetHobbyUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun provideGetHobbyUseCase(repository: HobbyRepository): GetHobbyUseCase {
        return GetHobbyUseCase(repository)
    }
}
