package com.example.midtermproject.di

import android.content.Context
import androidx.room.Room
import com.example.midtermproject.data.local.dao.HobbyDao
import com.example.midtermproject.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import dagger.hilt.android.qualifiers.ApplicationContext


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "hobby_database"
        ).build()
    }


    @Provides
    fun provideHobbyDao(appDatabase: AppDatabase): HobbyDao {
        return appDatabase.hobbyDao()
    }
}
