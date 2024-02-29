package com.jack.weather.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.jack.weather.ui.components.BackgroundWrapper
import com.jack.weather.ui.navigation.AppNavHost

@Composable
fun WeatherComposeApp(
    appStateViewModel: WeatherAppStateViewModel = hiltViewModel(),
    appState: WeatherAppState = rememberWeatherAppState(appViewModel = appStateViewModel)
) {
    WeatherProviders(appState) {
        BackgroundWrapper {
            Scaffold(
                modifier = Modifier
                    .fillMaxSize(),
                scaffoldState = appState.scaffoldState,
                backgroundColor = Color.Transparent,
            ) { innerPadding ->
                Box(
                    modifier = Modifier
                        .padding(innerPadding)
                ) {
                    AppNavHost(
                        modifier = Modifier
                            .fillMaxSize(),
                        appState = appState,
                        appNavigation = appState.appNavigation,
                    )
                }
            }
        }
    }
}