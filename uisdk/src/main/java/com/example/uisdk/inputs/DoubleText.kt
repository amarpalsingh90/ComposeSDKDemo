package com.example.uisdk.inputs

import androidx.compose.foundation.layout.Column
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.uisdk.ui.theme.ComposeSDKDemoTheme

@Composable
fun DoubleText(
    primaryText: String?,
    secondaryText: String?,
    modifier: Modifier = Modifier,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    primaryStyle: TextStyle = MaterialTheme.typography.body1,
    secondaryStyle: TextStyle = MaterialTheme.typography.body2
) {
    Column(
        modifier = modifier,
        horizontalAlignment = horizontalAlignment
    ) {
        if (primaryText != null)
            Text(
                text = primaryText,
                style = primaryStyle
            )
        if (secondaryText != null)
            Text(
                text = secondaryText,
                style = secondaryStyle,
                modifier = Modifier.alpha(ContentAlpha.medium)
            )
    }
}

@Composable
@Preview(group = "Light")
private fun Preview_Light() {
    ComposeSDKDemoTheme {
        DoubleText("John Doe", "johndoe@mail.com")
    }
}

@Composable
@Preview(group = "Dark")
private fun Preview_Dark() {
    ComposeSDKDemoTheme(darkTheme = true) {
        DoubleText("John Doe", "johndoe@mail.com")
    }
}