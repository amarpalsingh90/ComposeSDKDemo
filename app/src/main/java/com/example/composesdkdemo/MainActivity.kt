package com.example.composesdkdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composesdkdemo.home.HomeScreen
import com.example.composesdkdemo.model.PersonDTO
import com.example.uisdk.common.CommonList
import com.example.uisdk.model.CommonListData
import com.example.uisdk.ui.theme.ComposeSDKDemoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSDKDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeSDKDemoTheme {
        CommonList(
            data = listOf(
                PersonDTO("Amar", 19, "M", "AYX"),
                PersonDTO("Vijay", 20, "M", "AYX")
            )
        )
    }
}