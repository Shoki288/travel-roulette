package com.example.travel_roulette.vo

sealed class PrefectureState(open val prefecture: Prefecture) {
    data class None(override val prefecture: Prefecture) : PrefectureState(prefecture)
    data class UnSelectable(override val prefecture: Prefecture) : PrefectureState(prefecture)
    data class Select(override val prefecture: Prefecture) : PrefectureState(prefecture)

    fun changeState() = None(prefecture).takeIf { this is UnSelectable } ?: UnSelectable(prefecture)

    fun selectPrefecture() = Select(prefecture)

    companion object {
        val allPrefecture = listOf(
            None(Prefecture.Hokkaido),
            None(Prefecture.Aomori),
            None(Prefecture.Akita),
            None(Prefecture.Iwate),
            None(Prefecture.Yamagata),
            None(Prefecture.Miyagi),
            None(Prefecture.Hukushima),
            None(Prefecture.Gunma),
            None(Prefecture.Tochigi),
            None(Prefecture.Saitama),
            None(Prefecture.Ibaraki),
            None(Prefecture.Tokyo),
            None(Prefecture.Chiba),
            None(Prefecture.Kanagawa),
            None(Prefecture.Nigata),
            None(Prefecture.Nagano),
            None(Prefecture.Yamanashi),
            None(Prefecture.Shizuoka),
            None(Prefecture.Toyama),
            None(Prefecture.Gihu),
            None(Prefecture.Aichi),
            None(Prefecture.Ishikawa),
            None(Prefecture.Hukui),
            None(Prefecture.Shiga),
            None(Prefecture.Mie),
            None(Prefecture.Kyoto),
            None(Prefecture.Nara),
            None(Prefecture.Hyogo),
            None(Prefecture.Osaka),
            None(Prefecture.Wakayama),
            None(Prefecture.Tottori),
            None(Prefecture.Okayama),
            None(Prefecture.Shimane),
            None(Prefecture.Hiroshima),
            None(Prefecture.Yamaguchi),
            None(Prefecture.Kagawa),
            None(Prefecture.Tokushima),
            None(Prefecture.Ehime),
            None(Prefecture.Kochi),
            None(Prefecture.Hukuoka),
            None(Prefecture.Nagasaki),
            None(Prefecture.Saga),
            None(Prefecture.Oita),
            None(Prefecture.Miyazaki),
            None(Prefecture.Kumamoto),
            None(Prefecture.Kagoshima),
            None(Prefecture.Okinawa)
        )
    }
}

enum class Area {
    Tohoku,
    Kanto,
    Chubu,
    Kansai,
    Chugoku,
    Shikoku,
    Kyushu
}

enum class Prefecture(val prefectureName: String) {
    Hokkaido(prefectureName = "?????????"),
    Aomori(prefectureName = "?????????"),
    Akita(prefectureName = "?????????"),
    Iwate(prefectureName = "?????????"),
    Yamagata(prefectureName = "?????????"),
    Miyagi(prefectureName = "?????????"),
    Hukushima(prefectureName = "?????????"),
    Gunma(prefectureName = "?????????"),
    Tochigi(prefectureName = "?????????"),
    Saitama(prefectureName = "?????????"),
    Ibaraki(prefectureName = "?????????"),
    Tokyo(prefectureName = "?????????"),
    Chiba(prefectureName = "?????????"),
    Kanagawa(prefectureName = "????????????"),
    Nigata(prefectureName = "?????????"),
    Nagano(prefectureName = "?????????"),
    Yamanashi(prefectureName = "?????????"),
    Shizuoka(prefectureName = "?????????"),
    Toyama(prefectureName = "?????????"),
    Gihu(prefectureName = "?????????"),
    Aichi(prefectureName = "?????????"),
    Ishikawa(prefectureName = "?????????"),
    Hukui(prefectureName = "?????????"),
    Shiga(prefectureName = "?????????"),
    Mie(prefectureName = "?????????"),
    Kyoto(prefectureName = "?????????"),
    Nara(prefectureName = "?????????"),
    Hyogo(prefectureName = "?????????"),
    Osaka(prefectureName = "?????????"),
    Wakayama(prefectureName = "????????????"),
    Tottori(prefectureName = "?????????"),
    Okayama(prefectureName = "?????????"),
    Shimane(prefectureName = "?????????"),
    Hiroshima(prefectureName = "?????????"),
    Yamaguchi(prefectureName = "?????????"),
    Kagawa(prefectureName = "?????????"),
    Tokushima(prefectureName = "?????????"),
    Ehime(prefectureName = "?????????"),
    Kochi(prefectureName = "?????????"),
    Hukuoka(prefectureName = "?????????"),
    Nagasaki(prefectureName = "?????????"),
    Saga(prefectureName = "?????????"),
    Oita(prefectureName = "?????????"),
    Miyazaki(prefectureName = "?????????"),
    Kumamoto(prefectureName = "?????????"),
    Kagoshima(prefectureName = "????????????"),
    Okinawa(prefectureName = "?????????"),
}