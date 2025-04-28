package com.example.midtermproject.presentation.details

sealed class DetailsUiState {
    object Loading : DetailsUiState()
    data class Success(val description: String, val imageResId: Int) : DetailsUiState()
    data class Error(val message: String) : DetailsUiState()
}
