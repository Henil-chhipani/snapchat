package com.example.snapchat.ui.screens.SplashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.snapchat.ui.themes.primaryColor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import snapchat.composeapp.generated.resources.Res
import snapchat.composeapp.generated.resources.snapchat

@Preview
@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier.background(primaryColor).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(Res.drawable.snapchat),
            contentDescription = null,
            modifier = Modifier.size(100.dp),
        )
    }
}