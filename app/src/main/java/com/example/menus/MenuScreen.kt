package com.example.menus

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MenuScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pantalla de Menú") }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bienvenido a la Pantalla de Menú",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Aquí puedes explorar las diferentes opciones del menú.",
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 32.dp)
            )
            Button(
                onClick = { /* Acción del botón */ },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(text = "Empezar")
            }
        }
    }
}