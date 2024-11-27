import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simon.Data.Colores
import com.example.simon.Data.Data
import com.example.simon.R
import com.example.simon.ViewModel.ViewModel



@Composable
fun UI(model: ViewModel) {

    BackgroundImage()
    BotonRojo(model)
    BotonAzul(model)
    BotonVerde(model)
    BotonAmarillo(model)
    BotonStart(model)

    Puntuacion(
        color = Color.White,
        name = "Puntuacion\n" + Data.puntuacion.value,
        modifier = Modifier
            .offset(y= 50.dp, x = 85.dp)
    )

}

@Composable
fun BotonRojo(model: ViewModel){
    val context = LocalContext.current

    Button(
        onClick = {
            Data.numeroUsuario = 1
            model.comparar(context)
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(
            topStart = 30.dp,
            topEnd = 12.dp,
            bottomEnd = 110.dp,
            bottomStart = 12.dp
        ),
        modifier = Modifier
            .offset(y = 280.dp)
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
}

@Composable
fun BotonAzul(model: ViewModel){
    val context = LocalContext.current

    Button(
        onClick = {
            Data.numeroUsuario = 2
            model.comparar(context)
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(
            topStart = 12.dp,
            topEnd = 30.dp,
            bottomEnd = 12.dp,
            bottomStart = 110.dp
        ),
        modifier = Modifier
            .offset(y = 280.dp, x = 212.dp)
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
}

@Composable
fun BotonVerde(model: ViewModel){
    val context = LocalContext.current

    Button(
        onClick = {
            Data.numeroUsuario = 3
            model.comparar(context)
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(
            topStart = 12.dp,
            topEnd = 110.dp,
            bottomEnd = 12.dp,
            bottomStart = 30.dp
        ),
        modifier = Modifier
            .offset(y = 490.dp)
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
}

@Composable
fun BotonAmarillo(model: ViewModel){
    val context = LocalContext.current

    Button(
        onClick = {
            Data.numeroUsuario = 4
            model.comparar(context)
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
            .offset(y = 490.dp, x = 212.dp)
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
}

@Composable
fun BotonStart(model: ViewModel){
    val context = LocalContext.current

    Button(
        onClick = {

        },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(45.dp),
        modifier = Modifier
            .size(102.dp)
            .offset(y = 424.dp, x = 144.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color.Red, Color.Transparent, Color.Yellow),
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
            model.numeroAleatorio(context)
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(45.dp),
        modifier = Modifier
            .size(102.dp)
            .offset(y = 424.dp, x = 144.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color.Green, Color.Transparent, Color.Blue),
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