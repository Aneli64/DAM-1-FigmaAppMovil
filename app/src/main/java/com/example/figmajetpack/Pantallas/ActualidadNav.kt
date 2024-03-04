package com.example.figmajetpack.Pantallas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.figmajetpack.R
import com.example.figmajetpack.Routes
import com.example.figmajetpack.actualidad.Actualidad
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

@Composable
fun ActualidadNav(navController: NavController){
    Actualidad(
        wallpaper = painterResource(R.drawable.actualidad_image_5),
        inicioActualidadTextContent4 = "Rockstar se pronuncia sobre su nueva entrega, GTA VI prometiendo  su trailer de lanzamiento pronto, ¿2025?",
        inicioActualidadTextContent5 = "El galardón de premios anual va tocando, dentro de nada tendremos premios sobre nuestros videojuegos favoritos",
        inicioActualidadTextContent6 = "La demo de Reisdent Evil 4 Remake VR llegará muy pronto, ya hay fecha para el DLC gratuito que permitirá jugar a esta entrega en VR",
        reviewsButton = {navController.navigate(Routes.ReviewsScreen.route)},
        actualidadButton = {navController.navigate(Routes.ActualidadScreen.route) },
        curiosidadesButton = {navController.navigate(Routes.CuriosidadesScreen.route)},
        inicioActualidadTextContent2 = "Actualidad",
        inicioActualidadTextContent3 = "Curiosidades\n",
        inicioActualidadTextContent = "Reviews",
        inicioButton = {navController.navigate(Routes.InicioScreen.route) },
        doubleTapButtonAct1 = {navController.navigate(Routes.Act1Screen.route)},
        doubleTapButtonAct2 = {navController.navigate(Routes.Act2Screen.route)},
        doubleTapButtonAct3 = {navController.navigate(Routes.Act3Screen.route)},
        contactoButton = {navController.navigate(Routes.ContactoScreen.route)},
        modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
    )
}