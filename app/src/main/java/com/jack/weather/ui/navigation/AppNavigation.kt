package com.jack.weather.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun rememberAppNavigation(
    navController: NavHostController = rememberNavController()
): AppNavigation = remember {
    AppNavigation(navController)
}

class AppNavigation(
    val navController: NavHostController
) {

    val currentDestination: NavDestination? get() = navController.currentDestination

    fun navigateBack() {
        navController.navigateUp()
    }

    fun navigateToMain() {
        navController.navigate(Screen.Main.route) {
            popUpTo(Screen.Splash.route) {
                inclusive = true
            }
        }
    }

}