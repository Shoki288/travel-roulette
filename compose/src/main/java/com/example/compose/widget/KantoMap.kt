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
fun KantoMap(
    modifier: Modifier = Modifier,
    onClick: ((Prefecture) -> Unit)? = null,
    prefectureClickable: Boolean = false
) {
    val clickable by remember { mutableStateOf(prefectureClickable) }

    Column {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            // 群馬
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Gunma) },
                prefecture = Prefecture.Gunma,
                enabled = clickable
            )

            // 栃木
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Tochigi) },
                prefecture = Prefecture.Tochigi,
                enabled = clickable
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            // 埼玉
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Saitama) },
                prefecture = Prefecture.Saitama,
                enabled = clickable
            )

            // 茨城
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Ibaraki) },
                prefecture = Prefecture.Ibaraki,
                enabled = clickable
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)
        ) {
            Column(
                modifier = Modifier.weight(1f),
            ) {
                // 東京
                PrefectureButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { onClick?.invoke(Prefecture.Tokyo) },
                    prefecture = Prefecture.Tokyo,
                    enabled = clickable
                )

                // 神奈川
                PrefectureButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { onClick?.invoke(Prefecture.Kanagawa) },
                    prefecture = Prefecture.Kanagawa,
                    enabled = clickable
                )
            }

            // 千葉
            PrefectureButton(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                onClick = { onClick?.invoke(Prefecture.Chiba) },
                prefecture = Prefecture.Chiba,
                enabled = clickable
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    KantoMap()
}