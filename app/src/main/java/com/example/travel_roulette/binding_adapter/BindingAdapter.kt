package com.example.travel_roulette.binding_adapter

import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.example.travel_roulette.R
import com.example.travel_roulette.vo.Prefecture
import com.example.travel_roulette.vo.PrefectureState

@BindingAdapter("canSelectPrefecture")
fun Button.selectPrefecture(state: PrefectureState) {
    val bgColor = when (state) {
        is PrefectureState.None -> R.color.white
        is PrefectureState.Select -> R.color.md_theme_light_primaryContainer
        is PrefectureState.UnSelectable -> R.color.md_theme_light_outline
    }
    this.setBackgroundColor(ContextCompat.getColor(context, bgColor))
}

@BindingAdapter("isDisable")
fun View.setDisable(isDisable: Boolean) {
    this.isClickable = isDisable.not()
    this.isFocusable = isDisable.not()
}

@BindingAdapter("visibleOrGone")
fun View.setVisibleOrGone(isVisible: Boolean) {
    this.isVisible = isVisible
}

interface SelectPrefectureListener {
    operator fun invoke(prefecture: Prefecture)
}