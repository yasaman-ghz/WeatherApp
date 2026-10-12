package com.example.weatherapp.models

data class Weather(
    val id: Int,
    val date: String,
    val time: String,
    val dayOfWeek: String,
    val location: String,
    val high: Int,
    val low: Int,
    val windSpeed: Int,
    val windDir: String,
    val humidity: Int,
    val description: String,
    val iconId: Int
)

