package com.example.androiddevchallenge.ui.components

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
import com.example.androiddevchallenge.ui.theme.MyTheme


@Composable
fun SignUpButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    BloomButton(label = "Create Account", onClick = onClick, modifier = modifier)
}

@Composable
fun BloomButton(onClick: () -> Unit, label: String, modifier: Modifier = Modifier) {
    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary),
        modifier = modifier
            .height(48.dp)
            .fillMaxWidth(),
        onClick = onClick,
        shape = MaterialTheme.shapes.medium
    ) {
        Text(label, style = MaterialTheme.typography.button)
    }
}

@Preview
@Composable
fun SignInButtonPreview() {
    MyTheme {
        val onClick: () -> Unit = {}
        SignUpButton(onClick)
    }
}

@Preview
@Composable
fun LoginButtonPreview() {
    MyTheme {
        LoginButton({})
    }
}

@Composable
fun LoginButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    BloomButton(onClick = onClick, label = "Log in", modifier = modifier.fillMaxWidth())
}