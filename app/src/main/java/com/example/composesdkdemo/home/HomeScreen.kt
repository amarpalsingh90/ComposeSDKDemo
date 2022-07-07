package com.example.composesdkdemo.home

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.uisdk.common.CommonList

@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val response = viewModel.persons.value
    response.data?.let {
        val context = LocalContext.current
        CommonList(data = response.data) {
            Toast.makeText(context, it.address, Toast.LENGTH_SHORT).show()
        }
    }
}