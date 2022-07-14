package com.example.uisdk.inputs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uisdk.ui.theme.ComposeSDKDemoTheme

@Composable
fun <T> SimpleDropdown(
    items: List<T>,
    modifier: Modifier = Modifier,
    label: String? = null,
    selectedItem: T? = null,
    selectedTextProvider: @Composable (T) -> String,
    noSelectionText: String,
    noItemsText: String = noSelectionText,
    onSelectionChanged: (T) -> Unit = {},
    itemContentProvider: @Composable RowScope.(T) -> Unit
) {
    @Composable
    fun HeaderText(text: String) {
        Text(text = text)
    }
    Dropdown(
        items = items,
        modifier = modifier,
        label = label,
        selectedItem = selectedItem,
        selectionProvider = { HeaderText(selectedTextProvider(it)) },
        noSelectionProvider = { HeaderText(text = noSelectionText) },
        noItemsProvider = { HeaderText(text = noItemsText) },
        onSelectionChanged = onSelectionChanged,
        itemContentProvider = itemContentProvider
    )
}

@Composable
fun <T> Dropdown(
    items: List<T>,
    modifier: Modifier = Modifier,
    label: String? = null,
    selectedItem: T? = null,
    selectionProvider: @Composable (T) -> Unit,
    noSelectionProvider: @Composable () -> Unit = {},
    noItemsProvider: @Composable () -> Unit = noSelectionProvider,
    onSelectionChanged: (T) -> Unit = {},
    itemContentProvider: @Composable RowScope.(T) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    Box(modifier) {
        Column {
            if (label != null && selectedItem != null) Text(
                text = label,
                style = MaterialTheme.typography.caption,
                modifier = Modifier
                    .alpha(ContentAlpha.medium)
                    .fillMaxWidth()
                    .padding(start = 16.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = true }
                    .padding(horizontal = 16.dp, vertical = 8.dp)) {
                when {
                    selectedItem != null -> selectionProvider(selectedItem)
                    items.isNotEmpty() -> noSelectionProvider()
                    else -> noItemsProvider()
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")
            }
            Divider(color = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled))
        }
        DropdownMenu(
            expanded = expanded,
            modifier = Modifier.fillMaxWidth(0.9f),
            onDismissRequest = { expanded = false }) {
            items.onEach { contact ->
                DropdownMenuItem(
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    onClick = {
                        onSelectionChanged(contact)
                        expanded = false
                    }) {
                    itemContentProvider(this, contact)
                }
            }
        }
    }
}

@Composable
@Preview(name = "Simple")
private fun DropdownPreview() {
    ComposeSDKDemoTheme {
        SimpleDropdown(
            items = listOf("Text1", "Text2"),
            selectedTextProvider = { it },
            noSelectionText = "No Items"
        ) {
            Text(it)
        }
    }
}

@Composable
@Preview(name = "Custom")
private fun DropdownPreviewCustom() {
    ComposeSDKDemoTheme {
        Dropdown(
            items = listOf("Text1", "Text2"),
            label = "Dropdown",
            selectionProvider = { Text(it) },
            noSelectionProvider = { Text("No Items") }) {
            Text(it)
        }
    }
}