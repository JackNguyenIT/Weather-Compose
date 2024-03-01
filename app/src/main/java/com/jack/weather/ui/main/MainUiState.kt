package com.jack.weather.ui.main

import com.jack.weather.data.weather.Weather

data class MainUiState(
    val weather: Weather? = null,
    val isError: Boolean = false,
    val weathers: List<Weather> = emptyList()
)