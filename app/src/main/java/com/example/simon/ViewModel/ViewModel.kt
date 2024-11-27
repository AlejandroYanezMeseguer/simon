package com.example.simon.ViewModel

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.simon.Data.Data

class ViewModel : ViewModel(){

    fun numeroAleatorio(context: Context) {
        Data.numeroSecuencia = (1..4).random()
        Toast.makeText(context, "Número aleatorio: ${Data.numeroSecuencia}", Toast.LENGTH_SHORT).show()
    }

    fun comparar(context: Context) {
       if (Data.numeroSecuencia == Data.numeroUsuario) {
           Toast.makeText(context, "ganaste mi bro", Toast.LENGTH_SHORT).show()
              Data.puntuacion.value += 1
       }else {
           Toast.makeText(context, "perdiste mi bro", Toast.LENGTH_SHORT).show()
              Data.puntuacion.value = 0
       }
    }

}