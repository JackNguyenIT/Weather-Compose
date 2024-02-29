package com.jack.weather.ui

import android.content.Context
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import com.jack.weather.ui.navigation.AppNavigation
import com.jack.weather.ui.navigation.rememberAppNavigation
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberWeatherAppState(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    appNavigation: AppNavigation = rememberAppNavigation(),
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    appViewModel: WeatherAppStateViewModel,
    context: Context = LocalContext.current
) = WeatherAppState(
    appNavigation = appNavigation,
    scaffoldState = scaffoldState,
    appViewModel = appViewModel,
    coroutineScope = coroutineScope,
    context = context
)

class WeatherAppState(
    val appNavigation: AppNavigation,
    val scaffoldState: ScaffoldState,
    val appViewModel: WeatherAppStateViewModel,
    private val coroutineScope: CoroutineScope,
    private val context: Context,
) {


}