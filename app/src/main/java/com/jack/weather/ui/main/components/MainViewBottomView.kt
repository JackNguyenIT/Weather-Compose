package com.jack.weather.ui.main.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.jack.weather.data.weather.Weather

@Composable
fun MainViewBottomView(
    modifier: Modifier = Modifier,
    weathers: List<Weather>? = null,
) {
    Box {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(start = 8.dp, end = 8.dp)
                .align(alignment = Alignment.BottomCenter)
                .zIndex(4f)
        ) {
            Row {
                ForecastCellView(
                    weather = weathers?.getOrNull(0),
                    modifier = Modifier.weight(1f),
                )
                Spacer(modifier = Modifier.width(8.dp))
                ForecastCellView(
                    weather = weathers?.getOrNull(1),
                    modifier = Modifier.weight(1f),
                )
                Spacer(modifier = Modifier.width(8.dp))
                ForecastCellView(
                    weather = weathers?.getOrNull(2),
                    modifier = Modifier.weight(1f),
                )
                Spacer(modifier = Modifier.width(8.dp))
                ForecastCellView(
                    weather = weathers?.getOrNull(3),
                    modifier = Modifier.weight(1f),
                )
            }
        }
    }

}