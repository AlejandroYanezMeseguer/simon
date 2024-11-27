package com.example.simon.ViewModel

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.simon.Data.Data
import com.example.simon.Data.Estados

class ViewModel : ViewModel() {
    val illuminatedButton = mutableStateOf(0)
    val estado = mutableStateOf(Estados.INICIO)

    fun numeroAleatorio(context: Context): Int {
        Data.numeroSecuencia = (1..4).random()
        return Data.numeroSecuencia
    }

    fun comparar(context: Context) {
        if (Data.numeroSecuencia == Data.numeroUsuario) {
            Toast.makeText(context, "ganaste mi bro", Toast.LENGTH_SHORT).show()
            Data.puntuacion.value += 1
        } else {
            Toast.makeText(context, "perdiste mi bro", Toast.LENGTH_SHORT).show()
            Data.puntuacion.value = 0
        }
    }
}