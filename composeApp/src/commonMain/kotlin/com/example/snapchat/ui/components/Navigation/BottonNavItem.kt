package com.example.snapchat.ui.components.Navigation


import org.jetbrains.compose.resources.DrawableResource
import snapchat.composeapp.generated.resources.Res
import snapchat.composeapp.generated.resources.ic_camera
import snapchat.composeapp.generated.resources.ic_camera_filled
import snapchat.composeapp.generated.resources.ic_chat
import snapchat.composeapp.generated.resources.ic_chat_filled
import snapchat.composeapp.generated.resources.ic_group
import snapchat.composeapp.generated.resources.ic_group_filled
import snapchat.composeapp.generated.resources.ic_location
import snapchat.composeapp.generated.resources.ic_location_filled
import snapchat.composeapp.generated.resources.ic_play
import snapchat.composeapp.generated.resources.ic_play_filled

sealed class BottomNavItem(
    var title: String,
    var filled_icon: DrawableResource,
    var outline_icon: DrawableResource,
    var screen_route: String
) {
    object Location :
        BottomNavItem(
            title = "Location",
            filled_icon = Res.drawable.ic_location_filled,
            outline_icon = Res.drawable.ic_location,
            screen_route = "location"
        )

    object Chat : BottomNavItem(
        title = "Chat",
        filled_icon = Res.drawable.ic_chat_filled,
        outline_icon = Res.drawable.ic_chat,
        screen_route = "chat"
    )
    object Camera : BottomNavItem(
        title = "Camera",
        filled_icon = Res.drawable.ic_camera_filled,
        outline_icon = Res.drawable.ic_camera,
        screen_route = "camera"
    )

    object Story : BottomNavItem(
        title = "Story",
        filled_icon = Res.drawable.ic_group_filled,
        outline_icon = Res.drawable.ic_group,
        screen_route = "story"
    )
    object Reels : BottomNavItem(
        title = "Reels",
        filled_icon = Res.drawable.ic_play_filled,
        outline_icon = Res.drawable.ic_play,
        screen_route = "reels"
    )
}