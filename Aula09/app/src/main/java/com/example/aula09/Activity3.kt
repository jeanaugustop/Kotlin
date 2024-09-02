package com.example.aula09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aula09.ui.theme.Aula09Theme

class Activity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewLayout3()
        }
    }
}

@Preview
@Composable
fun PreviewLayout3(){
    LayoutActivity3()
}

@Composable
fun LayoutActivity3(){

    var nome by remember { mutableStateOf("")}
    var endereco by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomTextField(valor = nome, onValueChange = {nome = it}, label = "Digite Seu nome")

        Spacer(modifier = Modifier.height(20.dp))

        CustomTextField(valor = endereco, onValueChange = {endereco = it}, label = "Digite Seu endereco")

        Spacer(modifier = Modifier.height(20.dp))

        CustomTextField(valor = email, onValueChange = {email = it}, label = "Digite Seu email")

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "\nNome: $nome" + "\nEndereço: $endereco" + "\nEmail: $email",
            fontSize = 20.sp)

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    valor : String,
    onValueChange: (String) -> Unit,
    label: String
){
    //valor : variavel String associada ao TextField
    //onValueChange: callback para quando o texto mudar
    // labe: o texto para a label

    TextField(value = valor, onValueChange = onValueChange, label = { Text(text = label)} )

}