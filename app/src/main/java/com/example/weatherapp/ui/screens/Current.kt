package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.models.Weather
import com.example.weatherapp.R
import com.google.android.gms.maps.model.Circle
import java.sql.Time
import java.time.DayOfWeek
import java.util.Date


//
// Get today's weather
//

val hours= listOf(
   Weather(
        id = 1,
        date = Date(),
        time = Time(-10000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 17,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
   Weather(
        id = 2,
        date = Date(),
        time = Time(2),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 16,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
   Weather(
        id = 3,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
   Weather(
        id = 4,
        date = Date(),
        time = Time(1200000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 5,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 6,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 7,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 8,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 9,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 10,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 11,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 12,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 13,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 14,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 15,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 16,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 17,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 18,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 19,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 20,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 21,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 22,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 23,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    ),
    Weather(
        id = 24,
        date = Date(),
        time = Time(1100000),
        dayOfWeek = DayOfWeek.MONDAY,
        location = "Halifax",
        temp = 15,
        tempFeels = 22,
        windSpeed = 10,
        windDir = "South-West",
        humidity = 70,
        description = "Sunny",
        iconId = R.drawable.day
    )
)

@Composable
fun CurrentWeather()
{
    val primary_background = Color(0x3F607FC0)
    val current_hour_background = Color(0xEB908F9B)
    LazyColumn(modifier = Modifier
            .padding()
            .background(color = primary_background)) {
        items(hours) { hour ->
            if(hour.id == 1) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier

                        .height(350.dp)
                        .width(450.dp)
                        .padding()
                        .background(color = current_hour_background)
                ) {


                    val imageModifier = Modifier
                        .height(150.dp)
                        .width(150.dp)
                        .clip(CircleShape)
                        .border(color = Color.LightGray, width = 1.dp, shape = CircleShape)
                        .background(color = Color.LightGray)
                    Image(                                      // Reference: https://developer.android.com/develop/ui/compose/graphics/images/customize
                        painter = painterResource(hour.iconId),
                        contentDescription = "Today's weather",
                        modifier = imageModifier
                    )


                    Text(
                        text = "${hour.dayOfWeek}, ${hour.time}",
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 25.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )
                    Spacer(
                        modifier = Modifier
                            .height(5.dp)
                    )

                    Text(
                        text = "${hour.description}, ${hour.temp}°C",
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 23.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )
                    Spacer(
                        modifier = Modifier
                            .height(3.dp)
                    )
                    Text(
                        text = "Feels: ${hour.tempFeels}°C",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.surfaceBright
                    )
                    Spacer(
                        modifier = Modifier
                            .height(3.dp)
                    )
                    Text(
                        text = "Wind: ${hour.windSpeed} kph, towards ${hour.windDir}",
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
            }
        HorizontalDivider(Modifier, 2.dp, Color.LightGray)
        Row(modifier = Modifier.padding(10.dp)
        ) {

            val imageModifier = Modifier
                .height(90.dp)
                .width(90.dp)
                .clip(CircleShape)
                .border(color = Color.LightGray, width = 1.dp, shape = CircleShape)
                .background(color = Color.LightGray)
            Image(                                      // Reference: https://developer.android.com/develop/ui/compose/graphics/images/customize
                painter = painterResource(hour.iconId),
                contentDescription = "Today's weather",
                modifier = imageModifier
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.padding()) {
                Text(
                    text = "${hour.dayOfWeek}, ${hour.time}",
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 18.sp,
                    color = MaterialTheme.colorScheme.surfaceTint
                )
                Spacer(
                    modifier = Modifier
                        .height(5.dp)
                )

                Text(
                    text = "${hour.description}, ${hour.temp}°C",
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )

            }
        }
    }


}}