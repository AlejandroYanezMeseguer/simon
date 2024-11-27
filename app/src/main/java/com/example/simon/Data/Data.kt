package com.example.simon.Data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

/**
 * Objeto que contiene los datos compartidos de la aplicación.
 */
object Data {
    /**
     * Número de la secuencia generada aleatoriamente.
     */
    var numeroSecuencia = 0

    /**
     * Número ingresado por el usuario.
     */
    var numeroUsuario = 0

    /**
     * Puntuación actual del usuario.
     */
    var puntuacion = mutableStateOf(0)
}

/**
 * Enum que representa los diferentes estados de la aplicación.
 * @param startActivo Indica si el botón de inicio está activo.
 * @param botonActivo Indica si los botones de colores están activos.
 */
enum class Estados(val startActivo: Boolean, val botonActivo: Boolean) {
    INICIO(startActivo = true, botonActivo = false),
    GENERANDO(startActivo = false, botonActivo = true),
}