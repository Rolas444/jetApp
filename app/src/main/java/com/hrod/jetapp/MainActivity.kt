package com.hrod.jetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hrod.jetapp.ui.theme.JetAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column {
                Row {
                    nombreTarjeta("Rolas")

                }

                Row {
                    mensajeTarjeta()
                }
            }
        }
    }
}

@Composable
fun nombreTarjeta(name:String){
    Text(text = "hola $name!")
}

@Composable
fun mensajeTarjeta(){
    Text(text = "Hola esta es una descripcion de compose")
}

@Preview
@Composable
fun PreviewMensajeTarjeta(){
    nombreTarjeta(name = "Rolas")
}

