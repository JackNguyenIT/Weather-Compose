package com.jack.weather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import com.jack.weather.ui.theme.WeatherAppTheme

@Composable
fun BackgroundWrapper(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    BoxWithConstraints(
        modifier = modifier.background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    WeatherAppTheme.colors.backgroundTop,
                    WeatherAppTheme.colors.backgroundBottom
                )
            )
        )
    ) {
        content()
    }
}
