package com.example.figmajetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.figmajetpack.Pantallas.Actualidad01Nav
import com.example.figmajetpack.Pantallas.Actualidad02Nav
import com.example.figmajetpack.Pantallas.Actualidad03Nav
import com.example.figmajetpack.Pantallas.ActualidadNav
import com.example.figmajetpack.Pantallas.ContactoNav
import com.example.figmajetpack.Pantallas.CuriosidadesNav
import com.example.figmajetpack.Pantallas.InicioNav
import com.example.figmajetpack.Pantallas.ReviewsNav
import com.example.figmajetpack.ui.theme.FigmaJetPackTheme

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
                        composable(Routes.InicioScreen.route) { InicioNav(navController = navController) }
                        composable(Routes.ActualidadScreen.route) { ActualidadNav(navController = navController) }
                        composable(Routes.ReviewsScreen.route) { ReviewsNav(navController = navController) }
                        composable(Routes.CuriosidadesScreen.route) { CuriosidadesNav(navController = navController) }
                        composable(Routes.ContactoScreen.route) { ContactoNav(navController = navController) }
                        composable(Routes.Act1Screen.route) { Actualidad01Nav(navController = navController) }
                        composable(Routes.Act2Screen.route) { Actualidad02Nav(navController = navController) }
                        composable(Routes.Act3Screen.route) { Actualidad03Nav(navController = navController) }
                    }
                }
            }
        }
    }
}