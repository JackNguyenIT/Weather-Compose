package com.jack.weather.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import com.jack.weather.ui.components.BackgroundWrapper
import com.jack.weather.ui.components.CityEditView
import com.jack.weather.ui.main.components.ErrorView
import com.jack.weather.ui.main.components.MainViewBottomView
import com.jack.weather.ui.main.components.MainViewTopBarView
import com.jack.weather.ui.main.components.MainWeatherAnimatedView
import com.jack.weather.ui.main.components.TemperatureContainerStatus

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel()
) {
    MainContent(modifier = modifier, uiState = viewModel.uiState, onExpanded = {
        viewModel.update(it)
    })
}

@Composable
private fun MainContent(
    modifier: Modifier = Modifier,
    uiState: MainUiState,
    onExpanded: (TemperatureContainerStatus) -> Unit
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        BackgroundWrapper {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(6.dp))
                CityEditView(
                    modifier = Modifier.fillMaxWidth()
                )
                if (uiState.isError) {
                    ErrorView()
                } else {
                    MainViewTopBarView(weather = uiState.weather, onExpanded = onExpanded)
                }
            }

            if (!uiState.isError) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .zIndex(1f)
                ) {
                    Spacer(modifier = Modifier.height(30.dp))
                    MainWeatherAnimatedView(
                        weather = uiState.weather
                    )
                }

                Box(modifier = Modifier.align(alignment = Alignment.BottomCenter)) {
                    MainViewBottomView(
                        weathers = uiState.weathers,
                        modifier = Modifier.align(alignment = Alignment.BottomCenter)
                    )
                }

            }

        }
    }
}