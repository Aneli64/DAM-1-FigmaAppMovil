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
import com.example.figmajetpack.contacto.Contacto
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
                                inicioButton = { navController.navigate(Routes.InicioScreen.route) },
                                contactoButton = { navController.navigate(Routes.ContactoScreen.route) },
                                botonCuriosidades = { navController.navigate(Routes.CuriosidadesScreen.route) },
                                curiosidadesText = "Curiosidades\n",
                                reviewsText = "Reviews",
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                        composable(Routes.ActualidadScreen.route)
                        {
                            Actualidad(
                                inicioActualidadTextContent4 = "Rockstar se pronuncia sobre su nueva entrega, GTA VI prometiendo  su trailer de lanzamiento pronto, ¿2025?",
                                inicioActualidadTextContent5 = "El galardón de premios anual va tocando, dentro de nada tendremos premios sobre nuestros videojuegos favoritos",
                                inicioActualidadTextContent6 = "La demo de Reisdent Evil 4 Remake VR llegará muy pronto, ya hay fecha para el DLC gratuito que permitirá jugar a esta entrega en VR",
                                reviewsButton = { navController.navigate(Routes.ReviewsScreen.route) },
                                actualidadButton = { navController.navigate(Routes.ActualidadScreen.route) },
                                curiosidadesButton = { navController.navigate(Routes.CuriosidadesScreen.route) },
                                inicioActualidadTextContent2 = "Actualidad",
                                inicioActualidadTextContent3 = "Curiosidades\n",
                                inicioActualidadTextContent = "Reviews",
                                inicioButton = { navController.navigate(Routes.InicioScreen.route) },
                                contactoButton = { navController.navigate(Routes.ContactoScreen.route) },
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                        composable(Routes.ReviewsScreen.route) {
                            Reviews(
                                reviewsButton = { navController.navigate(Routes.ReviewsScreen.route)},
                                actualidadButton = { navController.navigate(Routes.ActualidadScreen.route) },
                                curiosidadesButton = { navController.navigate(Routes.CuriosidadesScreen.route) },
                                inicioActualidadTextContent2 = "Actualidad",
                                inicioActualidadTextContent3 = "Curiosidades\n",
                                inicioActualidadTextContent = "Reviews",
                                inicioButton = { navController.navigate(Routes.InicioScreen.route) },
                                contactoButton = { navController.navigate(Routes.ContactoScreen.route) },
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                        composable(Routes.CuriosidadesScreen.route)
                        {
                            Curiosidades(
                                inicioActualidadTextContent4 = "GTA V se trata de, videojuego mas caro en ser producido, alcanzando la cifra de 265 millones de dólares americanos",
                                inicioActualidadTextContent5 = "La saga más extensa de videojuegos le pertenece a Mega Man, de Capcom, desde su inicio en 1987",
                                inicioActualidadTextContent = "Reviews",
                                reviewsButon = { navController.navigate(Routes.ReviewsScreen.route) },
                                actualidadButon = { navController.navigate(Routes.ActualidadScreen.route) },
                                inicioActualidadTextContent3 = "Curiosidades\n",
                                inicioActualidadTextContent2 = "Actualidad",
                                curiosidadesButon = { navController.navigate(Routes.CuriosidadesScreen.route) },
                                inicioButton = { navController.navigate(Routes.InicioScreen.route) },
                                contactoButton = { navController.navigate(Routes.ContactoScreen.route) },
                                modifier = Modifier
                                    .rowWeight(1.0f)
                                    .columnWeight(1.0f)
                            )
                        }
                        composable(Routes.ContactoScreen.route){
                            Contacto(
                                inicioActualidadTextContent = "@GameOn",
                                inicioActualidadTextContent2 = "@GameOn",
                                inicioActualidadTextContent3 = "gameon@gmail.com",
                                inicioActualidadTextContent4 = "GameOnYT",
                                curiosidadesButton = { navController.navigate(Routes.CuriosidadesScreen.route) },
                                inicioActualidadTextContent6 = "Actualidad",
                                actualidadButton = { navController.navigate(Routes.ActualidadScreen.route) },
                                inicioActualidadTextContent7 = "Curiosidades\n",
                                inicioActualidadTextContent5 = "Reviews",
                                reviewsButton = { navController.navigate(Routes.ReviewsScreen.route) },
                                contactoButton = { navController.navigate(Routes.ContactoScreen.route) },
                                inicioButton = { navController.navigate(Routes.InicioScreen.route) },
                                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                            )
                        }
                    }

                }
            }
        }
    }
}