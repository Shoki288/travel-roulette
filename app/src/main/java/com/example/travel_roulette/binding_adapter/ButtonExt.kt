package com.example.travel_roulette.binding_adapter

import android.widget.Button
import androidx.databinding.BindingAdapter
import com.example.travel_roulette.vo.SelectablePrefecture

@BindingAdapter("buttonEnabled")
fun Button.buttonEnabled(enabled: Boolean) {
    this.isClickable = enabled
    this.isFocusable = enabled
}

interface SelectPrefectureListener {
    operator fun invoke(index: Int): Boolean
}