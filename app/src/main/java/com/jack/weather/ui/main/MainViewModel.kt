package com.jack.weather.ui.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jack.weather.data.weather.Weather
import com.jack.weather.data.weather.WeatherUnit
import com.jack.weather.ui.main.components.TemperatureContainerStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
) : ViewModel() {
    var uiState: MainUiState by mutableStateOf(MainUiState())
        private set


    init {
        viewModelScope.launch {
            uiState = uiState.copy(
                weather = Weather(
                    city = "Da Nang",
                    weatherUnit = WeatherUnit.IMPERIAL,
                    type = Weather.Type.CLOUDS,
                    temperature = 30f,
                    humidity = 10,
                    pressure = 10,
                    timestampSecond = 1709204
                ),
                weathers = listOf(
                    Weather(
                        city = "Da Nang",
                        weatherUnit = WeatherUnit.IMPERIAL,
                        type = Weather.Type.DRIZZLE,
                        temperature = 30f,
                        humidity = 10,
                        pressure = 10,
                        timestampSecond = 1709204
                    ), Weather(
                        city = "Da Nang",
                        weatherUnit = WeatherUnit.IMPERIAL,
                        type = Weather.Type.CLEAR,
                        temperature = 30f,
                        humidity = 10,
                        pressure = 10,
                        timestampSecond = 1709204
                    ), Weather(
                        city = "Da Nang",
                        weatherUnit = WeatherUnit.IMPERIAL,
                        type = Weather.Type.CLOUDS_SCATTERED_CLOUDS,
                        temperature = 30f,
                        humidity = 10,
                        pressure = 10,
                        timestampSecond = 1709204
                    ), Weather(
                        city = "Da Nang",
                        weatherUnit = WeatherUnit.IMPERIAL,
                        type = Weather.Type.RAIN_LIGHT_RAIN,
                        temperature = 30f,
                        humidity = 10,
                        pressure = 10,
                        timestampSecond = 1709204
                    )
                )
            )
        }

    }

    fun update(status: TemperatureContainerStatus) {
        viewModelScope.launch {
            if (status != TemperatureContainerStatus.COLLAPSED) {
                uiState = uiState.copy(
                    weather = Weather(
                        city = "Ha Noi",
                        weatherUnit = WeatherUnit.IMPERIAL,
                        type = Weather.Type.RAIN,
                        temperature = 60f,
                        humidity = 10,
                        pressure = 10,
                        timestampSecond = 1709204
                    )
                )
            } else {
                uiState = uiState.copy(
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