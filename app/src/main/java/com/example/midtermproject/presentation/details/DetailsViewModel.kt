package com.example.midtermproject.presentation.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.midtermproject.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor() : ViewModel() {

    private val _uiState = MutableStateFlow<DetailsUiState>(DetailsUiState.Loading)
    val uiState: StateFlow<DetailsUiState> = _uiState

    fun handleIntent(intent: DetailsUiIntent) {
        when (intent) {
            is DetailsUiIntent.LoadDetails -> loadDetails()
        }
    }

    private fun loadDetails() {
        viewModelScope.launch {
            _uiState.value = DetailsUiState.Success(
                description = "Я занимаюсь хип-хоп танцами в студенческой организации Нархоза - GROW UP!",
                imageResId = R.drawable.dance_image
            )
        }
    }
}
