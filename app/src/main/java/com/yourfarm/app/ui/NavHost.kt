package com.yourfarm.app.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = "flock_list") {
        composable("flock_list") { FlockListScreen(onAddClick = { navController.navigate("add_flock") }) }
        composable("add_flock") { AddFlockScreen(onSave = { _, _ -> /* вернется сюда */ }) }
        // Добавляйте остальные экраны по аналогии
    }
}
