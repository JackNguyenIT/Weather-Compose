package com.jack.weather.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple700 = Color(0xFF3700B3)
val Teal100 = Color(0xFF76D1CE)
val Lemon = Color(0xFFE8D300)
val Ming = Color(0xFF336677)

val backgroundTop = Color(0XFFEEF0F5)
val backgroundBottom = Color(0XFFEEF0F5)

val DarkColorPalette = darkColors(
    primary = Teal100,
    primaryVariant = Purple700,
    secondary = Lemon
)

val LightColorPalette = lightColors(
    primary = Teal100,
    primaryVariant = Purple700,
    secondary = Lemon,
    onBackground = Ming,
    onSecondary = Color.White,
    onSurface = Ming
    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

val LightExtendedColorsPalette = ExtendedColors(
    defaultContentColor = Color.Black,
    backgroundTop = backgroundTop,
    backgroundBottom = backgroundBottom,
    isDark = false
)

// If the UI has dark theme then creating new ExtendedColors instead LightExtendedColorsPalette
val DarkExtendedColorsPalette = LightExtendedColorsPalette

@Immutable
data class ExtendedColors(
    val defaultContentColor: Color,
    val backgroundTop: Color,
    val backgroundBottom: Color,
    val isDark: Boolean,

    )

val LocalExtendedColors = staticCompositionLocalOf { LightExtendedColorsPalette }