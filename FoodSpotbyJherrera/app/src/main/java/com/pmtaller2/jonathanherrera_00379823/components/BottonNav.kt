package com.pmtaller2.jonathanherrera_00379823.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBar(navController: NavController, currentRoute: String?) {
    NavigationBar {
        val items = listOf(
            BottomNavItem.Restaurantes,
            BottomNavItem.Buscar,
            BottomNavItem.Ordenes
        )

        items.forEach { item ->
            val icon = when (item.route) {
                "restaurantes" -> Icons.Default.Home
                "buscar" -> Icons.Default.Search
                "ordenes" -> Icons.Default.Menu
                else -> Icons.Default.Home
            }

            NavigationBarItem(
                icon = { Icon(imageVector = icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}

sealed class BottomNavItem(val route: String, val title: String, val icon: ImageVector) {
    object Restaurantes : BottomNavItem("restaurantes", "Restaurantes", Icons.Default.Home)
    object Buscar : BottomNavItem("buscar", "Buscar", Icons.Default.Search)
    object Ordenes : BottomNavItem("ordenes", "Órdenes", Icons.Default.Menu)
}