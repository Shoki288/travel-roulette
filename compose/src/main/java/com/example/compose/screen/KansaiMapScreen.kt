package com.example.compose.screen

import androidx.compose.runtime.Composable
import com.example.compose.ui.theme.TravelRouletteComposeTheme
import com.example.compose.widget.KansaiMap

@Composable
fun KansaiMapRoot() {
    TravelRouletteComposeTheme {
        KansaiMap()
    }
}