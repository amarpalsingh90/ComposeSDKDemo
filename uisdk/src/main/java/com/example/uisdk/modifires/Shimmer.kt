package com.example.uisdk.modifires

import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.placeholder
import com.google.accompanist.placeholder.material.shimmer

fun Modifier.shimmer(visible: Boolean) = composed {
    then(Modifier.placeholder(
            visible = visible,
            highlight = PlaceholderHighlight.shimmer()))
}