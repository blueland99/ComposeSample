package com.blueland.android_compose_sample.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.blueland.android_compose_sample.R

// Font families
val boldFontFamily = FontFamily(Font(R.font.pretendard_bold))
val mediumFontFamily = FontFamily(Font(R.font.pretendard_medium))
val regularFontFamily = FontFamily(Font(R.font.pretendard_regular))

// Helper function to create a TextStyle
fun createTextStyle(
    fontSize: Int,
    fontFamily: FontFamily,
    color: androidx.compose.ui.graphics.Color
) = TextStyle(
    fontSize = fontSize.sp,
    fontFamily = fontFamily,
    color = color
)

// Custom typography definitions
data class AppTextStyles(
    val boldTitleLg: TextStyle,
    val boldTitleMd: TextStyle,
    val boldTitleSm: TextStyle,
    val boldSubTitleLg: TextStyle,
    val boldSubTitleMd: TextStyle,
    val boldSubTitleSm: TextStyle,
    val boldSubTitleXs: TextStyle,
    val boldBodyLg: TextStyle,
    val boldBodyMd: TextStyle,
    val boldBodySm: TextStyle,
    val boldBodyXs: TextStyle,
    val boldCaptionLg: TextStyle,
    val boldCaptionMd: TextStyle,
    val boldCaptionSm: TextStyle,
    val boldCaptionXs: TextStyle,

    val mediumTitleLg: TextStyle,
    val mediumTitleMd: TextStyle,
    val mediumTitleSm: TextStyle,
    val mediumSubTitleLg: TextStyle,
    val mediumSubTitleMd: TextStyle,
    val mediumSubTitleSm: TextStyle,
    val mediumSubTitleXs: TextStyle,
    val mediumBodyLg: TextStyle,
    val mediumBodyMd: TextStyle,
    val mediumBodySm: TextStyle,
    val mediumBodyXs: TextStyle,
    val mediumCaptionLg: TextStyle,
    val mediumCaptionMd: TextStyle,
    val mediumCaptionSm: TextStyle,
    val mediumCaptionXs: TextStyle,

    val regularTitleLg: TextStyle,
    val regularTitleMd: TextStyle,
    val regularTitleSm: TextStyle,
    val regularSubTitleLg: TextStyle,
    val regularSubTitleMd: TextStyle,
    val regularSubTitleSm: TextStyle,
    val regularSubTitleXs: TextStyle,
    val regularBodyLg: TextStyle,
    val regularBodyMd: TextStyle,
    val regularBodySm: TextStyle,
    val regularBodyXs: TextStyle,
    val regularCaptionLg: TextStyle,
    val regularCaptionMd: TextStyle,
    val regularCaptionSm: TextStyle,
    val regularCaptionXs: TextStyle,
)

fun createTextStyles(colors: Colors) = AppTextStyles(
    boldTitleLg = createTextStyle(48, boldFontFamily, colors.text01),
    boldTitleMd = createTextStyle(40, boldFontFamily, colors.text01),
    boldTitleSm = createTextStyle(36, boldFontFamily, colors.text01),
    boldSubTitleLg = createTextStyle(30, boldFontFamily, colors.text01),
    boldSubTitleMd = createTextStyle(28, boldFontFamily, colors.text01),
    boldSubTitleSm = createTextStyle(26, boldFontFamily, colors.text01),
    boldSubTitleXs = createTextStyle(24, boldFontFamily, colors.text01),
    boldBodyLg = createTextStyle(22, boldFontFamily, colors.text01),
    boldBodyMd = createTextStyle(20, boldFontFamily, colors.text01),
    boldBodySm = createTextStyle(18, boldFontFamily, colors.text01),
    boldBodyXs = createTextStyle(16, boldFontFamily, colors.text01),
    boldCaptionLg = createTextStyle(14, boldFontFamily, colors.text01),
    boldCaptionMd = createTextStyle(12, boldFontFamily, colors.text01),
    boldCaptionSm = createTextStyle(10, boldFontFamily, colors.text01),
    boldCaptionXs = createTextStyle(8, boldFontFamily, colors.text01),

    mediumTitleLg = createTextStyle(48, mediumFontFamily, colors.text01),
    mediumTitleMd = createTextStyle(40, mediumFontFamily, colors.text01),
    mediumTitleSm = createTextStyle(36, mediumFontFamily, colors.text01),
    mediumSubTitleLg = createTextStyle(30, mediumFontFamily, colors.text01),
    mediumSubTitleMd = createTextStyle(28, mediumFontFamily, colors.text01),
    mediumSubTitleSm = createTextStyle(26, mediumFontFamily, colors.text01),
    mediumSubTitleXs = createTextStyle(24, mediumFontFamily, colors.text01),
    mediumBodyLg = createTextStyle(22, mediumFontFamily, colors.text01),
    mediumBodyMd = createTextStyle(20, mediumFontFamily, colors.text01),
    mediumBodySm = createTextStyle(18, mediumFontFamily, colors.text01),
    mediumBodyXs = createTextStyle(16, mediumFontFamily, colors.text01),
    mediumCaptionLg = createTextStyle(14, mediumFontFamily, colors.text01),
    mediumCaptionMd = createTextStyle(12, mediumFontFamily, colors.text01),
    mediumCaptionSm = createTextStyle(10, mediumFontFamily, colors.text01),
    mediumCaptionXs = createTextStyle(8, mediumFontFamily, colors.text01),

    regularTitleLg = createTextStyle(48, regularFontFamily, colors.text01),
    regularTitleMd = createTextStyle(40, regularFontFamily, colors.text01),
    regularTitleSm = createTextStyle(36, regularFontFamily, colors.text01),
    regularSubTitleLg = createTextStyle(30, regularFontFamily, colors.text01),
    regularSubTitleMd = createTextStyle(28, regularFontFamily, colors.text01),
    regularSubTitleSm = createTextStyle(26, regularFontFamily, colors.text01),
    regularSubTitleXs = createTextStyle(24, regularFontFamily, colors.text01),
    regularBodyLg = createTextStyle(22, regularFontFamily, colors.text01),
    regularBodyMd = createTextStyle(20, regularFontFamily, colors.text01),
    regularBodySm = createTextStyle(18, regularFontFamily, colors.text01),
    regularBodyXs = createTextStyle(16, regularFontFamily, colors.text01),
    regularCaptionLg = createTextStyle(14, regularFontFamily, colors.text01),
    regularCaptionMd = createTextStyle(12, regularFontFamily, colors.text01),
    regularCaptionSm = createTextStyle(10, regularFontFamily, colors.text01),
    regularCaptionXs = createTextStyle(8, regularFontFamily, colors.text01),
)