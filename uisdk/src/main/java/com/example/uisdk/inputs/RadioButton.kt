package com.example.uisdk.inputs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uisdk.ui.theme.ComposeSDKDemoTheme


@Composable
fun LabelledRadioButton(
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: @Composable () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() }) {
        RadioButton(
            selected = isSelected,
            onClick = onClick,
            modifier = Modifier.padding(end = 8.dp),
            colors = RadioButtonDefaults.colors(
                selectedColor = MaterialTheme.colors.primaryVariant
            )
        )
        text()
    }
}

@Composable
fun LabelledRadioButton(
    isSelected: Boolean,
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    LabelledRadioButton(
        isSelected = isSelected,
        onClick = onClick,
        modifier = modifier
    ) {
        Text(text = text)
    }
}

@Composable
@Preview(group = "Light")
private fun Preview_Light() {
    ComposeSDKDemoTheme {
        LabelledRadioButton(isSelected = true, onClick = {}) {
            Text("Radiobutton Label")
        }
    }
}

@Composable
@Preview(group = "Dark")
private fun Preview_Dark() {
    ComposeSDKDemoTheme(darkTheme = true) {
        LabelledRadioButton(isSelected = true, onClick = {}) {
            Text("Radiobutton Label")
        }
    }
}