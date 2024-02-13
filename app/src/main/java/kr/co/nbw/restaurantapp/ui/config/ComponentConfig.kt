package kr.co.nbw.restaurantapp.ui.config

import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import kr.co.nbw.restaurantapp.ui.theme.color.ColorSet

data class ComponentConfig(
    val colors: ColorSet,
    val typography: Typography,
    val shapes: Shapes,
    val isDarkTheme: Boolean
)
