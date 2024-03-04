package com.example.figmajetpack.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.figmajetpack.R
import com.example.figmajetpack.Routes
import com.example.figmajetpack.actualidad03.Actualidad03
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun Actualidad03Nav(navController: NavController){
    Actualidad03(
        wallpaper = painterResource(R.drawable.actualidad_03_image_5),
        image21ImageContent = painterResource(R.drawable.actualidad_03_image_21),
        inicioActualidadTextContent = "Leon S. Kennedy ha vuelto a copar las portadas de los medios especializados con su más reciente Resident Evil 4. De hecho, el último lanzamiento de Capcom ha logrado establecerse como uno de los candidatos a GOTY 2023, lo que evidencia el buen hacer de los desarrolladores nipones y la buena recepción del juego a nivel general.",
        inicioActualidadTextContent2 = "Sin embargo, y a pesar de que el título lleva entre nosotros desde el pasado mes de marzo, el equipo todavía tenía pendiente una versión adicional que hará las delicias de los usuarios de PS VR2: un modo VR que ya se prepara para salir al mercado.",
        image36ImageContent = painterResource(R.drawable.actualidad_03_image_36),
        image37ImageContent = painterResource(R.drawable.actualidad_03_image_37),
        reviewsButton = {navController.navigate(Routes.ReviewsScreen.route)},
        curiosidadesButton = {navController.navigate(Routes.CuriosidadesScreen.route)},
        actualidadButton = {navController.navigate(Routes.ActualidadScreen.route) },
        imagenInicioButton = {navController.navigate(Routes.InicioScreen.route) },
        contactoButton = {navController.navigate(Routes.ContactoScreen.route)},
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}