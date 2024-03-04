package com.example.figmajetpack.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.figmajetpack.R
import com.example.figmajetpack.Routes
import com.example.figmajetpack.actualidad01.Actualidad01
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun Actualidad01Nav(navController: NavController){
    Actualidad01(
        wallpaper = painterResource(R.drawable.actualidad_01_image_5),
        inicioActualidadTextContent4 = "Los fans ponen la fecha entre el 3 y 5 de diciembre\nYa solo el impacto del anuncio del trailer fue brutal en redes sociales. El hype por el juego es completamente increíble, y el pasado 8 de noviembre, Rockstar batió el récord de tuit con temática de videojuegos con más me gusta y visualizaciones de la historia, con más de 1,5 millones de me gusta y 178 millones de visitas.",
        inicioActualidadTextContent5 = "El tamaño de su mapa jugable está aun por saber, anque en base a algunas filtraciones de confianza, podria tratarse de un mapa que prácticamente duplica el mapa de la anterior entrega",
        image4ImageContent = painterResource(R.drawable.actualidad_01_image_4),
        image8ImageContent = painterResource(R.drawable.actualidad_01_image_8),
        inicioButton = {navController.navigate(Routes.InicioScreen.route) },
        contactoButton = {navController.navigate(Routes.ContactoScreen.route)},
        reviewsButton = {navController.navigate(Routes.ReviewsScreen.route)},
        curiosidadesButton = {navController.navigate(Routes.CuriosidadesScreen.route)},
        actualidadButton = {navController.navigate(Routes.ActualidadScreen.route) },
        inicioActualidadTextContent = "Actualidad",
        inicioActualidadTextContent2 = "Reviews",
        inicioActualidadTextContent3 = "Curiosidades\n",
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}