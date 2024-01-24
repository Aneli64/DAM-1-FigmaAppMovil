package com.example.figmajetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import com.example.figmajetpack.inicio.Inicio
import com.example.figmajetpack.ui.theme.FigmaJetPackTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.figmajetpack.actualidad.Actualidad
import com.example.figmajetpack.curiosidades.Curiosidades
import com.example.figmajetpack.reviews.Reviews
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmaJetPackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController, startDestination = Routes.InicioScreen.route
                    ) {
                        composable(Routes.InicioScreen.route) {
                            Inicio(
                                actualidadText = "Actualidad",
                                contentText1 = "¡El nuevo GTA está a la vuelta de la esquina!",
                                contentText2 = "Reviews más recientes",
                                botonReview = { navController.navigate(Routes.ReviewsScreen.route) },
                                botonActualidad = { navController.navigate(Routes.ActualidadScreen.route) },
                                botonCuriosidades = { navController.navigate(Routes.CuriosidadesScreen.route)},
                                curiosidadesText = "Curiosidades\n",
                                reviewsText = "Reviews",
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                        composable(Routes.ActualidadScreen.route) { Actualidad() }
                        composable(Routes.ReviewsScreen.route) { Reviews() }
                        composable(Routes.CuriosidadesScreen.route) { Curiosidades() }
                    }

                }
            }
        }
    }
}