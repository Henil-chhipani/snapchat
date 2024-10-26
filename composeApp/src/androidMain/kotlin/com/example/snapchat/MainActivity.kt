package com.example.snapchat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.snapchat.ui.screens.DashBoard.DashBoardScreen
import com.example.snapchat.ui.screens.SplashScreen.SplashScreen
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}


@Composable
fun App() {
    var showSplash by remember { mutableStateOf(true) } // Initially show splash

    // SplashScreen composable will be shown for 5 seconds
    LaunchedEffect(Unit) {
        delay(500) // 5 seconds delay
        showSplash = false // After 5 seconds, hide the splash
    }

    // Conditionally show splash or main content
    if (showSplash) {
        SplashScreen()
    } else {
        DashBoardScreen()
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppAndroidPreview() {
    App()
}