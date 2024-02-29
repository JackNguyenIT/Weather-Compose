package com.jack.weather.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jack.weather.R
import com.jack.weather.ui.theme.WeatherAppTheme
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.Pressed

@Composable
fun CityEditView(
    modifier: Modifier = Modifier,
) {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier
            .fillMaxWidth()
            .background(color = Color.Transparent)
            .padding(12.dp)
    ) {
        Card(
            backgroundColor = Color(236, 234, 235),
            elevation = 0.dp,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .neumorphic(
                    neuShape =
                    Pressed.Rounded(radius = 6.dp)
                )
        ) {
            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                placeholder = {
                    Text(text = "test")
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.city_edit_view_loop),
                        contentDescription = stringResource(id = R.string.app_name)
                    )
                },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.city_edit_view_ic_outline_info_24),
                        contentDescription = "info about this app",
                        modifier = Modifier.clickable {

                        },
                    )
                },
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(900)
                ),
                keyboardActions = KeyboardActions(
                    onDone = {

                    }
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    imeAction = ImeAction.Done,
                    keyboardType = KeyboardType.Text
                ),
                singleLine = true,
                maxLines = 1,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center)
            )

        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun CityEditViewPrev() {
    WeatherAppTheme {
        BackgroundWrapper {
            CityEditView()
        }
    }
}