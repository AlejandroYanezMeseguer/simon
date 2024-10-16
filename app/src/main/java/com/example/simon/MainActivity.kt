package com.example.simon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.example.simon.ui.theme.SimonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimonTheme {
                Scaffold { innerPadding ->
                    var color by remember { mutableStateOf(Color.White) }
                    val rondas by remember { mutableStateOf(mutableListOf<Int>()) }
                    val secuencia by remember { mutableStateOf(mutableListOf<Int>()) }

                    BackgroundImage()

                    Puntuacion(
                        color = color,
                        name = "Puntuacion\n" + rondas.size,
                        modifier = Modifier
                            .offset(y= 50.dp, x = 80.dp)
                    )

                    Button(
                        onClick = {
                            color = Color.Red
                            secuencia.add(Colores.ROJO.rgb)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(
                            topStart = 8.dp,
                            topEnd = 8.dp,
                            bottomEnd = 90.dp,
                            bottomStart = 8.dp
                        ),
                       modifier = Modifier
                           .offset(y= 230.dp)
                           .size(170.dp)
                           .background(
                               brush = Brush.linearGradient(
                                   colors = listOf(Color.Transparent, Color.Red),
                                   start = Offset(740f, 740f),
                                   end = Offset(10f, 10f)
                               ),
                               shape = RoundedCornerShape(
                                   topStart = 8.dp,
                                   topEnd = 8.dp,
                                   bottomEnd = 90.dp,
                                   bottomStart = 8.dp
                               ),
                           )
                    ) {
                        Text("")
                    }

                    Button(
                        onClick = {
                            color = Color.Green
                            secuencia.add(Colores.VERDE.rgb)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(
                            topStart = 8.dp,
                            topEnd = 90.dp,
                            bottomEnd = 8.dp,
                            bottomStart = 8.dp
                        ),
                        modifier = Modifier
                            .offset(y= 450.dp)
                            .size(170.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Transparent, Color.Green),
                                    start = Offset(390f, -230f),
                                    end = Offset(0f, 200f)
                                ),
                                shape = RoundedCornerShape(
                                    topStart = 8.dp,
                                    topEnd = 90.dp,
                                    bottomEnd = 8.dp,
                                    bottomStart = 8.dp
                                ),
                            )
                    ) {
                        Text("")
                    }

                    Button(
                        onClick = {
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta),
                        shape = RoundedCornerShape(45.dp),
                        modifier = Modifier
                            .size(110.dp)
                            .offset(y= 370.dp, x = 140.dp)
                    ) {
                        Text("START", color = Color.White)
                    }

                    Button(
                        onClick = {
                            color = Color.Blue
                            secuencia.add(Colores.AZUL.rgb)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(
                            topStart = 8.dp,
                            topEnd = 8.dp,
                            bottomEnd = 8.dp,
                            bottomStart = 90.dp
                        ),
                        modifier = Modifier
                            .offset(y= 230.dp, x = 222.dp)
                            .size(170.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Transparent, Color.Blue),
                                    start = Offset(-220f, 420f),
                                    end = Offset(200f, 0f)
                                ),
                                shape = RoundedCornerShape(
                                    topStart = 8.dp,
                                    topEnd = 8.dp,
                                    bottomEnd = 8.dp,
                                    bottomStart = 90.dp
                                ),
                            )
                    ) {
                        Text("")
                    }

                    Button(
                        onClick = {
                            color = Color.Yellow
                            secuencia.add(Colores.AMARILLO.rgb)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(
                            topStart = 90.dp,
                            topEnd = 8.dp,
                            bottomEnd = 8.dp,
                            bottomStart = 8.dp
                        ),
                        modifier = Modifier
                            .size(170.dp)
                            .offset(y= 450.dp, x = 222.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Transparent, Color.Yellow),
                                    start = Offset(0f, 0f),
                                    end = Offset(250f, 250f)
                                ),
                                shape = RoundedCornerShape(
                                    topStart = 90.dp,
                                    topEnd = 8.dp,
                                    bottomEnd = 8.dp,
                                    bottomStart = 8.dp
                                ),
                            )
                    ) {
                        Text("")
                    }

                    Record(
                        color = color,
                        name = "Record\n" + rondas.size,
                        modifier = Modifier
                            .offset(y= 700.dp, x = 130.dp)
                    )

                }
            }
        }
    }
}

@Composable
fun Puntuacion(name: String, modifier: Modifier = Modifier, color: Color) {
    Text(
        text = "$name",
        fontSize = 50.sp,
        lineHeight = 70.sp,
        color = color,
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}

@Composable
fun Record(name: String, modifier: Modifier = Modifier, color: Color) {
    Text(
        text = "$name",
        fontSize = 50.sp,
        lineHeight = 70.sp,
        color = color,
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}

@Composable
fun BackgroundImage() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Aquí puedes añadir otros elementos encima de la imagen
    }
}