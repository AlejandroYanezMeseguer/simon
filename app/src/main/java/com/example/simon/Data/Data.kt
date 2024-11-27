package com.example.simon.Data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

object Data {

    var numeroSecuencia = 0
    var numeroUsuario = 0
    var puntuacion = mutableStateOf(0)

}

enum class Estados(val startActivo: Boolean, val botonActivo: Boolean) {
    INICIO(startActivo = true, botonActivo = false),
    GENERANDO(startActivo = false, botonActivo = true),
}