package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.compose.navigation.HomeDestination
import com.example.compose.navigation.navigationGraph
import com.example.compose.ui.theme.TravelRouletteComposeTheme
import com.example.compose.widget.JapanMapRoot

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            TravelRouletteComposeTheme {
                NavHost(
                    navController = navController,
                    startDestination = HomeDestination.route
                ) {
                    navigationGraph(navController)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    TravelRouletteComposeTheme {
        JapanMapRoot {}
    }
}