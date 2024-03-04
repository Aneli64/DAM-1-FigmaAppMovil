package com.example.figmajetpack.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.figmajetpack.R
import com.example.figmajetpack.Routes
import com.example.figmajetpack.actualidad02.Actualidad02
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun Actualidad02Nav(navController: NavController){
    Actualidad02(
        wallpaper = painterResource(R.drawable.actualidad_02_image_5),
        image13ImageContent = painterResource(R.drawable.actualidad_02_image_13),
        inicioActualidadTextContent = "The Game Awards, el evento de referencia en la industria del videojuego que premia a los mejores títulos lanzados durante el año regresa el 7 de diciembre de 2023 desde Los Ángeles. La celebración también se ha convertido en una cita anual en la que algunas de las empresas desarrolladoras de referencia anuncian nuevos juegos y novedades para títulos existentes.",
        inicioActualidadTextContent2 = "\nBaldur's Gate 3 y Alan Wake 2 son, con ocho, los juegos que han obtenido más nominaciones. Le siguen Marvel's Spider-Man 2 con 7 nominaciones y Super Mario Bros. Wonder y The Legend of Zelda: Tears of the Kingdom con cinco cada uno.",
        image34ImageContent = painterResource(R.drawable.actualidad_02_image_34),
        image35ImageContent = painterResource(R.drawable.actualidad_02_image_35),
        imagenInicioButton = {navController.navigate(Routes.InicioScreen.route) },
        contactoButton = {navController.navigate(Routes.ContactoScreen.route)},
        actualidadButton = {navController.navigate(Routes.ActualidadScreen.route) },
        curiosidadesButton = {navController.navigate(Routes.CuriosidadesScreen.route)},
        reviewsButton = {navController.navigate(Routes.ReviewsScreen.route)},
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}