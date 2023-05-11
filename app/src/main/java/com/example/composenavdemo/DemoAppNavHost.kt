package com.example.composenavdemo

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun DemoAppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = "home_screen"){

        composable(route = "home_screen"){
            HomeScreen(navController)
        }

        composable(route = "second_screen"){
            SecondScreen()
        }
    }
}