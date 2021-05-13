package com.example.androiddevchallenge.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.AnnotatedString.*
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.components.LoginButton
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun LoginScreen() {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        var emailAddress by remember { mutableStateOf("") }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text(
                "Log in with email",
                style = MaterialTheme.typography.h1,
                modifier = Modifier.paddingFromBaseline(184.dp)
            )
            OutlinedTextField(
                value = emailAddress,
                onValueChange = {},
                placeholder = { Text("Email address") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            )
            OutlinedTextField(
                value = emailAddress,
                onValueChange = {},
                placeholder = { Text("Password (8+ characters") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .height(56.dp)
            )
            Text(
                text = legalInfo(),
                modifier = Modifier
                    .fillMaxWidth()
                    .paddingFromBaseline(top = 24.dp, bottom = 16.dp),
                textAlign = TextAlign.Center
            )
            LoginButton(onClick = {})

        }
    }
}

@Composable
private fun legalInfo(): AnnotatedString {
    val text = "By clicking below, you agree to our Terms of Use and consent to our Privacy Policy"
    val termsOfUseStartIdx = text.indexOfFirst { it == 'T' }
    val privacyPolicyIdx = text.indexOfFirst { it == 'P' }
    return AnnotatedString(
        text,
        spanStyles = listOf(
            Range(
                SpanStyle(textDecoration = TextDecoration.Underline),
                start = termsOfUseStartIdx,
                end = termsOfUseStartIdx + 10
            ),
            Range(
                SpanStyle(textDecoration = TextDecoration.Underline),
                start = privacyPolicyIdx,
                end = text.length
            )
        )
    )
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightLoginScreenPreview() {
    MyTheme {
        LoginScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkLoginScreenPreview() {
    MyTheme(darkTheme = true) {
        LoginScreen()
    }
}