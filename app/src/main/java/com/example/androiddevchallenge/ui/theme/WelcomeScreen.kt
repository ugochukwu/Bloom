package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen() {

}

@Preview
@Composable
fun WelcomeScreenPreview() {

}

@Preview
@Composable
fun SignInButtonPreview() {
    MyTheme {
        val onClick: () -> Unit = {}
        SignInButton(onClick)
    }
}

@Composable
fun SignInButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary),
        modifier = modifier
            .height(48.dp)
            .fillMaxWidth(),
        onClick = onClick,
        shape = MaterialTheme.shapes.medium
    ) {
        Text("Create account", style = MaterialTheme.typography.button)
    }
}