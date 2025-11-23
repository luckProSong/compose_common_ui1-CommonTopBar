package com.example.commontopbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommonTopBar(
    title: String,
    onClickBack: (() -> Unit)? = null,
    onClickMenu: (() -> Unit)? = null
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .statusBarsPadding()
            .padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (onClickBack != null) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "뒤로가기",
                modifier = Modifier
                    .size(24.dp)
                    .clickable { onClickBack() }
            )
        } else {
            Spacer(modifier = Modifier.size(24.dp))
        }

        Text(
            text = title,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(1f)
        )

        if (onClickMenu != null) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "메뉴",
                modifier = Modifier
                    .size(24.dp)
                    .clickable { onClickMenu() }
            )
        } else {
            Spacer(modifier = Modifier.size(24.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CommonTopBarLeftPreview() {
    CommonTopBar(
        onClickBack = {},
        title = "타이틀",
    )
}

@Preview(showBackground = true)
@Composable
fun CommonTopBarTitlePreview() {
    CommonTopBar(
        title = "타이틀",
    )
}

@Preview(showBackground = true)
@Composable
fun CommonTopBarLeftAndRightPreview() {
    CommonTopBar(
        onClickBack = {},
        title = "타이틀",
        onClickMenu = {}
    )
}