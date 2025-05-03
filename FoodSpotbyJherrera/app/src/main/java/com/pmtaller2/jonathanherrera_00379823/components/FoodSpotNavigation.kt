package com.pmtaller2.jonathanherrera_00379823.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pmtaller2.jonathanherrera_00379823.screens.BuscarScreen
import com.pmtaller2.jonathanherrera_00379823.screens.MainScreen
import com.pmtaller2.jonathanherrera_00379823.screens.OrdenesScreen
import com.pmtaller2.jonathanherrera_00379823.screens.RestaurantDetailScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodSpotNavigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val isMainRoute = currentRoute == BottomNavItem.Restaurantes.route ||
            currentRoute == BottomNavItem.Buscar.route ||
            currentRoute == BottomNavItem.Ordenes.route

    Scaffold(
        bottomBar = {
            if (isMainRoute) {
                BottomBar(navController = navController, currentRoute = currentRoute)
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Restaurantes.route,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(BottomNavItem.Restaurantes.route) {
                MainScreen(navController)
            }
            composable(BottomNavItem.Buscar.route) {
                BuscarScreen()
            }
            composable(BottomNavItem.Ordenes.route) {
                OrdenesScreen()
            }

            composable(
                route = "restaurant/{id}",
                arguments = listOf(navArgument("id") { type = NavType.StringType })
            ) { backStackEntry ->
                val restaurantId = backStackEntry.arguments?.getString("id")
                RestaurantDetailScreen(restaurantId, navController)
            }

        }
    }
}