package com.example.travel_roulette.vo

sealed class SelectablePrefecture {

    data class Hokkaido(
        val isEnable: Boolean = false
    ) : SelectablePrefecture()

    data class Tohoku(
        val isAomori: Boolean = false,
        val isAkita: Boolean = false,
        val isIwate: Boolean = false,
        val isYamagata: Boolean = false,
        val isMiyagi: Boolean = false,
        val isHukushima: Boolean = false,
    ) : SelectablePrefecture()

    data class Kanto(
        val isGunma: Boolean = false,
        val isTochigi: Boolean = false,
        val isSaitama: Boolean = false,
        val isIbaraki: Boolean = false,
        val isTokyo: Boolean = false,
        val isChiba: Boolean = false,
        val isKanagawa: Boolean = false,
    ) : SelectablePrefecture()

    data class Chubu(
        val isNigata: Boolean = false,
        val isNagano: Boolean = false,
        val isYamanashi: Boolean = false,
        val isShizuoka: Boolean = false,
        val isToyama: Boolean = false,
        val isGihu: Boolean = false,
        val isAichi: Boolean = false,
        val isIshikawa: Boolean = false,
        val isHukui: Boolean = false,
    ) : SelectablePrefecture()

    data class Kansai(
        val isShiga: Boolean = false,
        val isMie: Boolean = false,
        val isKyoto: Boolean = false,
        val isNara: Boolean = false,
        val isHyogo: Boolean = false,
        val isOsaka: Boolean = false,
        val isWakayama: Boolean = false,
    ) : SelectablePrefecture()

    data class Chugoku(
        val isTottori: Boolean = false,
        val isOkayama: Boolean = false,
        val isShimane: Boolean = false,
        val isHiroshima: Boolean = false,
        val isYamaguchi: Boolean = false,
    ): SelectablePrefecture()

    data class Shikoku(
        val isKagawa: Boolean = false,
        val isTokushima: Boolean = false,
        val isEhime: Boolean = false,
        val isKochi: Boolean = false,
    ) : SelectablePrefecture()

    data class Kyushu(
        val isHukuoka: Boolean = false,
        val isNagasaki: Boolean = false,
        val isSaga: Boolean = false,
        val Oita: Boolean = false,
        val Miyazaki: Boolean = false,
        val Kumamoto: Boolean = false,
        val Kagoshima: Boolean = false,
    ) : SelectablePrefecture()

    data class Okinawa(
        val isEnable: Boolean = false,
    ) : SelectablePrefecture()
}