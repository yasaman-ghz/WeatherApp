package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import com.example.weatherapp.models.Weather
import java.sql.Time
import java.time.DayOfWeek
import java.util.Date

@Composable
fun ForecastWeather(){

    // Create a static list of Pokemon characters
    val days = listOf(
        Weather(
            id=1,
            date= Date(),
            time= Time(3000000),
            dayOfWeek= DayOfWeek.MONDAY,
            location= "Halifax",
            temp= 20,
            tempFeels= 22,
            windSpeed= 10,
            windDir= "South-West",
            humidity= 70,
            description= "Thunder",
            iconId= R.drawable.thunder
        ),
        Weather(
            id=2,
            date= Date(),
            time= Time(3000000),
            dayOfWeek= DayOfWeek.TUESDAY,
            location= "Halifax",
            temp= 20,
            tempFeels= 22,
            windSpeed= 10,
            windDir= "South-West",
            humidity= 70,
            description= "Cloudy",
            iconId= R.drawable.cloudy_day_2
        ),
        Weather(
            id=3,
            date= Date(),
            time= Time(3000000),
            dayOfWeek= DayOfWeek.WEDNESDAY,
            location= "Halifax",
            temp= 20,
            tempFeels= 22,
            windSpeed= 10,
            windDir= "South-West",
            humidity= 70,
            description= "Sunny",
            iconId= R.drawable.day
        ),
        Weather(
            id=1,
            date= Date(),
            time= Time(3000000),
            dayOfWeek= DayOfWeek.THURSDAY,
            location= "Halifax",
            temp= 20,
            tempFeels= 22,
            windSpeed= 10,
            windDir= "South-West",
            humidity= 70,
            description= "Sunny",
            iconId= R.drawable.day
        ),
        Weather(
            id=1,
            date= Date(),
            time= Time(3000000),
            dayOfWeek= DayOfWeek.FRIDAY,
            location= "Halifax",
            temp= 20,
            tempFeels= 22,
            windSpeed= 10,
            windDir= "South-West",
            humidity= 70,
            description= "Rainy",
            iconId= R.drawable.rainy_7
        ),
        Weather(
            id=1,
            date= Date(),
            time= Time(3000000),
            dayOfWeek= DayOfWeek.SATURDAY,
            location= "Halifax",
            temp= 20,
            tempFeels= 22,
            windSpeed= 10,
            windDir= "South-West",
            humidity= 70,
            description= "Cloudy",
            iconId= R.drawable.cloudy_day_2
        ),
        Weather(
            id=1,
            date= Date(),
            time= Time(3000000),
            dayOfWeek= DayOfWeek.SUNDAY,
            location= "Halifax",
            temp= 20,
            tempFeels= 22,
            windSpeed= 10,
            windDir= "South-West",
            humidity= 70,
            description= "Sunny",
            iconId= R.drawable.day
        )
    )

    LazyColumn(
        modifier = Modifier.padding()
            .background(color=Color.DarkGray)
    ) {
        items(days) { day ->
            Row(modifier = Modifier.padding(10.dp)) {
                val imageModifier= Modifier
                    .height(90.dp)
                    .width(90.dp)
                    .clip(CircleShape)
                    .border(color = Color.LightGray, width = 1.dp, shape = CircleShape)
                    .background(color = Color.LightGray)
                Image(                                      // Reference: https://developer.android.com/develop/ui/compose/graphics/images/customize
                    painter = painterResource(day.iconId ),
                    contentDescription = "Today's weather",
                    modifier = imageModifier
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {

                    Text(
                        "${day.dayOfWeek}, ${day.temp}°C",
                        style = MaterialTheme.typography.headlineMedium,
                        fontSize = 18.sp,
                        color=Color.LightGray
                    )

                    Spacer(modifier = Modifier.height(1.dp))

                    Text(
                        "${day.description}, Feels: ${day.tempFeels}°C",
                        style = MaterialTheme.typography.headlineSmall,
                        fontSize = 16.sp,
                        color=Color.LightGray
                    )


                }

            }
            HorizontalDivider(Modifier, 2.dp, Color.LightGray)
        }


    }
}