package com.project.loginscreen.ui.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp

@Composable
fun BackgroundShape(
    modifier: Modifier = Modifier
) {
    Canvas(
        modifier = modifier
            .size(width = 375.dp, height = 375.dp)
    ) {
        val scaleX = size.width / 360f
        val scaleY = size.height / 375f

        val path = Path().apply {
            moveTo(360f * scaleX, -127f * scaleY)
            lineTo(0f * scaleX, -127f * scaleY)
            lineTo(0f * scaleX, 366.75f * scaleY)

            cubicTo(
                1.45f * scaleX, 361.27f * scaleY,
                4.44f * scaleX, 356.26f * scaleY,
                8.69f * scaleX, 352.35f * scaleY
            )

            lineTo(159.19f * scaleX, 213.96f * scaleY)

            cubicTo(
                170.67f * scaleX, 203.41f * scaleY,
                188.33f * scaleX, 203.41f * scaleY,
                199.81f * scaleX, 213.96f * scaleY
            )

            lineTo(350.31f * scaleX, 352.35f * scaleY)

            cubicTo(
                356.48f * scaleX, 358.03f * scaleY,
                360f * scaleX, 366.04f * scaleY,
                360f * scaleX, 374.43f * scaleY
            )

            lineTo(360f * scaleX, -127f * scaleY)
            close()
        }

        drawPath(
            path = path,
            color = Color(0xFFBFDBFE)
        )
    }
}