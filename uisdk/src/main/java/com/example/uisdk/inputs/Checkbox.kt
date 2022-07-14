package com.example.uisdk.inputs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uisdk.ui.theme.ComposeSDKDemoTheme

@Composable
fun LabelledCheckbox(
    isChecked: Boolean,
    modifier: Modifier = Modifier,
    onCheckedChange: (Boolean) -> Unit,
    text: @Composable () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable { onCheckedChange(!isChecked) }) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = onCheckedChange,
            modifier = Modifier.padding(end = 4.dp)
        )
        text()
    }
}

@Composable
@Preview(group = "Light")
private fun Preview_Light() {
    ComposeSDKDemoTheme {
        LabelledCheckbox(isChecked = true, onCheckedChange = {}) {
            Text("Checkbox Label")
        }
    }
}

@Composable
@Preview(group = "Dark")
private fun Preview_Dark() {
    ComposeSDKDemoTheme(darkTheme = true) {
        LabelledCheckbox(isChecked = true, onCheckedChange = {}) {
            Text("Checkbox Label")
        }
    }
}