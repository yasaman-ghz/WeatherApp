package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
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
            description= "Lots of fog, but it's pretty warm out there!",
            iconId= R.drawable.today
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
            description= "Lots of fog, but it's pretty warm out there!",
            iconId= R.drawable.today
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
            description= "Lots of fog, but it's pretty warm out there!",
            iconId= R.drawable.today
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
            description= "Lots of fog, but it's pretty warm out there!",
            iconId= R.drawable.today
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
            description= "Lots of fog, but it's pretty warm out there!",
            iconId= R.drawable.today
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
            description= "Lots of fog, but it's pretty warm out there!",
            iconId= R.drawable.today
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
            description= "Lots of fog, but it's pretty warm out there!",
            iconId= R.drawable.today
        )
    )

    LazyColumn(
        modifier = Modifier.padding()
    ) {
        items(days) { day ->
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = day.iconId),
                    contentDescription = day.description,
                    modifier = Modifier.size(130.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Column {

                    Text(
                        "${day.dayOfWeek}",
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        day.description,
                        style = MaterialTheme.typography.headlineSmall
                    )


                }

            }
            HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)
        }


    }
}