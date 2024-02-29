package com.jack.weather.ui.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jack.weather.R

@Composable
fun ErrorView(
    modifier: Modifier = Modifier,
) {
    Column {
        Spacer(modifier = modifier.height(12.dp))
        Text(
            text = stringResource(R.string.error_view_title),
            fontSize = 28.sp,
            fontWeight = FontWeight(900),
        )
        Spacer(modifier = modifier.height(14.dp))
        Image(
            painter = painterResource(R.drawable.main_weather_animated_view_figure_7),
            contentDescription = stringResource(R.string.error_view_image_content_description),
            modifier = modifier
                .width(180.dp)
                .height(180.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = modifier.height(14.dp))
        Text(
            text = stringResource(R.string.error_view_subtitle),
            modifier = modifier.align(Alignment.CenterHorizontally),
            fontSize = 22.sp,
            fontWeight = FontWeight(700),
        )
        Spacer(modifier = modifier.height(12.dp))
        Text(
            text = stringResource(R.string.error_view_point_1),
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
        )
        Spacer(modifier = modifier.height(4.dp))
        Text(
            text = stringResource(R.string.error_view_point_2),
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
        )
        Spacer(modifier = modifier.height(4.dp))
        Text(
            text = stringResource(R.string.error_view_point_3),
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
        )
    }
}