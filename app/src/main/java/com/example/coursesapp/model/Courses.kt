package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Courses (
    @StringRes val stringResourceId: Int,
    val intResourceId: Int,
    @DrawableRes val imageResourceId: Int
)