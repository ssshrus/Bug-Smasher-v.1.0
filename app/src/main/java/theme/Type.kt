package com.example.bugsmash.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColors = darkColorScheme(
    primary = GreenPrimary,
    onPrimary = YellowAccent,
    secondary = YellowAccent,
    background = BgDark,
    surface = SurfaceDark,
    error = BloodRed
)

@Composable
fun BugSmasherTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColors,
        typography = Typography,
        content = content
    )
}