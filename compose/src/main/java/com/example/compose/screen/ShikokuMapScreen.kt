package com.example.compose.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.TravelRouletteComposeTheme
import com.example.compose.widget.ShikokuMap

@Composable
fun ShikokuMapRoot() {
    TravelRouletteComposeTheme {
        Box {
            ShikokuMap(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(64.dp)
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    ShikokuMapRoot()
}