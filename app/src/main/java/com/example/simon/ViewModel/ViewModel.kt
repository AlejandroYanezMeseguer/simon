package com.example.simon.ViewModel

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.simon.Data.Data
import com.example.simon.Data.Estados

/**
 * ViewModel que gestiona la lógica de la aplicación.
 */
class ViewModel : ViewModel() {
    /**
     * Botón iluminado actualmente.
     */
    val illuminatedButton = mutableStateOf(0)

    /**
     * Estado actual de la aplicación.
     */
    val estado = mutableStateOf(Estados.INICIO)

    /**
     * Genera un número aleatorio para la secuencia.
     * @param context Contexto de la aplicación.
     * @return Número aleatorio generado.
     */
    fun numeroAleatorio(context: Context): Int {
        Data.numeroSecuencia = (1..4).random()
        return Data.numeroSecuencia
    }

    /**
     * Compara el número ingresado por el usuario con el número de la secuencia.
     * @param context Contexto de la aplicación.
     */
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