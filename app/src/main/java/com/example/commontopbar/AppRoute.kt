package com.example.commontopbar

sealed class AppRoute(val route: String) {
    data object Home: AppRoute("home")
    data object  A: AppRoute("a")
    data object  B: AppRoute("b")
}