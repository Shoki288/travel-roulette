package com.example.travel_roulette

import androidx.lifecycle.ViewModel
import com.example.travel_roulette.vo.SelectablePrefecture
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {
    private val _isHokkaidoSelects = MutableStateFlow(SelectablePrefecture.Hokkaido())
    val isHokkaidoSelects = _isHokkaidoSelects.asStateFlow()

    private val _isTohokuSelects = MutableStateFlow(SelectablePrefecture.Tohoku())
    val isTohokuSelects = _isTohokuSelects.asStateFlow()

    private val _isKantoSelects = MutableStateFlow(SelectablePrefecture.Kanto())
    val isKantoSelects = _isKantoSelects.asStateFlow()

    private val _isChubuSelects = MutableStateFlow(SelectablePrefecture.Chubu())
    val isChubuSelects = _isChubuSelects.asStateFlow()

    private val _isKansaiSelects = MutableStateFlow(SelectablePrefecture.Kansai())
    val isKansaiSelects = _isKansaiSelects.asStateFlow()

    private val _isChugokuSelects = MutableStateFlow(SelectablePrefecture.Chugoku())
    val isChugokuSelects = _isChugokuSelects.asStateFlow()

    private val _isShikokuSelects = MutableStateFlow(SelectablePrefecture.Shikoku())
    val isShikokuSelects = _isShikokuSelects.asStateFlow()

    private val _isKyushuSelects = MutableStateFlow(SelectablePrefecture.Kyushu())
    val isKyushuSelects = _isKyushuSelects.asStateFlow()

    private val _isOkinawaSelects = MutableStateFlow(SelectablePrefecture.Okinawa())
    val isOkinawaSelects = _isOkinawaSelects.asStateFlow()

    fun onClickHokkaido() : Boolean {
        _isHokkaidoSelects.update {
            it.copy(isEnable = it.isEnable.not())
        }
        return true
    }

    fun onClickTohoku(index: Int) : Boolean {
        if (index !in 1..6) throw IllegalArgumentException("1から6の数字を渡してください")
        _isTohokuSelects.update {
            when (index) {
                1 -> it.copy(isAomori = it.isAomori.not())
                2 -> it.copy(isAkita = it.isAkita.not())
                3 -> it.copy(isAkita = it.isIwate.not())
                4 -> it.copy(isYamagata = it.isYamagata.not())
                5 -> it.copy(isMiyagi = it.isMiyagi.not())
                else -> it.copy(isHukushima = it.isHukushima.not())
            }
        }
        return true
    }

    fun onClickKanto(index: Int) : Boolean {
        if (index !in 7..13) throw IllegalArgumentException("7から13の数字を渡してください")
        _isKantoSelects.update {
            when (index) {
                7 -> it.copy(isGunma = it.isGunma.not())
                8 -> it.copy(isTochigi = it.isTochigi.not())
                9 -> it.copy(isSaitama = it.isSaitama.not())
                10 -> it.copy(isIbaraki = it.isIbaraki.not())
                11 -> it.copy(isTokyo = it.isTokyo.not())
                12 -> it.copy(isChiba = it.isChiba.not())
                else -> it.copy(isKanagawa = it.isKanagawa.not())
            }
        }
        return true
    }

    fun onClickChubu(index: Int) : Boolean {
        if (index !in 14..22) throw IllegalArgumentException("14から22の数字を渡してください")
        _isChubuSelects.update {
            when (index) {
                14 -> it.copy(isNigata = it.isNigata.not())
                15 -> it.copy(isNagano = it.isNagano.not())
                16 -> it.copy(isYamanashi = it.isYamanashi.not())
                17 -> it.copy(isShizuoka = it.isShizuoka.not())
                18 -> it.copy(isToyama = it.isToyama.not())
                19 -> it.copy(isGihu = it.isGihu.not())
                20 -> it.copy(isAichi = it.isAichi.not())
                21 -> it.copy(isIshikawa = it.isIshikawa.not())
                else -> it.copy(isHukui = it.isHukui.not())
            }
        }
        return true
    }

    fun onClickKansai(index: Int) : Boolean {
        if (index !in 23..29) throw IllegalArgumentException("23から29の数字を渡してください")
        _isKansaiSelects.update {
            when (index) {
                23 -> it.copy(isShiga = it.isShiga.not())
                24 -> it.copy(isMie = it.isMie.not())
                25 -> it.copy(isKyoto = it.isKyoto.not())
                26 -> it.copy(isNara = it.isNara.not())
                27 -> it.copy(isHyogo = it.isHyogo.not())
                28 -> it.copy(isOsaka = it.isOsaka.not())
                else -> it.copy(isWakayama = it.isWakayama.not())
            }
        }
        return true
    }

    fun onClickChugoku(index: Int) : Boolean {
        if (index !in 30..34) throw IllegalArgumentException("30から34の数字を渡してください")
        _isChugokuSelects.update {
            when (index) {
                30 -> it.copy(isTottori = it.isTottori.not())
                31 -> it.copy(isOkayama = it.isOkayama.not())
                32 -> it.copy(isShimane = it.isShimane.not())
                33 -> it.copy(isHiroshima = it.isHiroshima.not())
                else -> it.copy(isYamaguchi = it.isYamaguchi.not())
            }
        }
        return true
    }

    fun onClickShikoku(index: Int) : Boolean {
        if (index !in 35 .. 38) throw IllegalArgumentException("35から38の数字を渡してください")
        _isShikokuSelects.update {
            when (index) {
                35 -> it.copy(isKagawa = it.isKagawa.not())
                36 -> it.copy(isTokushima = it.isTokushima.not())
                37 -> it.copy(isEhime = it.isEhime.not())
                else -> it.copy(isKochi = it.isKochi.not())
            }
        }
        return true
    }

    fun onClickKyushu(index: Int) : Boolean {
        if (index !in 39 .. 45) throw IllegalArgumentException("39から45の数字を渡してください")
        _isKyushuSelects.update {
            when (index) {
                39 -> it.copy(isHukuoka = it.isHukuoka.not())
                40 -> it.copy(isNagasaki = it.isNagasaki.not())
                41 -> it.copy(isSaga = it.isSaga.not())
                42 -> it.copy(Oita = it.Oita.not())
                43 -> it.copy(Miyazaki = it.Miyazaki.not())
                44 -> it.copy(Kumamoto = it.Kumamoto.not())
                else -> it.copy(Kagoshima = it.Kagoshima.not())
            }
        }
        return true
    }

    fun onClickOkinawa() : Boolean {
        _isOkinawaSelects.update {
            it.copy(isEnable = it.isEnable.not())
        }
        return true
    }

}