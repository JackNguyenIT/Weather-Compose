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
import com.jack.weather.ui.components.BackgroundWrapper
import com.jack.weather.ui.components.CityEditView

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
            }
        }
    }
}