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
fun ChubuMap(
    modifier: Modifier = Modifier,
    onClick: ((Prefecture) -> Unit)? = null,
    prefectureClickable: Boolean = false
) {
    val clickable by remember { mutableStateOf(prefectureClickable) }

    Column(
        modifier = modifier.fillMaxWidth()
    ) {

        Row {
            // 富山
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Toyama) },
                prefecture = Prefecture.Toyama,
                enabled = clickable
            )

            // 新潟
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Nigata) },
                prefecture = Prefecture.Nigata,
                enabled = clickable
            )
        }

        Row {
            // 岐阜
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Gihu) },
                prefecture = Prefecture.Gihu,
                enabled = clickable
            )

            // 長野
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Nagano) },
                prefecture = Prefecture.Nagano,
                enabled = clickable
            )
        }

        Row {
            // 愛知
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Aichi) },
                prefecture = Prefecture.Aichi,
                enabled = clickable
            )

            // 山梨
            PrefectureButton(
                modifier = Modifier.weight(1f),
                onClick = { onClick?.invoke(Prefecture.Yamanashi) },
                prefecture = Prefecture.Yamanashi,
                enabled = clickable
            )
        }

        // 静岡
        PrefectureButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onClick?.invoke(Prefecture.Shizuoka) },
            prefecture = Prefecture.Shizuoka,
            enabled = clickable
        )
    }

}

@Preview
@Composable
private fun Preview() {
    ChubuMap()
}