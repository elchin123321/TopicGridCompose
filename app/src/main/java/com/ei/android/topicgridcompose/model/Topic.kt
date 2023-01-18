package com.ei.android.topicgridcompose.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val topic:Int,
    val number:Int,
    @DrawableRes val image:Int
)