package com.example.commontopbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun AScreen(
    navController: NavController,
    onNavigateToB: () -> Unit
) {
    Column {
        CommonTopBar(
            title = "화면 A",
            onClickBack = { navController.popBackStack() }
        )

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = onNavigateToB) {
                Text("B 화면으로 이동")
            }
        }
    }
}