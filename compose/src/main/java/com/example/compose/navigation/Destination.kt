package com.example.compose.navigation

interface Destination {
    val route: String
}

object HomeDestination : Destination {
    override val route: String = "home"
}

object ChubuMapDestination : Destination {
    override val route: String = "ChubuMap"
}

object ChugokuMapDestination : Destination {
    override val route: String = "ChugokuMap"
}

object KansaiMapDestination : Destination {
    override val route: String = "KansaiMap"
}

object KantoMapDestination : Destination {
    override val route: String = "KantoMap"
}

object KyushuMapDestination : Destination {
    override val route: String = "Kyushu"
}

object ShikokuMapDestination : Destination {
    override val route: String = "Shikoku"
}

object TohokuMapDestination : Destination {
    override val route: String = "Tohoku"
}