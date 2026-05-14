package com.yourfarm.app.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddFlockScreen(onSave: (Int, Float?) -> Unit) {
    var ageDays by remember { mutableStateOf("") }
    var rate by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Добавить родительское стадо", style = MaterialTheme.typography.titleMedium)
        OutlinedTextField(value = ageDays, onValueChange = { ageDays = it }, label = { Text("Возраст (дни)") }, singleLine = true)
        OutlinedTextField(value = rate, onValueChange = { rate = it }, label = { Text("Процент вывода (опционально)") }, singleLine = true)

        Button(onClick = {
            val days = ageDays.toIntOrNull() ?: 0
            val r = rate.toFloatOrNull()
            onSave(days, r)
        }) {
            Text("Сохранить")
        }
    }
}
