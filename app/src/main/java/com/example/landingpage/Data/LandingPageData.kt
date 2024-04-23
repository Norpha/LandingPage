package com.example.landingpage.Data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector

data class LandingPageData(
        val icon :  ImageVector,
        val number: String,
        val description: String,
        val color: Color,

        )