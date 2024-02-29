package com.jack.weather.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.LocalOverscrollConfiguration
import androidx.compose.foundation.OverscrollConfiguration
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WeatherAppTheme(darkTheme: Boolean = false, content: @Composable () -> Unit) {
    val colors = if (darkTheme) DarkColorPalette else LightColorPalette

    val extendedColor = if (darkTheme) DarkExtendedColorsPalette else LightExtendedColorsPalette

    CompositionLocalProvider(
        LocalExtendedColors provides extendedColor,
        LocalExtendedTypography provides CustomTypography,
    ) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
        ) {
            CompositionLocalProvider(
                LocalContentAlpha provides 1f,
                LocalContentColor provides MaterialTheme.colors.onBackground,
                LocalOverscrollConfiguration provides OverscrollConfiguration(
                    glowColor = MaterialTheme.colors.primaryVariant,
                ),
                content = content
            )
        }
    }
}


object WeatherAppTheme {

    /**
     * Retrieves the current [ExtendedColors] at the call site's position in the hierarchy.
     *
     */
    val colors: ExtendedColors
        @ReadOnlyComposable
        @Composable
        get() = LocalExtendedColors.current

    /**
     * Retrieves the current [ExtendedTypography] at the call site's position in the hierarchy.
     */
    val typography: ExtendedTypography
        @ReadOnlyComposable
        @Composable
        get() = LocalExtendedTypography.current
}