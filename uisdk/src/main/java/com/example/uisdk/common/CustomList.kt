package com.example.uisdk.common


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uisdk.PreviewData
import com.example.uisdk.model.Person
import com.example.uisdk.ui.theme.ComposeSDKDemoTheme

@Composable
fun <T> CommonList(
    data: List<T>,
    modifier: Modifier = Modifier,
    onItemSelected: (T) -> Unit = {}
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier)
    ) {
        items(items = data) { item ->
            if (item is Person) {
                PerSonItem(
                    person = item,
                    onClick = { onItemSelected(item) }
                )
            }

        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun PerSonItem(
    person: Person,
    onClick: (Person) -> Unit = {}
) {
    Card(
        onClick = { onClick(person) },
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = MaterialTheme.colors.background,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {

        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(text = person.name, style = typography.h4)
            Text(text = person.age.toString(), style = typography.h5)
            Text(text = person.gender, style = typography.h6)
            Text(text = person.address, style = typography.h6)
        }
    }

}

@Composable
@Preview("Light")
private fun Preview_Light() {
    ComposeSDKDemoTheme {
        CommonList(data = MutableList(5) { PreviewData.person })
    }
}

