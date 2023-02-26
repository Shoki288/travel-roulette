package com.example.travel_roulette

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.travel_roulette.vo.Prefecture
import com.example.travel_roulette.vo.PrefectureState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _prefectureInArea = MutableStateFlow<List<PrefectureState>>(PrefectureState.allPrefecture)
    val prefectureInArea = _prefectureInArea.asStateFlow()

    val hokkaidoState =
        _prefectureInArea.distinctUntilChangedBy { it[Prefecture.Hokkaido.ordinal] }.map {
            it[Prefecture.Hokkaido.ordinal]
        }.stateIn(viewModelScope, SharingStarted.Eagerly, PrefectureState.None(Prefecture.Hokkaido))

    val okinawaState =
        _prefectureInArea.distinctUntilChangedBy { it[Prefecture.Okinawa.ordinal] }.map {
            it[Prefecture.Okinawa.ordinal]
        }.stateIn(viewModelScope, SharingStarted.Eagerly, PrefectureState.None(Prefecture.Okinawa))

    private val _onClickChubuArea = MutableStateFlow(false)
    val onClickChubuArea = _onClickChubuArea.asStateFlow()

    private val _chosePrefecture = MutableStateFlow("")
    val chosePrefecture = _chosePrefecture.asStateFlow()

    fun onClickPrefecture(select: Prefecture) {
        _prefectureInArea.updatePrefecture(select)
    }

    private fun MutableStateFlow<List<PrefectureState>>.updatePrefecture(changed: Prefecture) {
        update { prefectures ->
            prefectures.map {
                if (it.prefecture == changed) {
                    it.changeState()
                } else {
                    it
                }
            }
        }
    }

    fun onClickChubu() {
        _onClickChubuArea.value = true
        viewModelScope.launch {
            delay(500L)
            _onClickChubuArea.value = false
        }
    }

    fun onClickRoulette() {
        val seeds = prefectureInArea.value.filterIsInstance<PrefectureState.None>()

        viewModelScope.launch {
            repeat(20) {
                val result = (0..seeds.lastIndex).random()
                _prefectureInArea.update { prefectures ->
                    prefectures.map {
                        when (it) {
                            seeds[result] -> PrefectureState.Select(it.prefecture)
                            is PrefectureState.UnSelectable -> it
                            else -> PrefectureState.None(it.prefecture)
                        }
                    }
                }
                _chosePrefecture.value = seeds[result].prefecture.prefectureName

                delay(200L)
            }
        }
    }
}