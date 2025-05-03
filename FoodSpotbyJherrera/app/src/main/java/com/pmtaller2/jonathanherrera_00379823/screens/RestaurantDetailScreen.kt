package com.pmtaller2.jonathanherrera_00379823.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController
import restaurants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantDetailScreen(
    restaurantId: String?,
    navController: NavController
) {
    val restaurant = restaurants.find { it.id.toString() == restaurantId }
    var searchQuery by remember { mutableStateOf(TextFieldValue("")) }
    val context = LocalContext.current

    Scaffold(
        topBar = {
            Column {
                TopAppBar(
                    title = { Text(restaurant?.name ?: "Restaurante") },
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Atrás")
                        }
                    }
                )
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    label = { Text("Buscar platillo") }
                )
            }
        }
    ) { innerPadding ->
        if (restaurant != null) {
            val filteredMenu = restaurant.menu.filter {
                it.name.contains(searchQuery.text, ignoreCase = true)
            }

            LazyColumn(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                items(filteredMenu) { dish ->
                    Card(modifier = Modifier.padding(8.dp)) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = rememberAsyncImagePainter(dish.imageUrl),
                                contentDescription = dish.name,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(120.dp)
                            )
                            Text(
                                text = dish.name,
                                style = MaterialTheme.typography.titleMedium,
                                modifier = Modifier.padding(horizontal = 8.dp)
                            )
                            Text(
                                text = dish.description,
                                style = MaterialTheme.typography.bodySmall,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            )
                            Button(
                                onClick = {
                                    Toast.makeText(
                                        context,
                                        "${dish.name} añadido al carrito",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                },
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxWidth()
                            ) {
                                Text("Añadir al carrito")
                            }
                        }
                    }
                }
            }
        } else {
            Text(
                text = "Restaurante no encontrado",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}