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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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

@Composable
fun CurrentWeather()
{
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding()
            .background(color=Color.DarkGray)
    ){
        val today = Weather(
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
            description= "Sunny",
            iconId= R.drawable.day
        )

        val imageModifier= Modifier
            .height(90.dp)
            .width(90.dp)
            .clip(CircleShape)
            .border(color = Color.LightGray, width = 1.dp, shape = CircleShape)
            .background(color = Color.LightGray)
        Image(                                      // Reference: https://developer.android.com/develop/ui/compose/graphics/images/customize
            painter = painterResource(today.iconId ),
            contentDescription = "Today's weather",
            modifier = imageModifier
        )


        Text(text = "${today.dayOfWeek}, ${today.time}",
            style = MaterialTheme.typography.titleLarge,
            fontSize = 25.sp,
            color= Color.LightGray
        )
        Spacer(modifier = Modifier
            .height(5.dp))

        //HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        Text(text = "${today.description}, ${today.temp}°C",
            style = MaterialTheme.typography.titleLarge,
            fontSize = 19.sp,
            color= Color.LightGray
        )
        Spacer(modifier = Modifier
            .height(3.dp))
        Text(
            text = "Feels: ${today.tempFeels}°C",
            fontSize = 15.sp,
            color = Color.LightGray
        )
        Spacer(modifier = Modifier
            .height(3.dp))
        Text(
            text="Wind: ${today.windSpeed} kph, towards ${today.windDir}",
            fontSize = 15.sp,
            color = Color.LightGray
        )
        Spacer(modifier = Modifier
            .height(3.dp))
        Text(
            text="Humidity: ${today.humidity}%",
            fontSize = 15.sp,
            color = Color.LightGray
        )

    }
}