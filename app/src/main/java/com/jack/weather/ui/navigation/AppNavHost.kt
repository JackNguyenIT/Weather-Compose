package com.jack.weather.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jack.weather.ui.WeatherAppState
import com.jack.weather.ui.main.MainScreen
import com.jack.weather.ui.splash.SplashScreen

@Composable
fun AppNavHost(
    appNavigation: AppNavigation,
    appState: WeatherAppState,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = appNavigation.navController,
        startDestination = Screen.Splash.route,
        modifier = modifier
    ) {
        composable(Screen.Splash.route) {
            SplashScreen(onNavigateToMain = appNavigation::navigateToMain)
        }
        composable(Screen.Main.route) {
            MainScreen()
        }
    }
}