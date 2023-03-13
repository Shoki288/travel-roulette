package com.example.compose.widget

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.design.PrefectureButton
import com.example.compose.ui.theme.TravelRouletteComposeTheme
import com.example.compose.vo.Prefecture

@Composable
fun TohokuMap(
    modifier: Modifier = Modifier,
    onClick: ((Prefecture) -> Unit)? = null,
    prefectureClickable: Boolean = false
) {
    val clickable by remember { mutableStateOf(prefectureClickable) }

    Column(
        modifier = modifier
    ) {
        // 青森県
        PrefectureButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onClick?.invoke(Prefecture.Aomori) },
            prefecture = Prefecture.Aomori,
            enabled = clickable
        )

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            // 秋田県
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Akita) },
                prefecture = Prefecture.Akita,
                enabled = clickable
            )

            // 岩手県
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Iwate) },
                prefecture = Prefecture.Iwate,
                enabled = clickable
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            // 山形県
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Yamagata) },
                prefecture = Prefecture.Yamagata,
                enabled = clickable
            )

            // 宮城県
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Miyagi) },
                prefecture = Prefecture.Miyagi,
                enabled = clickable
            )
        }

        // 福島県
        PrefectureButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onClick?.invoke(Prefecture.Hukushima) },
            prefecture = Prefecture.Hukushima,
            enabled = clickable
        )
    }
}

@Preview
@Composable
private fun Preview() {
    TravelRouletteComposeTheme {
        TohokuMap()
    }
}