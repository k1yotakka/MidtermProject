package com.example.midtermproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Я занимаюсь хип-хоп танцами в студенческой организации Нархоза - GROW UP!",
            modifier = Modifier.padding(16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.dance_image),
            contentDescription = "Dance Image",
            modifier = Modifier.size(300.dp)
        )

        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Назад")
        }
    }
}
