package com.example.weatherapp.models

import java.sql.Time
import java.time.DayOfWeek
import java.util.Date


// This is a data class for weather.
data class Weather(
    val id: Int,
    val date: Date,
    val time: Time,  // Time of the day
    val dayOfWeek: DayOfWeek,
    val location: String,  // Location of the city, e.g. Halifax, NS
    val temp: Int,  // Temperature in degrees of centigrade
    val tempFeels: Int,  // Temperature feels like in degrees of centigrade
    val windSpeed: Int,  // Wind speed in kph
    val windDir: String,  // Wind direction, e.g. SW (South West)
    val humidity: Int,  // Humidity as an integer from 0 to 100
    val description: String, // Description of the weather
    val iconId: Int  // Holds the id for this object's icon that is made through Drawable
)

