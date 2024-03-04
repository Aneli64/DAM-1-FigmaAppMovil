package com.example.figmajetpack.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.figmajetpack.R
import com.example.figmajetpack.Routes
import com.example.figmajetpack.curiosidades.Curiosidades
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun CuriosidadesNav(navController: NavController){
    Curiosidades(
        wallpaper = painterResource(R.drawable.curiosidades_image_5),
        inicioActualidadTextContent4 = "GTA V se trata de, videojuego mas caro en ser producido, alcanzando la cifra de 265 millones de dólares americanos",
        inicioActualidadTextContent5 = "La saga más extensa de videojuegos le pertenece a Mega Man, de Capcom, desde su inicio en 1987",
        inicioActualidadTextContent = "Reviews",
        reviewsButon = {navController.navigate(Routes.ReviewsScreen.route)},
        actualidadButon = {navController.navigate(Routes.ActualidadScreen.route) },
        inicioActualidadTextContent3 = "Curiosidades\n",
        inicioActualidadTextContent2 = "Actualidad",
        curiosidadesButon = {navController.navigate(Routes.CuriosidadesScreen.route)},
        inicioButton = {navController.navigate(Routes.InicioScreen.route) },
        contactoButton = {navController.navigate(Routes.ContactoScreen.route)},
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}