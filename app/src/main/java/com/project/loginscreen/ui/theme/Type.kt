package com.project.loginscreen.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.project.loginscreen.R

val Inter = FontFamily(
    listOf(
        Font(resId = R.font.inter_medium, weight = FontWeight.Medium)
    )
)

val Roboto = FontFamily(
    listOf(
        Font(resId = R.font.roboto_bold, weight = FontWeight.ExtraBold),
        Font(resId = R.font.roboto_medium, weight = FontWeight.Medium),
        Font(resId = R.font.roboto_regular, weight = FontWeight.Normal),
    )
)

val Rubik = FontFamily(
    listOf(Font(resId = R.font.rubik_bold, weight = FontWeight.Bold))
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 32.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    )
)