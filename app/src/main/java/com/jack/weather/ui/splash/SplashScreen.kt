package com.jack.weather.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.jack.weather.R
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(
    onNavigateToMain: () -> Unit,
    modifier: Modifier = Modifier
) {

    LaunchedEffect(true) {
        delay(2000L)
        onNavigateToMain()
    }
    SplashContent(modifier = modifier)

}

@Composable
private fun SplashContent(
    modifier: Modifier = Modifier,
) {
    Image(
        painter = painterResource(R.drawable.background_splash),
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    )
}