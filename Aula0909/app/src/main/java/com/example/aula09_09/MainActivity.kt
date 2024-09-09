package com.example.aula09_09

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aula09_09.ui.theme.Aula0909Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewLayout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormLogin(){

    var usuario by remember { mutableStateOf("")}
    var senha by remember { mutableStateOf("")}
    var context = LocalContext.current


    Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    ){

        Text(text = "Entre Com seus dados", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(15.dp))

        TextField(value = usuario ,
            onValueChange = {usuario = it},
            label = { Text(text = "Usuário: ")})

        Spacer(modifier = Modifier.height(15.dp))

        TextField(value = senha ,
            onValueChange = {senha = it},
            label = { Text(text = "Senha: ")},
            visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {

            when{

                usuario.isBlank() || senha.isBlank() ->{
                    Toast.makeText(context, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
                }

                !Validacao.validarLogin(usuario, senha) ->{
                    Toast.makeText(context, "Usuário ou Senha Inválido", Toast.LENGTH_SHORT).show()
                }

                else -> {

                    var intent = Intent(context, ContatoActivity::class.java)

                    context.startActivity(intent)

                }

            }

        }) {

            Text(text = "Entrar")
            
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLayout(){
    FormLogin()
}