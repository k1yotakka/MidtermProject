package com.example.midtermproject.data.repository

import com.example.midtermproject.data.local.dao.HobbyDao
import com.example.midtermproject.data.local.entity.HobbyEntity
import com.example.midtermproject.domain.model.Hobby
import com.example.midtermproject.domain.repository.HobbyRepository
import javax.inject.Inject

class HobbyRepositoryImpl @Inject constructor(
    private val hobbyDao: HobbyDao
) : HobbyRepository {

    override suspend fun getHobby(): Hobby {
        val hobbyEntity = hobbyDao.getHobby()
        return if (hobbyEntity != null) {
            Hobby(
                id = hobbyEntity.id,
                description = hobbyEntity.description,
                imageResId = hobbyEntity.imageResId
            )
        } else {
            val defaultHobby = Hobby(
                id = 1,
                description = "Я занимаюсь хип-хоп танцами в студенческой организации Нархоза - GROW UP!",
                imageResId = com.example.midtermproject.R.drawable.dance_image
            )
            saveDefaultHobby(defaultHobby)
            defaultHobby
        }
    }

    private suspend fun saveDefaultHobby(hobby: Hobby) {
        val entity = HobbyEntity(
            id = hobby.id,
            description = hobby.description,
            imageResId = hobby.imageResId
        )
        hobbyDao.insertHobby(entity)
    }
}
