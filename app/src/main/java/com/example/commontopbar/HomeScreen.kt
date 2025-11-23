package com.example.commontopbar

import android.app.Activity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun HomeScreen(onNavigateTotA: () -> Unit) {
    val context = LocalContext.current

    Column {
        CommonTopBar(
            title = "화면 Home",
            onClickBack = { (context as? Activity)?.finish() },
            onClickMenu = {}
        )

        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = onNavigateTotA) {
                Text("A 화면으로 이동")
            }
        }
    }
}