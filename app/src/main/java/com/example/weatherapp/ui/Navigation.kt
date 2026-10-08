package com.example.weatherapp.ui

import android.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Today
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp.ui.screens.CurrentWeather
import com.example.weatherapp.ui.screens.ForecastWeather

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()
    var selectedIndex by remember { mutableIntStateOf(0) } // default set to 0
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceTint,
                    titleContentColor = MaterialTheme.colorScheme.surfaceBright,
                ),
                title = {
                    Text("Your Weather App")
                }
            )
        },
        bottomBar = {
            NavigationBar(containerColor = MaterialTheme.colorScheme.surfaceTint,
                contentColor = MaterialTheme.colorScheme.surfaceBright,  //just for fun
                windowInsets = NavigationBarDefaults.windowInsets)
            {
                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Default.Today, contentDescription = "Today") },
                    label = { Text("Today", color=MaterialTheme.colorScheme.surfaceBright) },
                    selected = selectedIndex==0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(route="Today"){
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true  // remember the previous state
                            restoreState = true
                        }
                    }
                )

                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Default.CalendarMonth, contentDescription = "Forecast") },
                    label = { Text("Forecast", color=MaterialTheme.colorScheme.surfaceBright) },
                    selected = selectedIndex==0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(route="Forecast"){
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    ) {
            innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "Today",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = "Today") {
                CurrentWeather()
            }
            composable(route = "Forecast") {
                ForecastWeather()
            }
        }

    }


}