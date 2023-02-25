package com.example.travel_roulette.binding_adapter

import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.travel_roulette.R

@BindingAdapter("canSelectPrefecture")
fun Button.selectPrefecture(canSelect: Boolean) {
    val bgColor = if (canSelect) {
        R.color.white
    } else {
        R.color.md_theme_light_outline
    }
    this.setBackgroundColor(ContextCompat.getColor(context, bgColor))
}

@BindingAdapter("isDisable")
fun View.setDisable(isDisable: Boolean) {
    this.isClickable = isDisable.not()
    this.isFocusable = isDisable.not()
}

interface SelectPrefectureListener {
    operator fun invoke(index: Int)
}