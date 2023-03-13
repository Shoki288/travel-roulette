package com.example.compose.vo

enum class Area {
    Tohoku,
    Kanto,
    Chubu,
    Kansai,
    Chugoku,
    Shikoku,
    Kyushu
}

enum class Prefecture(val shortName: String, val label: String) {
    Hokkaido(shortName = "北海道", label = "北海道"),
    Aomori(shortName = "青森", label = "青森県"),
    Akita(shortName = "秋田", label = "秋田県"),
    Iwate(shortName = "岩手", label = "岩手県"),
    Yamagata(shortName = "山形", label = "山形県"),
    Miyagi(shortName = "宮城", label = "宮城県"),
    Hukushima(shortName = "福島", label = "福島県"),
    Gunma(shortName = "群馬", label = "群馬県"),
    Tochigi(shortName = "栃木", label = "栃木県"),
    Saitama(shortName = "埼玉", label = "埼玉県"),
    Ibaraki(shortName = "茨城", label = "茨城県"),
    Tokyo(shortName = "東京", label = "東京都"),
    Chiba(shortName = "千葉", label = "千葉県"),
    Kanagawa(shortName = "神奈川", label = "神奈川県"),
    Nigata(shortName = "新潟", label = "新潟県"),
    Nagano(shortName = "長野", label = "長野県"),
    Yamanashi(shortName = "山梨", label = "山梨県"),
    Shizuoka(shortName = "静岡", label = "静岡県"),
    Toyama(shortName = "富山", label = "富山県"),
    Gihu(shortName = "岐阜", label = "岐阜県"),
    Aichi(shortName = "愛知", label = "愛知県"),
    Ishikawa(shortName = "石川", label = "石川県"),
    Hukui(shortName = "福井", label = "福井県"),
    Shiga(shortName = "滋賀", label = "滋賀県"),
    Mie(shortName = "三重", label = "三重県"),
    Kyoto(shortName = "京都", label = "京都府"),
    Nara(shortName = "奈良", label = "奈良県"),
    Hyogo(shortName = "兵庫", label = "兵庫県"),
    Osaka(shortName = "大阪", label = "大阪府"),
    Wakayama(shortName = "和歌山", label = "和歌山県"),
    Tottori(shortName = "鳥取", label = "鳥取県"),
    Okayama(shortName = "岡山", label = "岡山県"),
    Shimane(shortName = "島根", label = "島根県"),
    Hiroshima(shortName = "広島", label = "広島県"),
    Yamaguchi(shortName = "山口", label = "山口県"),
    Kagawa(shortName = "香川", label = "香川県"),
    Tokushima(shortName = "徳島", label = "徳島県"),
    Ehime(shortName = "愛媛", label = "愛媛県"),
    Kochi(shortName = "高知", label = "高知県"),
    Hukuoka(shortName = "福岡", label = "福岡県"),
    Nagasaki(shortName = "長崎", label = "長崎県"),
    Saga(shortName = "佐賀", label = "佐賀県"),
    Oita(shortName = "大分", label = "大分県"),
    Miyazaki(shortName = "宮崎", label = "宮崎県"),
    Kumamoto(shortName = "熊本", label = "熊本県"),
    Kagoshima(shortName = "鹿児島", label = "鹿児島県"),
    Okinawa(shortName = "沖縄", label = "沖縄県"),
}