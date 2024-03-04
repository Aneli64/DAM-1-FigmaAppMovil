package com.example.figmajetpack

sealed class Routes(val route: String) {

    object InicioScreen : Routes("inicio")
    object ActualidadScreen : Routes("actualidad")
    object ReviewsScreen : Routes("reviews")
    object CuriosidadesScreen : Routes("curiosidades")
    object ContactoScreen : Routes("contacto")
    object Act1Screen : Routes("actualidad 1")
    object Act2Screen : Routes("actualidad 2")
    object Act3Screen : Routes("actualidad 3")
}