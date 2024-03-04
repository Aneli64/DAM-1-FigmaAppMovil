package com.example.figmajetpack.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.figmajetpack.R
import com.example.figmajetpack.Routes
import com.example.figmajetpack.contacto.Contacto
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun ContactoNav(navController: NavController){
    Contacto(
        wallpaper = painterResource(R.drawable.contacto_image_5),
        inicioActualidadTextContent = "@GameOn",
        inicioActualidadTextContent2 = "@GameOn",
        inicioActualidadTextContent3 = "gameon@gmail.com",
        inicioActualidadTextContent4 = "GameOnYT",
        curiosidadesButton = {navController.navigate(Routes.CuriosidadesScreen.route)},
        inicioActualidadTextContent6 = "Actualidad",
        actualidadButton = {navController.navigate(Routes.ActualidadScreen.route) },
        inicioActualidadTextContent7 = "Curiosidades\n",
        inicioActualidadTextContent5 = "Reviews",
        reviewsButton = {navController.navigate(Routes.ReviewsScreen.route)},
        contactoButton = {navController.navigate(Routes.ContactoScreen.route)},
        inicioButton = {navController.navigate(Routes.InicioScreen.route) },
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}