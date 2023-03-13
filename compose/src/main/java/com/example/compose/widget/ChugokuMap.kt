package com.example.compose.widget

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.design.PrefectureButton
import com.example.compose.vo.Prefecture

@Composable
fun ChugokuMap(
    modifier: Modifier = Modifier,
    onClick: ((Prefecture) -> Unit)? = null,
    prefectureClickable: Boolean = false
) {
    val clickable by remember { mutableStateOf(prefectureClickable) }

    Row(
        modifier = modifier
            .height(IntrinsicSize.Min)
            .fillMaxWidth()
    ) {
        // 山口
        PrefectureButton(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f),
            onClick = { onClick?.invoke(Prefecture.Yamaguchi) },
            prefecture = Prefecture.Yamaguchi,
            enabled = clickable
        )

        Column(
            modifier = Modifier.weight(1f)
        ) {
            // 鳥取
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Tottori) },
                prefecture = Prefecture.Tottori,
                enabled = clickable
            )
            // 広島
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Hiroshima) },
                prefecture = Prefecture.Hiroshima,
                enabled = clickable
            )
        }

        Column(
            modifier = Modifier.weight(1f)
        ) {
            // 島根
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Shimane) },
                prefecture = Prefecture.Shimane,
                enabled = clickable
            )
            // 岡山
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Okayama) },
                prefecture = Prefecture.Okayama,
                enabled = clickable
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    ChugokuMap()
}