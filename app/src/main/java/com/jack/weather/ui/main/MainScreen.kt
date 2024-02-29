package com.jack.weather.ui.main

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
import com.jack.weather.data.weather.Weather
import com.jack.weather.data.weather.WeatherUnit
import com.jack.weather.ui.components.BackgroundWrapper
import com.jack.weather.ui.components.CityEditView
import com.jack.weather.ui.main.components.MainViewTopBarView
import com.jack.weather.ui.main.components.MainWeatherAnimatedView

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    MainContent(modifier = modifier)
}

@Composable
private fun MainContent(
    modifier: Modifier = Modifier,
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
                MainViewTopBarView()
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Center)
                    .zIndex(1f)
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                MainWeatherAnimatedView(
                    weather = Weather(
                        city = "Da Nang",
                        weatherUnit = WeatherUnit.IMPERIAL,
                        type = Weather.Type.CLOUDS,
                        temperature = 30f,
                        humidity = 10,
                        pressure = 10,
                        timestampSecond = 1709204
                    )
                )
            }
        }
    }
}