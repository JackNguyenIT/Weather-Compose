package com.jack.weather.ui.main.components

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.jack.weather.R
import com.jack.weather.ui.theme.WeatherAppTheme
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.Punched

@Composable
fun MainViewTemperatureContainerView(
    modifier: Modifier = Modifier,
    onExpanded: (TemperatureContainerStatus) -> Unit
) {
    var temperatureContainerStatus by remember { mutableStateOf(TemperatureContainerStatus.COLLAPSED) }
    val temperatureContainerTransition =
        updateTransition(targetState = temperatureContainerStatus, label = "")

    val temperatureContainerWidth by temperatureContainerTransition.animateDp(label = "") {
        when (it) {
            TemperatureContainerStatus.COLLAPSED -> 130.dp
            TemperatureContainerStatus.EXPANDED -> 200.dp
        }
    }
    val temperatureContainerHeight by temperatureContainerTransition.animateDp(label = "") {
        when (it) {
            TemperatureContainerStatus.COLLAPSED -> 110.dp
            TemperatureContainerStatus.EXPANDED -> 250.dp
        }
    }

    Card(
        backgroundColor = WeatherAppTheme.colors.neumorphicBackgroundColor,
        elevation = 0.dp,
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
            .width(temperatureContainerWidth)
            .height(temperatureContainerHeight)
            .neumorphic(
                neuShape =
                Punched.Rounded(radius = 6.dp)
            )
            .clickable {
                temperatureContainerStatus = when (temperatureContainerStatus) {
                    TemperatureContainerStatus.COLLAPSED -> TemperatureContainerStatus.EXPANDED
                    TemperatureContainerStatus.EXPANDED -> TemperatureContainerStatus.COLLAPSED
                }
                onExpanded.invoke(temperatureContainerStatus)
            }
    ) {
        Box {
            Box(
                modifier = Modifier
                    .width(130.dp)
                    .height(110.dp)
                    .zIndex(2f)
                    .align(alignment = Alignment.TopStart)
            ) {
                Text(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .zIndex(2f)
                        .wrapContentWidth()
                        .wrapContentHeight(),
                    text = "11",
                    fontSize = 40.sp,
                    fontWeight = FontWeight(900),
                )
//            if (temperatureState == "") {
//                CircularProgressIndicator(
//                    modifier = Modifier
//                        .width(24.dp)
//                        .height(24.dp)
//                        .align(Alignment.Center)
//                        .zIndex(2f),
//                )
//            }
            }
            val temperatureUnityAlpha by temperatureContainerTransition.animateFloat(label = "") {
                when (it) {
                    TemperatureContainerStatus.COLLAPSED -> 0f
                    TemperatureContainerStatus.EXPANDED -> 1f
                }
            }
            Column(
                modifier = Modifier
                    .padding(start = 32.dp)
                    .alpha(temperatureUnityAlpha)
            ) {
                Spacer(modifier = Modifier.height(90.dp))
                Text(
                    text = stringResource(id = R.string.temperature),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(700),
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable {

                    }
                ) {
                    RadioButton(
                        modifier = Modifier.height(36.dp),
                        selected = true,
                        onClick = {
                        }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = stringResource(id = R.string.standard),
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600),
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable {
                    }
                ) {
                    RadioButton(
                        modifier = Modifier.height(36.dp),
                        selected = false,
                        onClick = {

                        }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = stringResource(id = R.string.metric),
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600),
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable {

                    }
                ) {
                    RadioButton(
                        modifier = Modifier.height(36.dp),
                        selected = false,
                        onClick = {
                        }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = stringResource(id = R.string.imperial),
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600),
                    )
                }
            }
        }

    }
}