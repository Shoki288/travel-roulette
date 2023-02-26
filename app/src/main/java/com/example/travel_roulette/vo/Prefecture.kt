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
    Hokkaido(prefectureName = "北海道"),
    Aomori(prefectureName = "青森県"),
    Akita(prefectureName = "秋田県"),
    Iwate(prefectureName = "岩手県"),
    Yamagata(prefectureName = "山形県"),
    Miyagi(prefectureName = "宮城県"),
    Hukushima(prefectureName = "福島県"),
    Gunma(prefectureName = "群馬県"),
    Tochigi(prefectureName = "栃木県"),
    Saitama(prefectureName = "埼玉県"),
    Ibaraki(prefectureName = "茨城県"),
    Tokyo(prefectureName = "東京都"),
    Chiba(prefectureName = "千葉県"),
    Kanagawa(prefectureName = "神奈川県"),
    Nigata(prefectureName = "新潟県"),
    Nagano(prefectureName = "長野県"),
    Yamanashi(prefectureName = "山梨県"),
    Shizuoka(prefectureName = "静岡県"),
    Toyama(prefectureName = "富山県"),
    Gihu(prefectureName = "岐阜県"),
    Aichi(prefectureName = "愛知県"),
    Ishikawa(prefectureName = "石川県"),
    Hukui(prefectureName = "福井県"),
    Shiga(prefectureName = "滋賀県"),
    Mie(prefectureName = "三重県"),
    Kyoto(prefectureName = "京都府"),
    Nara(prefectureName = "奈良県"),
    Hyogo(prefectureName = "兵庫県"),
    Osaka(prefectureName = "大阪府"),
    Wakayama(prefectureName = "和歌山県"),
    Tottori(prefectureName = "鳥取県"),
    Okayama(prefectureName = "岡山県"),
    Shimane(prefectureName = "島根県"),
    Hiroshima(prefectureName = "広島県"),
    Yamaguchi(prefectureName = "山口県"),
    Kagawa(prefectureName = "香川県"),
    Tokushima(prefectureName = "徳島県"),
    Ehime(prefectureName = "愛媛県"),
    Kochi(prefectureName = "高知県"),
    Hukuoka(prefectureName = "福岡県"),
    Nagasaki(prefectureName = "長崎県"),
    Saga(prefectureName = "佐賀県"),
    Oita(prefectureName = "大分県"),
    Miyazaki(prefectureName = "宮崎県"),
    Kumamoto(prefectureName = "熊本県"),
    Kagoshima(prefectureName = "鹿児島県"),
    Okinawa(prefectureName = "沖縄県"),
}