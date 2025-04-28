package com.example.midtermproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.midtermproject.presentation.main.MainViewModel

@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainViewModel = hiltViewModel()
) {
    val hobby by viewModel.hobby.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadHobby()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        hobby?.let { hobbyData ->
            Image(
                painter = painterResource(id = hobbyData.imageResId),
                contentDescription = "Hobby Image",
                modifier = Modifier.size(200.dp)
            )

            Text(
                text = hobbyData.description,
                modifier = Modifier.padding(16.dp)
            )

            Button(onClick = { navController.navigate("details") }) {
                Text(text = "Подробнее")
            }
        }
    }
}
