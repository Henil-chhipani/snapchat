package com.example.snapchat.ui.components.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.snapchat.ui.screens.CameraScreen.CameraScreen
import com.example.snapchat.ui.screens.ChatScreen.ChatScreen
import com.example.snapchat.ui.screens.LocationScreen.LocationScreen
import com.example.snapchat.ui.screens.ReelsScreen.ReelsScreen
import com.example.snapchat.ui.screens.StoryScreen.StoryScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavItem.Camera.screen_route) {
        composable(BottomNavItem.Camera.screen_route) {
            CameraScreen()
        }
        composable(BottomNavItem.Location.screen_route) {
            LocationScreen()
        }
        composable(BottomNavItem.Chat.screen_route) {
            ChatScreen()
        }
        composable(BottomNavItem.Story.screen_route) {
            StoryScreen()
        }
        composable(BottomNavItem.Reels.screen_route) {
            ReelsScreen()
        }
    }
}