package com.example.exploracioncomponentescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploracionComponentesCompose()
        }
    }
}

@Composable
fun ExploracionComponentesCompose() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Exploración de Componentes", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))

        TextExample()

        Spacer(modifier = Modifier.height(16.dp))
        ButtonExample()

        Spacer(modifier = Modifier.height(16.dp))
        TextFieldExample()

        Spacer(modifier = Modifier.height(16.dp))
        RowExample()
    }
}

@Composable
fun TextExample() {
    Text(
        text = "Este es un componente Text",
        fontSize = 20.sp
    )
}

@Composable
fun ButtonExample() {
    Button(onClick = { /* Acción del botón */ }) {
        Text("Este es un Button")
    }
}

@Composable
fun TextFieldExample() {
    var textState by remember { mutableStateOf("") }
    TextField(
        value = textState,
        onValueChange = { textState = it },
        label = { Text("Ingrese un texto") }
    )
}

@Composable
fun RowExample() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Button(onClick = { /* Acción Aceptar */ }) {
            Text("Aceptar")
        }
        Button(onClick = { /* Acción Rechazar */ }) {
            Text("Rechazar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExploracionComponentes() {
    ExploracionComponentesCompose()
}
