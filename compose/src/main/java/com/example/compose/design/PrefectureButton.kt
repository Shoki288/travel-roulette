package com.example.compose.design

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.vo.Prefecture

@Composable
fun PrefectureButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    prefecture: Prefecture,
    enabled: Boolean
) {
    Button(
        modifier = modifier
            .border(
                border = ButtonDefaults.outlinedButtonBorder,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(1.dp),
        onClick = onClick,
        enabled = enabled,
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = MaterialTheme.colorScheme.secondary,
            containerColor = MaterialTheme.colorScheme.background,
            disabledContentColor = MaterialTheme.colorScheme.secondary,
            disabledContainerColor = MaterialTheme.colorScheme.background,
        ),
        shape = RoundedCornerShape(4.dp),
    ) {
        Text(
            text = prefecture.shortName,
            textAlign = TextAlign.Center,
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