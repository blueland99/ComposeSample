package com.blueland.android_compose_sample.ui.theme

import androidx.compose.ui.graphics.Color

data class Colors(
    val background: Color,
    val main1: Color,
    val main2: Color,
    val point1: Color,
    val point2: Color,
    val point3: Color,
    val text01: Color,
    val text02: Color,
    val text03: Color,
    val text04: Color,
    val text05: Color,
    val text06: Color,
    val text07: Color,
    val text08: Color,
    val text09: Color,
    val text10: Color,
    val line: Color,
)

val LightColors = Colors(
    background = Color(0xFFFFFFFF),  // 화이트
    main1 = Color(0xFF6F8BBE),  // 블루
    main2 = Color(0xFF5C7498),  // 네이비
    point1 = Color(0xFF5E9BC7), // 하늘색
    point2 = Color(0xFFD77C7C), // 레드
    point3 = Color(0xFF7BBF7A), // 그린
    text01 = Color(0xFF4A4A4A),
    text02 = Color(0xFF5D5D5D),
    text03 = Color(0xFF737373),
    text04 = Color(0xFF8B8B8B),
    text05 = Color(0xFFA3A3A3),
    text06 = Color(0xFFB9B9B9),
    text07 = Color(0xFFCFCFCF),
    text08 = Color(0xFFF0F0F0),
    text09 = Color(0xFFFFFFFF),
    text10 = Color(0xFFF9F9F9),
    line = Color(0x33FFFFFF)
)

val DarkColors = Colors(
    background = Color(0xFF1E1E1E),  // 다크 배경 (블랙 대신 다크 그레이)
    main1 = Color(0xFF3B4B71),  // 다크 블루
    main2 = Color(0xFF2C384D),  // 다크 네이비
    point1 = Color(0xFF4A82A6), // 다크 하늘색
    point2 = Color(0xFFB05454), // 다크 레드
    point3 = Color(0xFF5F8C58), // 다크 그린
    text01 = Color(0xFFE0E0E0),
    text02 = Color(0xFFCCCCCC),
    text03 = Color(0xFFB3B3B3),
    text04 = Color(0xFF999999),
    text05 = Color(0xFF808080),
    text06 = Color(0xFF666666),
    text07 = Color(0xFF4D4D4D),
    text08 = Color(0xFF333333),
    text09 = Color(0xFFFFFFFF),
    text10 = Color(0xFF1A1A1A),
    line = Color(0x33FFFFFF)
)