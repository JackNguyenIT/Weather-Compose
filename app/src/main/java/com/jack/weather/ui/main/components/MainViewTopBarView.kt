package com.jack.weather.ui.main.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainViewTopBarView(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(end = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight()
                .align(Alignment.Top)
                .padding(start = 24.dp, top = 20.dp, end = 24.dp)
        ) {
            Text(
                text = "cityState!!",
                fontSize = 22.sp,
                fontWeight = FontWeight(900),
                modifier = Modifier
                    .wrapContentHeight()
            )
            Text(
                text = "dateState!!",
                fontSize = 22.sp,
                fontWeight = FontWeight(900),
                modifier = Modifier
                    .wrapContentHeight()
            )
        }
    }
}