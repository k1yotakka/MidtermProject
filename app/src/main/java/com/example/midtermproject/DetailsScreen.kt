package com.example.midtermproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.midtermproject.presentation.details.DetailsUiIntent
import com.example.midtermproject.presentation.details.DetailsUiState
import com.example.midtermproject.presentation.details.DetailsViewModel

@Composable
fun DetailsScreen(
    navController: NavController,
    viewModel: DetailsViewModel = hiltViewModel()
) {
    val state by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.handleIntent(DetailsUiIntent.LoadDetails)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        when (state) {
            is DetailsUiState.Loading -> {
                CircularProgressIndicator()
            }
            is DetailsUiState.Success -> {
                val data = (state as DetailsUiState.Success)
                Text(
                    text = data.description,
                    modifier = Modifier.padding(16.dp)
                )
                Image(
                    painter = painterResource(id = data.imageResId),
                    contentDescription = "Dance Image",
                    modifier = Modifier.size(300.dp)
                )
            }
            is DetailsUiState.Error -> {
                Text(
                    text = (state as DetailsUiState.Error).message,
                    color = MaterialTheme.colorScheme.error
                )
            }
        }

        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Назад")
        }
    }
}
