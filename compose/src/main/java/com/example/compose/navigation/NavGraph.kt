package com.example.compose.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.compose.screen.*
import com.example.compose.vo.Area
import com.example.compose.widget.JapanMapRoot

fun NavGraphBuilder.navigationGraph(navController: NavHostController) {
    composable(route = HomeDestination.route) {
        JapanMapRoot(
            onClickArea = {
                val route = when (it) {
                    Area.Tohoku -> TohokuMapDestination.route
                    Area.Kanto -> KantoMapDestination.route
                    Area.Chubu -> ChubuMapDestination.route
                    Area.Kansai -> KansaiMapDestination.route
                    Area.Chugoku -> ChugokuMapDestination.route
                    Area.Shikoku -> ShikokuMapDestination.route
                    Area.Kyushu -> KyushuMapDestination.route
                }
                navController.openScreen(route)
            }
        )
    }
    composable(route = ChubuMapDestination.route) {
        ChubuMapRoot()
    }
    composable(route = ChugokuMapDestination.route) {
        ChugokuMapRoot()
    }
    composable(route = KansaiMapDestination.route) {
        KansaiMapRoot()
    }
    composable(route = KantoMapDestination.route) {
        KantoMapRoot()
    }
    composable(route = KyushuMapDestination.route) {
        KyushuMapRoot()
    }
    composable(route = ShikokuMapDestination.route) {
        ShikokuMapRoot()
    }
    composable(route = TohokuMapDestination.route) {
        TohokuMapRoot()
    }
}

fun NavHostController.openScreen(root: String) {
    this.navigate(root) {
        popUpTo(this@openScreen.graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}