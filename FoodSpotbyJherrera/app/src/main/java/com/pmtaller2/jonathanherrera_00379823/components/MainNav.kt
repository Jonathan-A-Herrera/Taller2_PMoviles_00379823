package com.pmtaller2.jonathanherrera_00379823.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pmtaller2.jonathanherrera_00379823.screens.MainScreen
import com.pmtaller2.jonathanherrera_00379823.screens.BuscarScreen
import com.pmtaller2.jonathanherrera_00379823.screens.OrdenesScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainNav() {
    val navController = rememberNavController()
    MainNavContent(navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainNavContent(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            val shouldShowBottomBar = currentRoute in listOf(
                BottomNavItem.Restaurantes.route,
                BottomNavItem.Buscar.route,
                BottomNavItem.Ordenes.route
            )

            if (shouldShowBottomBar) {
                BottomBar(navController = navController, currentRoute = currentRoute)
            }
        }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Restaurantes.route,
            modifier = Modifier.padding(padding)
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
        }
    }
}