package com.example.androiddevchallenge

val GardenThemes =
    listOf("Desert chic", "Tiny terrariums", "Jungle vibes", "Easy care", "Statements")

val Flowers =
    listOf(
        Flower("Monsterra"),
        Flower("Aglaonema"),
        Flower("Peace lily"),
        Flower("Fiddle leaf tree"),
        Flower("Snake plant"),
        Flower("Pothos")
    )

data class Flower(val name: String, val desc: String)

fun Flower(name: String) = Flower(name,"This is a description" )