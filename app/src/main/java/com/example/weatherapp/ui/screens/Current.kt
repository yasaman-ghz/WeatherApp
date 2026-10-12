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
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.models.Weather
import com.example.weatherapp.R

val hours= listOf(
   Weather(
       id=1,
       date= "Oct 9",
       time= "6:00 PM",
       dayOfWeek= "Friday",
       location= "Halifax",
       high= 18,
       low= 15,
       windSpeed= 10,
       windDir= "South-West",
       humidity= 70,
       description= "Sunny",
        iconId = R.drawable.day
    ),
   Weather(
        id = 2,
        date = "Oct 9",
        time = "7:00 PM",
        dayOfWeek = "Friday",
        location = "Halifax",
        high = 18,
        low = 14,
        windSpeed = 11,
        windDir = "South-West",
        humidity = 75,
        description = "Sunny",
        iconId = R.drawable.day
    ),
   Weather(
        id = 3,
        date = "Oct 9",
        time = "8:00 PM",
        dayOfWeek = "Friday",
        location = "Halifax",
        high = 17,
        low = 14,
        windSpeed = 11,
        windDir = "South-West",
        humidity = 77,
        description = "Cloudy",
        iconId = R.drawable.cloudy_night_2
    ),
   Weather(
        id = 4,
        date = "Oct 9",
        time = "9:00 PM",
        dayOfWeek = "Friday",
        location = "Halifax",
        high = 16,
        low = 13,
        windSpeed = 15,
        windDir = "South-West",
        humidity = 77,
        description = "Cloudy",
        iconId = R.drawable.cloudy_night_2
    ),
    Weather(
        id = 5,
        date = "Oct 9",
        time = "10:00 PM",
        dayOfWeek = "Friday",
        location = "Halifax",
        high = 15,
        low = 13,
        windSpeed = 15,
        windDir = "South",
        humidity = 79,
        description = "Cloudy",
        iconId = R.drawable.cloudy_night_2
    ),
    Weather(
        id = 6,
        date = "Oct 9",
        time = "11:00 PM",
        dayOfWeek = "Friday",
        location = "Halifax",
        high = 15,
        low = 12,
        windSpeed = 18,
        windDir = "South",
        humidity = 80,
        description = "Cloudy",
        iconId = R.drawable.cloudy_night_2
    ),
    Weather(
        id = 7,
        date = "Oct 9",
        time = "12:00 PM",
        dayOfWeek = "Friday",
        location = "Halifax",
        high = 15,
        low = 10,
        windSpeed = 20,
        windDir = "South-West",
        humidity = 80,
        description = "Cloudy",
        iconId = R.drawable.cloudy_night_2
    )
)

@Composable
fun CurrentWeather()
{
    val primaryBackground = Color(0x3F607FC0)
    val currentHourBackground = Color(0xAF606FC0)      //0xC6AC8FBB
    val iconBackground = Color(0xAF606FC0)
    LazyColumn(modifier = Modifier
            .padding()
            .background(color = iconBackground)) {
        items(hours) { hour ->
            if (hour.id == 1) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier

                        .height(590.dp)
                        .width(450.dp)
                        .padding()
                    //.background(color = currentHourBackground)
                ) {

                    Text(
                        text = "${hour.dayOfWeek}, ${hour.date}",
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 27.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )
                    Spacer(
                        modifier = Modifier
                            .height(10.dp)
                    )
                    Text(
                        text = "${hour.time}",
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )
                    Spacer(
                        modifier = Modifier
                            .height(3.dp)
                    )

                    val imageModifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .scale(1.6f)
//                        .border(color = Color.LightGray, width = 1.dp, shape = CircleShape)
//                        .background(color = Color.LightGray)
                    Image(                                      // Reference: https://developer.android.com/develop/ui/compose/graphics/images/customize
                        painter = painterResource(hour.iconId),
                        contentDescription = "Today's weather",
                        modifier = imageModifier,
                        contentScale = ContentScale.Crop
                    )


                    Text(
                        text = "${hour.high}°C, Feels: ${hour.low}°C",
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 23.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )
                    Spacer(
                        modifier = Modifier
                            .height(3.dp)
                    )
                    Text(
                        text = "${hour.description}",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )
                    Spacer(
                        modifier = Modifier
                            .height(3.dp)
                    )
                    Text(
                        text = "Wind: ${hour.windSpeed} kph, ${hour.windDir}",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )
                    Spacer(
                        modifier = Modifier
                            .height(3.dp)
                    )
                    Text(
                        text = "Humidity: ${hour.humidity}%",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )


                }
                HorizontalDivider(Modifier, 1.dp, Color.LightGray)
            } else {

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
                            painter = painterResource(hour.iconId),
                            contentDescription = "Today's weather",
                            modifier = imageModifier
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Text(
                            "${hour.time}",
                            style = MaterialTheme.typography.headlineMedium,
                            fontSize = 15.sp,
                            color = Color.DarkGray
                        )

                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column {

                        Text(
                            "${hour.high}°C, Feels: ${hour.low}°C",
                            style = MaterialTheme.typography.headlineSmall,
                            fontSize = 20.sp,
                            color = Color.DarkGray
                        )

                        Spacer(modifier = Modifier.height(1.dp))

                        Text(
                            "${hour.description}, Humidity: ${hour.humidity}%",
                            style = MaterialTheme.typography.headlineMedium,
                            fontSize = 15.sp,
                            color = Color.DarkGray
                        )

                        Spacer(modifier = Modifier.height(1.dp))

                        Text(
                            "Wind: ${hour.windSpeed} kph, ${hour.windDir}",
                            style = MaterialTheme.typography.headlineSmall,
                            fontSize = 15.sp,
                            color = Color.DarkGray
                        )

                    }


                }
                HorizontalDivider(Modifier, 1.dp, Color.LightGray)


            }
        }
    }
}