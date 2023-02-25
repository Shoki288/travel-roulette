package com.example.travel_roulette

import androidx.annotation.IntRange
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.travel_roulette.vo.PrefectureSeed
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _prefectureInArea = MutableStateFlow(PrefectureSeed())
    val prefectureInArea = _prefectureInArea.asStateFlow()

    val isHokkaido = _prefectureInArea.distinctUntilChangedBy { it.isHokkaido }.map {
        it.isHokkaido
    }.stateIn(viewModelScope, SharingStarted.Eagerly, false)

    val isOkinawa = _prefectureInArea.distinctUntilChangedBy { it.isOkinawa }.map {
        it.isOkinawa
    }.stateIn(viewModelScope, SharingStarted.Eagerly, false)

    private val _onClickChubuArea = MutableStateFlow(false)
    val onClickChubuArea = _onClickChubuArea.asStateFlow()

    fun onClickHokkaido() {
        _prefectureInArea.update {
            it.copy(isHokkaido = it.isHokkaido.not())
        }
    }

    fun onClickTohoku(@IntRange(from = 1, to = 6) index: Int) {
        _prefectureInArea.update {
            when (index) {
                1 -> it.copy(isAomori = it.isAomori.not())
                2 -> it.copy(isAkita = it.isAkita.not())
                3 -> it.copy(isAkita = it.isIwate.not())
                4 -> it.copy(isYamagata = it.isYamagata.not())
                5 -> it.copy(isMiyagi = it.isMiyagi.not())
                else -> it.copy(isHukushima = it.isHukushima.not())
            }
        }
    }

    fun onClickKanto(@IntRange(from = 7, to = 13) index: Int) {
        _prefectureInArea.update {
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
    }

    fun onClickChubu(@IntRange(from = 14, to = 22) index: Int) {
        _prefectureInArea.update {
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
    }

    fun onClickKansai(@IntRange(from = 23, to = 29) index: Int) {
        _prefectureInArea.update {
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
    }

    fun onClickChugoku(@IntRange(from = 30, to = 34)index: Int) {
        _prefectureInArea.update {
            when (index) {
                30 -> it.copy(isTottori = it.isTottori.not())
                31 -> it.copy(isOkayama = it.isOkayama.not())
                32 -> it.copy(isShimane = it.isShimane.not())
                33 -> it.copy(isHiroshima = it.isHiroshima.not())
                else -> it.copy(isYamaguchi = it.isYamaguchi.not())
            }
        }
    }

    fun onClickShikoku(@IntRange(from = 35, to = 38) index: Int) {
        _prefectureInArea.update {
            when (index) {
                35 -> it.copy(isKagawa = it.isKagawa.not())
                36 -> it.copy(isTokushima = it.isTokushima.not())
                37 -> it.copy(isEhime = it.isEhime.not())
                else -> it.copy(isKochi = it.isKochi.not())
            }
        }
    }

    fun onClickKyushu(@IntRange(from = 39, to = 45) index: Int) {
        _prefectureInArea.update {
            when (index) {
                39 -> it.copy(isHukuoka = it.isHukuoka.not())
                40 -> it.copy(isNagasaki = it.isNagasaki.not())
                41 -> it.copy(isSaga = it.isSaga.not())
                42 -> it.copy(isOita = it.isOita.not())
                43 -> it.copy(isMiyazaki = it.isMiyazaki.not())
                44 -> it.copy(isKumamoto = it.isKumamoto.not())
                else -> it.copy(isKagoshima = it.isKagoshima.not())
            }
        }
    }

    fun onClickOkinawa() {
        _prefectureInArea.update {
            it.copy(isOkinawa = it.isOkinawa.not())
        }
    }

    fun onClickChubu() {
        _onClickChubuArea.value = true
        viewModelScope.launch {
            delay(500L)
            _onClickChubuArea.value = false
        }
    }
}