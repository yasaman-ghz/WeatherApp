package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.models.Weather
import com.example.weatherapp.R
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
            description= "Lots of fog, but it's pretty warm out there!",
            iconId= R.drawable.today
        )
        Image(
            painter = painterResource(today.iconId),
            contentDescription = "Today's weather"
        )

        Text(text = today.description,
            style = MaterialTheme.typography.displayLarge)

        Spacer(modifier = Modifier
            .height(10.dp))

        //HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        Text(text = "${today.dayOfWeek} ${today.temp}",
            style = MaterialTheme.typography.titleLarge)

        Text(text = "${today.tempFeels}")
    }
}