package com.example.figmajetpack.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.figmajetpack.R
import com.example.figmajetpack.Routes
import com.example.figmajetpack.reviews.Reviews
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun ReviewsNav(navController: NavController){
    Reviews(
        wallpaper = painterResource(R.drawable.reviews_image_5),
        reviewsButton = {navController.navigate(Routes.ReviewsScreen.route)},
        actualidadButton = {navController.navigate(Routes.ActualidadScreen.route) },
        curiosidadesButton = {navController.navigate(Routes.CuriosidadesScreen.route)},
        inicioActualidadTextContent3 = "Curiosidades\n",
        inicioActualidadTextContent2 = "Actualidad",
        inicioActualidadTextContent = "Reviews",
        inicioButton = {navController.navigate(Routes.InicioScreen.route) },
        contactoButton = {navController.navigate(Routes.ContactoScreen.route)},
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}