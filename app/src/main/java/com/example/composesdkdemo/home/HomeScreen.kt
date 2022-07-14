package com.example.composesdkdemo.home

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.uisdk.common.CustomVerticalList

@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val response = viewModel.persons.value
    response.isLoading
    response.data?.let {
        val context = LocalContext.current

        CustomVerticalList(data = response.data) {
            Toast.makeText(context, it.address, Toast.LENGTH_SHORT).show()
        }
    }
}