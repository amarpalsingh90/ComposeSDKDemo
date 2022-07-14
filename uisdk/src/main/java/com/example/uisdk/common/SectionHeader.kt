package com.example.uisdk.common

import androidx.annotation.StringRes
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.uisdk.modifires.shimmer

@Composable
fun SectionHeader(
    @StringRes text: Int,
    isLoading: Boolean = false) {
    Text(
        text = stringResource(text),
        style = MaterialTheme.typography.h2,
        modifier = Modifier.shimmer(visible = isLoading))
}