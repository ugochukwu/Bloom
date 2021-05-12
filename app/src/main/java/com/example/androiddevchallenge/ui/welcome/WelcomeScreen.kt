package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.bloomLogoRessource
import com.example.androiddevchallenge.logoResource
import com.example.androiddevchallenge.ui.components.SignUpButton
import com.example.androiddevchallenge.welcomeBackgroundResource

@Composable
fun WelcomeScreen() {
    Surface(
        color = MaterialTheme.colors.primary, modifier = Modifier
            .fillMaxSize()
    ) {
        Box(Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(welcomeBackgroundResource()),
                contentDescription = "Welcome screen background illustration",
                modifier = Modifier.fillMaxSize()
            )
            Column(
                Modifier
                    .padding(top = 72.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = logoResource()),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(x = 88.dp)
                        .fillMaxWidth()
                )
                Image(
                    painter = painterResource(bloomLogoRessource()), contentDescription = null,
                    modifier = Modifier
                        .padding(top = 48.dp)
                )
                Text(
                    "Beautiful home garden solutions",
                    style = MaterialTheme.typography.subtitle1,
                    modifier = Modifier
                        .paddingFromBaseline(top = 32.sp)
                )

                SignUpButton(
                    onClick = {},
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 40.dp,
                        bottom = 8.dp
                    )
                )
                TextButton(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.textButtonColors(contentColor = if (MaterialTheme.colors.isLight) Color.White else pink900)
                ) {
                    Text("Log In")
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        WelcomeScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        WelcomeScreen()
    }
}