package com.example.sistemaagrotcc

import androidx.annotation.DrawableRes

data class Page(
    val title: String,
    @DrawableRes val drawableId: Int,
    val desc: String
) {
}