package com.example.commontopbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AppRoute.Home.route
    ) {
        composable(AppRoute.Home.route) {
            HomeScreen(
                onNavigateTotA = { navController.navigate(AppRoute.A.route) }
            )
        }

        composable(AppRoute.A.route) {
            AScreen(
                navController = navController,
                onNavigateToB = { navController.navigate(AppRoute.B.route) }
            )
        }

        composable(AppRoute.B.route) {
            BScreen()
        }
    }
}