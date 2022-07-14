package com.example.uisdk.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

internal val LightThemeColors = lightColors(
    primary = VOOTColors.blue700,
    primaryVariant = VOOTColors.blue300,
    onPrimary = VOOTColors.white,
    secondary = VOOTColors.blue600,
    secondaryVariant = VOOTColors.blue300,
    onSecondary = VOOTColors.white,
    error = VOOTColors.red600,
    surface = VOOTColors.white,
    onSurface = VOOTColors.grey800,
    background = VOOTColors.grey100,
    onBackground = VOOTColors.grey800
)

internal val DarkThemeColors = darkColors(
    primary = VOOTColors.blue700,
    primaryVariant = VOOTColors.blue300,
    onPrimary = VOOTColors.white,
    secondary = VOOTColors.white,
    secondaryVariant = VOOTColors.white,
    onSecondary = VOOTColors.white,
    error = VOOTColors.red600,
    surface = VOOTColors.blue700,
    onSurface = VOOTColors.white,
    background = VOOTColors.blue800,
    onBackground = VOOTColors.indigo200
)

@Composable
fun ComposeSDKDemoTheme(
    lightColors: Colors = LightThemeColors,
    darkColors: Colors = DarkThemeColors,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) darkColors else lightColors,
        typography = Typography,
        shapes = Shapes
    ) {
        CompositionLocalProvider(LocalContentColor provides MaterialTheme.colors.onSurface) {
            content()
        }
    }
}