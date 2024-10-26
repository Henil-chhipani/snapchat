package com.example.snapchat.ui.screens.DashBoard

import androidx.compose.foundation.background
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.snapchat.ui.components.Navigation.BottomNavigation
import com.example.snapchat.ui.components.Navigation.NavigationGraph

@Composable
fun DashBoardScreen() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier,
        bottomBar = {
            BottomNavigation(navController)
        }
    ) { it ->
        NavigationGraph(navController)
    }
}