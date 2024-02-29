package com.jack.weather.ui.splash

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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
    Box(
        modifier = modifier
            .border(width = 4.dp, color = Gray, shape = RoundedCornerShape(16.dp)),
    ) {
        Text(
            text = "Splash Screen",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center,
        )
    }
}