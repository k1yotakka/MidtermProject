package com.example.midtermproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.hobby_image),
            contentDescription = "Hobby Image",
            modifier = Modifier.size(200.dp)
        )

        Text(
            text = "Привет! Меня зовут Арман. У меня есть одно интересное хобби, жми подробнее снизу чтобы посмотреть",
            modifier = Modifier.padding(16.dp)
        )

        Button(onClick = { navController.navigate("details") }) {
            Text(text = "Подробнее")
        }
    }
}
