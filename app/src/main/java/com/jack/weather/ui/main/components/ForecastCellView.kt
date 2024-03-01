package com.jack.weather.ui.main.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.jack.weather.data.weather.Weather
import com.jack.weather.ui.theme.WeatherAppTheme
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.Punched

@Composable
fun ForecastCellView(
    weather: Weather?,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .height(150.dp)
    ) {
        Box(
            modifier = modifier
                .height(130.dp)
        ) {
            Card(
                backgroundColor = WeatherAppTheme.colors.neumorphicBackgroundColor,
                elevation = 0.dp,
                shape = RoundedCornerShape(20.dp),
                modifier = modifier
                    .neumorphic(
                        neuShape =
                        Punched.Rounded(radius = 16.dp)
                    )
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(14.dp)
                ) {
                    if (weather == null) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                        ) {
                            CircularProgressIndicator(
                                modifier = Modifier
                                    .width(24.dp)
                                    .height(24.dp)
                                    .align(Alignment.Center)
                                    .zIndex(2f),
                            )
                        }
                    } else {
                        WeatherIconView(
                            weatherType = weather.type,
                            modifier = Modifier.weight(2.2f)
                        )
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "${weather.temperature.toInt()}°",
                                fontSize = 19.sp,
                                fontWeight = FontWeight(900),
                                modifier = Modifier
                                    .wrapContentWidth()
                                    .padding(bottom = 4.dp)
                                    .align(Alignment.Center)
                            )
                        }
                    }
                }
            }

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            if (weather != null) {
                // To put in presenter the text creation
                Text(
                    text = "test",
                    fontSize = 12.sp,
                    fontWeight = FontWeight(900),
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(bottom = 4.dp)
                        .align(Alignment.Center)
                )
            }
        }
    }
}