package com.example.travel_roulette.binding_adapter

import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.travel_roulette.R

@BindingAdapter("selectPrefecture")
fun Button.selectPrefecture(select: Boolean) {
    val bgColor = if (select) {
        R.color.md_theme_light_onSurfaceVariant
    } else {
        R.color.white
    }
    this.setBackgroundColor(ContextCompat.getColor(context, bgColor))
}

interface SelectPrefectureListener {
    operator fun invoke(index: Int)
}