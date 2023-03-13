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
import com.example.compose.vo.Prefecture

@Composable
fun ShikokuMap(
    modifier: Modifier = Modifier,
    onClick: ((Prefecture) -> Unit)? = null,
    prefectureClickable: Boolean = false
) {
    val clickable by remember { mutableStateOf(prefectureClickable) }

    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            // 愛媛
            PrefectureButton(
                onClick = { onClick?.invoke(Prefecture.Ehime) },
                prefecture = Prefecture.Ehime,
                enabled = clickable
            )
            // 高知
            PrefectureButton(
                onClick = { onClick?.invoke(Prefecture.Kochi) },
                prefecture = Prefecture.Kochi,
                enabled = clickable
            )
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            // 香川
            PrefectureButton(
                onClick = { onClick?.invoke(Prefecture.Kagawa) },
                prefecture = Prefecture.Kagawa,
                enabled = clickable
            )
            // 徳島
            PrefectureButton(
                onClick = { onClick?.invoke(Prefecture.Tokushima) },
                prefecture = Prefecture.Tokushima,
                enabled = clickable
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    ShikokuMap()
}