package com.example.commontopbar

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun BScreen() {
    Column {
        CommonTopBar(
            title = "화면 B"
        )
    }
}