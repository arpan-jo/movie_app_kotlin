package com.example.movieapp.navigation

enum class MovieScreens {
    HomeScreen,
    MovieDetailsScreen, ;

    companion object {
        fun fromRoute(route: String?): MovieScreens = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            MovieDetailsScreen.name -> MovieDetailsScreen
            else -> throw IllegalArgumentException("Route $route is not defined.")
        }
    }
}