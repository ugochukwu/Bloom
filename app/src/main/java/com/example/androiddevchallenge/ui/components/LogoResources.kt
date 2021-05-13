package com.example.androiddevchallenge.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.R

@Composable
fun logoResource() =
    if (MaterialTheme.colors.isLight) R.drawable.ic_light_welcome_illos else R.drawable.ic_dark_welcome_illos

@Composable
fun welcomeBackgroundResource() =
    if (MaterialTheme.colors.isLight) R.drawable.ic_light_welcome_bg else R.drawable.ic_dark_welcome_bg

@Composable
fun bloomLogoRessource() =
    if (MaterialTheme.colors.isLight) R.drawable.ic_light_logo else R.drawable.ic_dark_logo
