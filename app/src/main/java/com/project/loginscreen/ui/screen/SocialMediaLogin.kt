package com.project.loginscreen.ui.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.project.loginscreen.ui.theme.Black
import com.project.loginscreen.ui.theme.BlueGray
import com.project.loginscreen.ui.theme.Typography

@Composable
fun SocialMediaLogin(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    @DrawableRes logo: Int,
    text: String,
) {

    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSystemInDarkTheme()) BlueGray else Black,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(size = 4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
//            .width(128.dp)
        ,
        onClick = {},
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                modifier = modifier
                    .width(32.dp)
                    .height(32.dp),
                painter = painterResource(id = logo),
                contentDescription = "",
            )
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = text,
                style = Typography.labelMedium.copy(fontWeight = FontWeight.Medium)
            )
        }
    }
}