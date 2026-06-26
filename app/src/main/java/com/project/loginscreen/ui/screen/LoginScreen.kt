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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.loginscreen.R
import com.project.loginscreen.ui.theme.Black

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Surface {
        Column(modifier = Modifier.fillMaxSize()) {
            TopSection()
            Spacer(modifier = Modifier.height(16.dp))
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
//            LoginTextField(label = "Username", trailing = "")
//            LoginTextField(label = "Password", trailing = "")
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
                    style = MaterialTheme.typography.headlineLarge,
                    color = uiColor,
//                            fontFamily = Rubik,
//                            fontSize = 32.sp
                )
                Text(
                    text = stringResource(id = R.string.enjoy_chat),
                    style = MaterialTheme.typography.titleMedium,
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
            style = MaterialTheme.typography.headlineLarge,
            color = uiColor,
//                    fontFamily = Roboto,
//                    fontSize = 24.sp
        )
    }
}