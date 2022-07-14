package com.example.uisdk.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.viewinterop.AndroidViewBinding
import com.example.uisdk.databinding.MainLayoutBinding

@Composable
fun CustomTray() {
    //AndroidView(factory =)
}

@Composable
fun AndroidViewMainLayout() {
    AndroidViewBinding(MainLayoutBinding::inflate) {
        //llMainLayout.background.

    }
}