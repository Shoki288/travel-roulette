package com.example.compose.widget

import androidx.compose.foundation.layout.Column
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
fun ChubuSideMap(
    modifier: Modifier = Modifier,
    onClick: ((Prefecture) -> Unit)? = null,
    prefectureClickable: Boolean = false
) {
    val clickable by remember { mutableStateOf(prefectureClickable) }

    Column(
        modifier = modifier
    ) {
        // 石川
        PrefectureButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onClick?.invoke(Prefecture.Ishikawa) },
            prefecture = Prefecture.Ishikawa,
            enabled = clickable
        )

        // 福井
        PrefectureButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { onClick?.invoke(Prefecture.Hukui) },
            prefecture = Prefecture.Hukui,
            enabled = clickable
        )
    }
}

@Preview
@Composable
private fun Preview() {
    ChubuSideMap()
}