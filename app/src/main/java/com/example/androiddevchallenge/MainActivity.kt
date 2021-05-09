/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.SignInButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
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
                    .fillMaxSize()
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
                        .align(CenterHorizontally)
                )
                Text(
                    "Beautiful home garden solutions",
                    style = MaterialTheme.typography.subtitle1,
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .paddingFromBaseline(top = 32.sp, bottom = 40.sp)
                )
                SignInButton(onClick = {}, modifier = Modifier.padding(horizontal = 16.dp))
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}

@Composable
fun logoResource() =
    if (MaterialTheme.colors.isLight) R.drawable.ic_dark_welcome_illos else R.drawable.ic_light_welcome_illos

@Composable
fun welcomeBackgroundResource() =
    if (MaterialTheme.colors.isLight) R.drawable.ic_dark_welcome_bg else R.drawable.ic_light_welcome_bg

@Composable
fun bloomLogoRessource() =
    if (MaterialTheme.colors.isLight) R.drawable.ic_dark_logo else R.drawable.ic_light_logo