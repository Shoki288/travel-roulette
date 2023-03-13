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
fun KyushuMap(
    modifier: Modifier = Modifier,
    onClick: ((Prefecture) -> Unit)? = null,
    prefectureClickable: Boolean = false
) {
    val clickable by remember { mutableStateOf(prefectureClickable) }

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            // 佐賀
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Saga) },
                prefecture = Prefecture.Saga,
                enabled = clickable
            )
            // 長崎
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Nagasaki) },
                prefecture = Prefecture.Nagasaki,
                enabled = clickable
            )
            // 福岡
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Hukuoka) },
                prefecture = Prefecture.Hukuoka,
                enabled = clickable
            )
        }

        Row(
            modifier = Modifier
                .height(IntrinsicSize.Min)
                .fillMaxWidth()
        ) {
            // 熊本
            PrefectureButton(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                onClick = { onClick?.invoke(Prefecture.Kumamoto) },
                prefecture = Prefecture.Kumamoto,
                enabled = clickable
            )

            Column(
                modifier = Modifier.weight(1f)
            ) {
                // 大分
                PrefectureButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { onClick?.invoke(Prefecture.Oita) },
                    prefecture = Prefecture.Oita,
                    enabled = clickable
                )
                // 宮崎
                PrefectureButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { onClick?.invoke(Prefecture.Miyazaki) },
                    prefecture = Prefecture.Miyazaki,
                    enabled = clickable
                )
            }
        }
        // 鹿児島
        PrefectureButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onClick?.invoke(Prefecture.Kagoshima) },
            prefecture = Prefecture.Kagoshima,
            enabled = clickable
        )
    }
}

@Preview
@Composable
private fun Preview() {
    KyushuMap()
}