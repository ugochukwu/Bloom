package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
        Button(modifier = Modifier
            .height(48.dp)
            .fillMaxWidth(),
            onClick = onClick,
            shape = MaterialTheme.shapes.medium) {
            Text("Create account")
        }
    }
}