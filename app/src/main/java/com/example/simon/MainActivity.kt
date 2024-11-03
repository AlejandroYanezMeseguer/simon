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
                            .offset(y= 50.dp, x = 85.dp)
                    )

                    Button(
                        onClick = {
                            color = Color.Red
                            secuencia.add(Colores.ROJO.rgb)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(
                            topStart = 30.dp,
                            topEnd = 12.dp,
                            bottomEnd = 110.dp,
                            bottomStart = 12.dp
                        ),
                       modifier = Modifier
                           .offset(y= 230.dp)
                           .size(180.dp)
                           .background(
                               brush = Brush.linearGradient(
                                   colors = listOf(Color.Transparent, Color.Red),
                                   start = Offset(740f, 740f),
                                   end = Offset(10f, 10f)
                               ),
                               shape = RoundedCornerShape(
                                   topStart = 30.dp,
                                   topEnd = 12.dp,
                                   bottomEnd = 110.dp,
                                   bottomStart = 12.dp
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
                            topStart = 12.dp,
                            topEnd = 110.dp,
                            bottomEnd = 12.dp,
                            bottomStart = 30.dp
                        ),
                        modifier = Modifier
                            .offset(y= 440.dp)
                            .size(180.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Transparent, Color.Green),
                                    start = Offset(390f, -230f),
                                    end = Offset(0f, 200f)
                                ),
                                shape = RoundedCornerShape(
                                    topStart = 12.dp,
                                    topEnd = 110.dp,
                                    bottomEnd = 12.dp,
                                    bottomStart = 30.dp
                                ),
                            )
                    ) {
                        Text("")
                    }

                    Button(
                        onClick = {
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(45.dp),
                        modifier = Modifier
                            .size(102.dp)
                            .offset(y = 374.dp, x = 144.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Red,Color.Transparent, Color.Yellow),
                                    start = Offset(0f, 0f),
                                    end = Offset(300f, 300f)
                                ),

                                shape = RoundedCornerShape(45.dp)
                            )
                    ) {
                        Text(
                            "START",
                            color = Color.White,
                            fontSize = 20.sp,
                        )
                    }
                    Button(
                        onClick = {
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(45.dp),
                        modifier = Modifier
                            .size(102.dp)
                            .offset(y = 374.dp, x = 144.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Green,Color.Transparent, Color.Blue),
                                    start = Offset(-20f, 320f),
                                    end = Offset(300f, 0f)
                                ),

                                shape = RoundedCornerShape(45.dp)
                            )
                    ) {
                        Text(
                            ""
                        )
                    }

                    Button(
                        onClick = {
                            color = Color.Blue
                            secuencia.add(Colores.AZUL.rgb)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(
                            topStart = 12.dp,
                            topEnd = 30.dp,
                            bottomEnd = 12.dp,
                            bottomStart = 110.dp
                        ),
                        modifier = Modifier
                            .offset(y= 230.dp, x = 212.dp)
                            .size(180.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Transparent, Color.Blue),
                                    start = Offset(-220f, 420f),
                                    end = Offset(200f, 0f)
                                ),
                                shape = RoundedCornerShape(
                                    topStart = 12.dp,
                                    topEnd = 30.dp,
                                    bottomEnd = 12.dp,
                                    bottomStart = 110.dp
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
                            topStart = 110.dp,
                            topEnd = 12.dp,
                            bottomEnd = 30.dp,
                            bottomStart = 12.dp
                        ),
                        modifier = Modifier
                            .size(180.dp)
                            .offset(y= 440.dp, x = 212.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color.Transparent, Color.Yellow),
                                    start = Offset(0f, 0f),
                                    end = Offset(250f, 250f)
                                ),
                                shape = RoundedCornerShape(
                                    topStart = 110.dp,
                                    topEnd = 12.dp,
                                    bottomEnd = 30.dp,
                                    bottomStart = 12.dp
                                ),
                            )
                    ) {
                        Text("")
                    }

                    Record(
                        color = color,
                        name = "Record\n" + rondas.size,
                        modifier = Modifier
                            .offset(y= 700.dp, x = 128.dp)
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