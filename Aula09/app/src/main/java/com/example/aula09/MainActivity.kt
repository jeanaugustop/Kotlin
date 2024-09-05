package com.example.aula09

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aula09.ui.theme.Aula09Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewLayout()
        }
    }
}

@Composable
fun Layout(){

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Qual Atividade Deseja Executar? ",
            modifier = Modifier.height(20.dp),
            fontSize = 20.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {

            var intent = Intent(context, Activity2::class.java)
            context.startActivity(intent)

        }) {
            Text(text = "Activity 2")
        }

        Button(onClick = {

            var intent = Intent(context, Activity3::class.java)
            context.startActivity(intent)

        }) {
            Text(text = "Activity 3")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLayout(){
    Layout()
}