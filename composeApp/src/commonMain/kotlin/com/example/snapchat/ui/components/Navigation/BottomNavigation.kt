package com.example.snapchat.ui.components.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import snapchat.composeapp.generated.resources.Res
import snapchat.composeapp.generated.resources.ic_camera

@Composable
fun BottomNavigation(navController: NavController) {
    val item = listOf(
        BottomNavItem.Location,
        BottomNavItem.Chat,
        BottomNavItem.Camera,
        BottomNavItem.Story,
        BottomNavItem.Reels,
    )
    val currentRoute = currentRoute(navController)
    BottomNavigation(
        backgroundColor = Color.Black,
        contentColor = Color.White
    ) {
        item.forEach { item ->
            val isSelected = currentRoute == item.screen_route
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = if (isSelected) painterResource(item.filled_icon) else painterResource(
                            item.outline_icon
                        ),
                        contentDescription = item.title,
                        tint = if (isSelected) Color.White else Color.Gray,
                        modifier = Modifier.padding(
                            bottom = 7.dp,
                            top = 15.dp,
                            start = 3.dp,
                            end = 3.dp
                        )
                    )
                },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Gray,
                label = {
                    Text(
                        text = "",
//                        color = if (isSelected) Color.White else Color.Gray,
                        style = if (isSelected) MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold) else MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.Normal
                        ),
                    )
                },

                selected = currentRoute == item.screen_route,
                onClick = {
                    if (currentRoute != item.screen_route) {
                        handleBottomNavItemOnClick(item, navController)
                    }
                }
            )
        }
    }
}

private fun handleBottomNavItemOnClick(
    item: BottomNavItem,
    navController: NavController
) {
    navController.navigate(item.screen_route) {
        popUpTo(navController.graph.startDestinationRoute!!) {
            saveState = true // Saves the state of the destination
        }
        launchSingleTop = true // Ensures only one instance of the destination is created
        restoreState = true // Restores the previous state of the destination
    }
}

@Composable
private fun currentRoute(navController: NavController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}