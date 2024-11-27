package com.example.simon

import UI
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.example.simon.ViewModel.ViewModel
import com.example.simon.ui.theme.SimonTheme

/**
 * Actividad principal de la aplicación.
 * Se encarga de inicializar la interfaz de usuario y configurar el tema de la aplicación.
 */
class MainActivity : ComponentActivity() {
    /**
     * Método llamado cuando la actividad es creada.
     * @param savedInstanceState Estado guardado de la instancia anterior de la actividad.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimonTheme {
                Scaffold { innerPadding ->
                    var model = ViewModel()
                    UI(model)
                }
            }
        }
    }
}