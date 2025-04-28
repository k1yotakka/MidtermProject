package com.example.midtermproject.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.midtermproject.domain.usecase.GetHobbyUseCase
import com.example.midtermproject.domain.model.Hobby
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getHobbyUseCase: GetHobbyUseCase
) : ViewModel() {

    private val _hobby = MutableStateFlow<Hobby?>(null)
    val hobby: StateFlow<Hobby?> = _hobby

    fun loadHobby() {
        viewModelScope.launch {
            _hobby.value = getHobbyUseCase.execute()
        }
    }
}
