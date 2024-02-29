package com.jack.weather.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun WeatherProviders(
    appState: WeatherAppState,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        content = content
    )
}