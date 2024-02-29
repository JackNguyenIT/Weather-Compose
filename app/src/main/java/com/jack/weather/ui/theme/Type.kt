package com.jack.weather.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.jack.weather.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val fontName = GoogleFont("Noto Sans")

val fontFamily = FontFamily(
    Font(googleFont = fontName, fontProvider = provider)
)

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = fontFamily,
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        letterSpacing = 1.25.sp
    ),
    h6 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        letterSpacing = 0.15.sp
    ),
    subtitle1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp
    ),
    /* Other default text styles to override
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)


val CustomTypography = ExtendedTypography(
    defaultFontFamily = fontFamily,
    boldS = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 11.sp,
        letterSpacing = 0.2.sp,
    ),
    extraBoldS = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 11.sp,
        letterSpacing = 0.2.sp,
    ),
    extraBoldM = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 18.sp,
        letterSpacing = 0.2.sp,
    ),
    semiBoldS = TextStyle(
        fontWeight = FontWeight.W600,
        fontSize = 12.sp,
        letterSpacing = 0.2.sp,
    ),
    headingBoldXS = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 0.5.sp,
    ),
    textButton = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp,
    ),
    textTimeRange = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp,
    ),
    textMediumPercent = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 45.sp,
        letterSpacing = 0.5.sp,
    ),
    textBigPercent = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 71.sp,
        letterSpacing = 0.5.sp,
    ),
    textMediumUnit = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        letterSpacing = 0.5.sp,
    ),
    textSmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        letterSpacing = 0.5.sp,
    ),
    textRecordTitleComponent = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
        letterSpacing = 0.5.sp,
    ),
    textSectionHeader = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        letterSpacing = 0.5.sp,
    ),
    textDisplayTime = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 33.sp,
        letterSpacing = 0.5.sp,
    ),
    textAxisTimeChart = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
        letterSpacing = 0.5.sp,
    ),
    textSettingLabel = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
    ),
    textSettingValue = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    textSettingValueSmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    textYearMonthBar = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        letterSpacing = 2.sp
    ),
    textSegmentTab = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 13.sp,
        letterSpacing = 1.sp
    ),
    textNoData = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 13.sp,
        letterSpacing = 0.5.sp
    ),
    textHighEmphasisValue = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
        letterSpacing = 0.5.sp
    ),
    subTitle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp
    ),
    textAverageUnit = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp
    ),
    textBigRegular = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 21.sp,
        letterSpacing = 0.15.sp
    ),
    textMediumBold = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 21.sp,
        letterSpacing = 0.15.sp
    ),
    textGameFiSmallMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        letterSpacing = 0.15.sp
    ),
    textGameFiSmallSemiBold = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 10.sp,
        letterSpacing = 0.15.sp
    ),
    textGameFiTinyExtraBold = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 9.sp,
        letterSpacing = 0.15.sp
    ),
    textGameFiSmallBoldItalic = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        fontStyle = FontStyle.Italic,
        letterSpacing = 0.15.sp
    ),
    textGameFiSmallBold = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        fontStyle = FontStyle.Normal,
        letterSpacing = 0.15.sp
    ),
    textSmallTitle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        letterSpacing = 0.15.sp
    ),
    textHeaderGameFi = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 19.sp,
        letterSpacing = 0.2.sp
    ),
)

val LocalExtendedTypography = staticCompositionLocalOf { CustomTypography }

@Immutable
data class ExtendedTypography constructor(
    val boldS: TextStyle,
    val extraBoldS: TextStyle,
    val extraBoldM: TextStyle,
    val semiBoldS: TextStyle,
    val headingBoldXS: TextStyle,
    val textButton: TextStyle,
    val textTimeRange: TextStyle,
    val textMediumPercent: TextStyle,
    val textMediumUnit: TextStyle,
    val textSmall: TextStyle,
    val textAxisTimeChart: TextStyle,
    val textDisplayTime: TextStyle,
    val textRecordTitleComponent: TextStyle,
    val textSectionHeader: TextStyle,
    val textBigPercent: TextStyle,
    val textSettingLabel: TextStyle,
    val textSettingValue: TextStyle,
    val textSettingValueSmall: TextStyle,
    val textYearMonthBar: TextStyle,
    val textSegmentTab: TextStyle,
    val textNoData: TextStyle,
    val textHighEmphasisValue: TextStyle,
    val subTitle: TextStyle,
    val textAverageUnit: TextStyle,
    val textBigRegular: TextStyle,
    val textGameFiSmallMedium: TextStyle,
    val textGameFiSmallSemiBold: TextStyle,
    val textGameFiTinyExtraBold: TextStyle,
    val textGameFiSmallBoldItalic: TextStyle,
    val textGameFiSmallBold: TextStyle,
    val textSmallTitle: TextStyle,
    val textMediumBold: TextStyle,
    val textHeaderGameFi: TextStyle,
) {
    constructor(
        defaultFontFamily: FontFamily,
        boldS: TextStyle,
        extraBoldS: TextStyle,
        extraBoldM: TextStyle,
        semiBoldS: TextStyle,
        headingBoldXS: TextStyle,
        textButton: TextStyle,
        textTimeRange: TextStyle,
        textMediumPercent: TextStyle,
        textMediumUnit: TextStyle,
        textDisplayTime: TextStyle,
        textAxisTimeChart: TextStyle,
        textSmall: TextStyle,
        textRecordTitleComponent: TextStyle,
        textSectionHeader: TextStyle,
        textBigPercent: TextStyle,
        textSettingLabel: TextStyle,
        textSettingValue: TextStyle,
        textSettingValueSmall: TextStyle,
        textYearMonthBar: TextStyle,
        textSegmentTab: TextStyle,
        textNoData: TextStyle,
        textHighEmphasisValue: TextStyle,
        subTitle: TextStyle,
        textAverageUnit: TextStyle,
        textBigRegular: TextStyle,
        textGameFiSmallMedium: TextStyle,
        textGameFiSmallSemiBold: TextStyle,
        textGameFiTinyExtraBold: TextStyle,
        textGameFiSmallBoldItalic: TextStyle,
        textGameFiSmallBold: TextStyle,
        textSmallTitle: TextStyle,
        textMediumBold: TextStyle,
        textHeaderGameFi: TextStyle,
    ) : this(
        boldS = boldS.withDefaultFontFamily(defaultFontFamily),
        extraBoldS = extraBoldS.withDefaultFontFamily(defaultFontFamily),
        extraBoldM = extraBoldM.withDefaultFontFamily(defaultFontFamily),
        semiBoldS = semiBoldS.withDefaultFontFamily(defaultFontFamily),
        headingBoldXS = headingBoldXS.withDefaultFontFamily(defaultFontFamily),
        textButton = textButton.withDefaultFontFamily(defaultFontFamily),
        textTimeRange = textTimeRange.withDefaultFontFamily(defaultFontFamily),
        textMediumPercent = textMediumPercent.withDefaultFontFamily(defaultFontFamily),
        textMediumUnit = textMediumUnit.withDefaultFontFamily(defaultFontFamily),
        textDisplayTime = textDisplayTime.withDefaultFontFamily(defaultFontFamily),
        textSmall = textSmall.withDefaultFontFamily(defaultFontFamily),
        textAxisTimeChart = textAxisTimeChart.withDefaultFontFamily(defaultFontFamily),
        textSectionHeader = textSectionHeader.withDefaultFontFamily(
            defaultFontFamily
        ),
        textBigPercent = textBigPercent.withDefaultFontFamily(defaultFontFamily),
        textRecordTitleComponent = textRecordTitleComponent.withDefaultFontFamily(defaultFontFamily),
        textSettingLabel = textSettingLabel.withDefaultFontFamily(defaultFontFamily),
        textSettingValue = textSettingValue.withDefaultFontFamily(defaultFontFamily),
        textSettingValueSmall = textSettingValueSmall.withDefaultFontFamily(defaultFontFamily),
        textYearMonthBar = textYearMonthBar.withDefaultFontFamily(defaultFontFamily),
        textSegmentTab = textSegmentTab.withDefaultFontFamily(defaultFontFamily),
        textNoData = textNoData.withDefaultFontFamily(defaultFontFamily),
        textHighEmphasisValue = textHighEmphasisValue.withDefaultFontFamily(defaultFontFamily),
        subTitle = subTitle.withDefaultFontFamily(defaultFontFamily),
        textAverageUnit = textAverageUnit.withDefaultFontFamily(defaultFontFamily),
        textBigRegular = textBigRegular.withDefaultFontFamily(defaultFontFamily),
        textGameFiSmallMedium = textGameFiSmallMedium.withDefaultFontFamily(defaultFontFamily),
        textGameFiSmallSemiBold = textGameFiSmallSemiBold.withDefaultFontFamily(defaultFontFamily),
        textGameFiTinyExtraBold = textGameFiTinyExtraBold.withDefaultFontFamily(defaultFontFamily),
        textGameFiSmallBoldItalic = textGameFiSmallBoldItalic.withDefaultFontFamily(
            defaultFontFamily
        ),
        textGameFiSmallBold = textGameFiSmallBold.withDefaultFontFamily(defaultFontFamily),
        textSmallTitle = textSmallTitle.withDefaultFontFamily(defaultFontFamily),
        textMediumBold = textMediumBold.withDefaultFontFamily(defaultFontFamily),
        textHeaderGameFi = textHeaderGameFi.withDefaultFontFamily(defaultFontFamily),
    )
}

/**
 * @return [this] if there is a [FontFamily] defined, otherwise copies [this] with [default] as
 * the [FontFamily].
 */
private fun TextStyle.withDefaultFontFamily(default: FontFamily): TextStyle {
    return if (fontFamily != null) this else copy(fontFamily = default)
}