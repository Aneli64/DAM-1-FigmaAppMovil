package com.example.figmajetpack.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.figmajetpack.R
import com.example.figmajetpack.Routes
import com.example.figmajetpack.inicio.Inicio
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun InicioNav(navController: NavController) {
    Inicio(
        wallpaper = painterResource(R.drawable.inicio_image_5),
        actualidadText = "Actualidad",
        contentText1 = "¡El nuevo GTA está a la vuelta de la esquina!",
        contentText2 = "Reviews más recientes",
        botonReview = { navController.navigate(Routes.ReviewsScreen.route) },
        botonActualidad = { navController.navigate(Routes.ActualidadScreen.route) },
        inicioButton = { navController.navigate(Routes.InicioScreen.route) },
        contactoButton = { navController.navigate(Routes.ContactoScreen.route) },
        botonCuriosidades = {navController.navigate(Routes.CuriosidadesScreen.route)  },
        curiosidadesText = "Curiosidades\n",
        reviewsText = "Reviews",
        modifier = Modifier
            .rowWeight(1.0f)
            .columnWeight(1.0f)
    )
}
