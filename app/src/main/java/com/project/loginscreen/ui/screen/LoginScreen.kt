package com.project.loginscreen.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.project.loginscreen.R
import com.project.loginscreen.ui.theme.Black
import com.project.loginscreen.ui.theme.BlueGray
import com.project.loginscreen.ui.theme.Typography

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Surface {
        Column(modifier = Modifier.fillMaxSize()) {
            TopSection()

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
            ) {
                LoginTextField(
                    label = "Username",
                    trailing = "",
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                LoginTextField(
                    label = "Password",
                    trailing = "Forgot?",
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isSystemInDarkTheme()) BlueGray else Black,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(size = 4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    onClick = {}
                ) {
                    Text(
                        text = "Log In",
                        style = Typography.labelMedium.copy(fontWeight = FontWeight.Medium)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .padding(horizontal = 40.dp)
            ) {
                Spacer(modifier = modifier.height(24.dp))

                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Or continue with",
                    style = Typography.labelMedium.copy(fontWeight = FontWeight.Medium)
                )

                Spacer(modifier = modifier.height(24.dp))

                SocialMediaLogin(logo = R.drawable.google, text = "Google")

                Spacer(modifier = modifier.height(8.dp))

                SocialMediaLogin(logo = R.drawable.facebook, text = "Facebook")
            }
        }
    }
}

@Composable
private fun TopSection() {

    val uiColor = if (isSystemInDarkTheme()) Color.White else Black
    Box(
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.48f),
            painter = painterResource(R.drawable.shape),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
        )

        Row(
            modifier = Modifier.padding(72.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(80.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(id = R.string.app_name),
//                tint = uiColor
            )
            Spacer(modifier = Modifier.width(4.dp))
            Column {
                Text(
                    text = stringResource(id = R.string.cherry_mate),
                    style = Typography.headlineLarge,
                    color = uiColor,
//                            fontFamily = Rubik,
//                            fontSize = 32.sp
                )
                Text(
                    text = stringResource(id = R.string.enjoy_chat),
                    style = Typography.titleMedium,
                    color = uiColor,
//                            fontFamily = Roboto,
//                            fontSize = 24.sp
                )
            }
        }
        Text(
            modifier = Modifier
                .padding(top = 10.dp)
                .align(alignment = Alignment.BottomCenter),
            text = stringResource(id = R.string.login),
            style = Typography.headlineLarge,
            color = uiColor,
//                    fontFamily = Roboto,
//                    fontSize = 24.sp
        )
    }
}