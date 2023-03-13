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
fun KansaiMap(
    onClick: ((Prefecture) -> Unit)? = null,
    prefectureClickable: Boolean = false
) {
    val clickable by remember { mutableStateOf(prefectureClickable) }

    Column {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            // 滋賀
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Shiga) },
                prefecture = Prefecture.Shiga,
                enabled = clickable
            )

            //  京都
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Kyoto) },
                prefecture = Prefecture.Kyoto,
                enabled = clickable
            )

            // 兵庫
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Hyogo) },
                prefecture = Prefecture.Hyogo,
                enabled = clickable
            )
        }

        Row {
            // 三重
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Mie) },
                prefecture = Prefecture.Mie,
                enabled = clickable
            )

            // 奈良
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Nara) },
                prefecture = Prefecture.Nara,
                enabled = clickable
            )

            // 大阪
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Osaka) },
                prefecture = Prefecture.Osaka,
                enabled = clickable
            )
        }

        // 和歌山
        PrefectureButton(
            modifier = Modifier.fillMaxWidth(0.67f),
            onClick = { onClick?.invoke(Prefecture.Wakayama) },
            prefecture = Prefecture.Wakayama,
            enabled = clickable
        )
    }
}

@Preview
@Composable
private fun Preview() {
    KansaiMap()
}