package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import com.example.weatherapp.models.Weather

@Composable
fun ForecastWeather(){

    val primaryBackground = Color(0x3F607FC0)
    val iconBackground = Color(0xAF607FC0)

    val days = listOf(
        Weather(
            id=1,
            date= "Oct 9",
            time= "6:00 PM",
            dayOfWeek= "Fri",
            location= "Halifax",
            high= 18,
            low= 8,
            windSpeed= 10,
            windDir= "South-West",
            humidity= 70,
            description= "Sunny",
            iconId = R.drawable.day
        ),
        Weather(
            id = 2,
            date = "Oct 10",
            time = "7:00 PM",
            dayOfWeek = "Sat",
            location = "Halifax",
            high = 18,
            low = 10,
            windSpeed = 11,
            windDir = "South-West",
            humidity = 75,
            description = "Sunny",
            iconId = R.drawable.day
        ),
        Weather(
            id = 3,
            date = "Oct 11",
            time = "8:00 PM",
            dayOfWeek = "Sun",
            location = "Halifax",
            high = 17,
            low = 11,
            windSpeed = 11,
            windDir = "South-West",
            humidity = 77,
            description = "Cloudy",
            iconId = R.drawable.cloudy_day_2
        ),
        Weather(
            id = 4,
            date = "Oct 12",
            time = "9:00 PM",
            dayOfWeek = "Mon",
            location = "Halifax",
            high = 16,
            low = 9,
            windSpeed = 15,
            windDir = "South-West",
            humidity = 77,
            description = "Cloudy",
            iconId = R.drawable.cloudy_day_2
        ),
        Weather(
            id = 5,
            date = "Oct 13",
            time = "10:00 PM",
            dayOfWeek = "Tue",
            location = "Halifax",
            high = 15,
            low = 9,
            windSpeed = 15,
            windDir = "South",
            humidity = 79,
            description = "Thunder",
            iconId = R.drawable.thunder
        ),
        Weather(
            id = 6,
            date = "Oct 14",
            time = "11:00 PM",
            dayOfWeek = "Wed",
            location = "Halifax",
            high = 15,
            low = 6,
            windSpeed = 18,
            windDir = "South",
            humidity = 80,
            description = "Rainy",
            iconId = R.drawable.rainy_7
        ),
        Weather(
            id = 7,
            date = "Oct 15",
            time = "12:00 PM",
            dayOfWeek = "Thu",
            location = "Halifax",
            high = 15,
            low = 5,
            windSpeed = 20,
            windDir = "South-West",
            humidity = 80,
            description = "Sunny",
            iconId = R.drawable.day
        ),
        Weather(
            id = 8,
            date = "Oct 16",
            time = "1:00 AM",
            dayOfWeek = "Fri",
            location = "Halifax",
            high = 14,
            low = 8,
            windSpeed = 19,
            windDir = "South-West",
            humidity = 77,
            description = "Partially Cloudy",
            iconId = R.drawable.cloudy_day_2
        )
    )

    LazyColumn(
        modifier = Modifier
            .padding()
            .background(color = iconBackground)
    ) {
        items(days) { day ->
            Row(modifier = Modifier.padding(10.dp)) {
                Column(verticalArrangement = Arrangement.Center) {
                    val imageModifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .clip(CircleShape)
                        .border(color = iconBackground, width = 1.dp, shape = CircleShape)
                        .background(color = iconBackground)
                        .scale(1.2f)
                    Image(                                      // Reference: https://developer.android.com/develop/ui/compose/graphics/images/customize
                        painter = painterResource(day.iconId),
                        contentDescription = "Today's weather",
                        modifier = imageModifier
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        "${day.dayOfWeek}, ${day.date}",
                        style = MaterialTheme.typography.headlineMedium,
                        fontSize = 15.sp,
                        color=Color.DarkGray
                    )

                }
                Spacer(modifier = Modifier.width(15.dp))
                Column {

                    Text(
                        "High: ${day.high}°C, Low: ${day.low}°C",
                        style = MaterialTheme.typography.headlineSmall,
                        fontSize = 20.sp,
                        color=Color.DarkGray
                    )

                    Spacer(modifier = Modifier.height(1.dp))

                    Text(
                        "${day.description}, Humidity: ${day.humidity}%",
                        style = MaterialTheme.typography.headlineMedium,
                        fontSize = 15.sp,
                        color=Color.DarkGray
                    )

                    Spacer(modifier = Modifier.height(1.dp))

                    Text(
                        "Wind: ${day.windSpeed} kph, ${day.windDir}",
                        style = MaterialTheme.typography.headlineSmall,
                        fontSize = 15.sp,
                        color=Color.DarkGray
                    )

                }

            }
            HorizontalDivider(Modifier, 1.dp, Color.LightGray)
        }


    }
}