package com.example.compose.design

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.compose.vo.Prefecture

@Composable
fun PrefectureButton(
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    prefecture: Prefecture,
    textPadding: Dp = 4.dp
) {
    Box(
        modifier = modifier
            .border(
                border = ButtonDefaults.outlinedButtonBorder,
                shape = RoundedCornerShape(4.dp)
            ).background(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(4.dp)
            ).also {
                if (enabled) {
                    it.clickable { onClick() }
                }
            }
    ) {
        Text(
            modifier = Modifier
                .padding(textPadding)
                .align(Alignment.Center),
            text = prefecture.shortName,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun Prev() {
    PrefectureButton(
        onClick = {},
        prefecture = Prefecture.Hokkaido,
        enabled = true
    )
}