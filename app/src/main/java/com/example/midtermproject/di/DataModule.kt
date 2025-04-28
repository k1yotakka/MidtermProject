package com.example.midtermproject.di

import com.example.midtermproject.data.repository.HobbyRepositoryImpl
import com.example.midtermproject.domain.repository.HobbyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindHobbyRepository(
        hobbyRepositoryImpl: HobbyRepositoryImpl
    ): HobbyRepository
}
