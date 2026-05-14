package com.yourfarm.app.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FlockListScreen(onAddClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Родительское стадо", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(8.dp))
        Button(onClick = onAddClick) {
            Text("Добавить стадо")
        }
        Spacer(Modifier.height(16.dp))
        Text("Список стад будет загружен через ViewModel")
    }
}
