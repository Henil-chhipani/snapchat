package com.example.snapchat.ui.screens.CameraScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
expect fun PlatformCameraScreen()


@Composable
fun CameraScreen() {
    PlatformCameraScreen()
}