package com.example.inft_imagenes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.inft_imagenes.ui.theme.Inft_ImagenesTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Inft_ImagenesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PeliculasPrincipal(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PeliculasPrincipal(modifier: Modifier = Modifier) {
    Box(
        Modifier
            .border(width = 0.dp, color = Color(0x1A000000), shape = RoundedCornerShape(size = 2.dp))
            .width(360.dp)
            .height(800.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 2.dp))

    ){
        Column(
            Modifier
            .width(360.dp)
            .height(900.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            // Espacio
            Spacer(modifier = Modifier.height(60.dp))

            // Row 1 con el cuadro azul y su titulo
            Box(
                Modifier
                    .padding(16.dp)
            ){
                TopBar("Mis Películas")

            }//Fin Row 1 para Titulo

            // Spacer to create space between the boxes
            Spacer(modifier = Modifier.height(40.dp)) // Adjust height for spacing

            //Box para las peliculas
            Column(
                Modifier
                    .width(360.dp)
                    .height(800.dp)
                    .background(Color.Red)
                    .fillMaxWidth()
                    .fillMaxHeight()// Ensure this Column takes the full width

            ){

                ///////////////////// 1 Row peliculas
                Row(){
                    pelis1(modifier)
                }//Fin 1 Row peliculas

                //////////////////// 2 Row peliculas
                Row(){
                    pelis2(modifier)
                }//Fin 2 Row peliculas

                ///////////////////// 3 Row peliculas
                Row(){
                    pelis3(modifier)
                }//Fin 3 Row peliculas

            }//Fin Box con peliculas
        }//Fin Column 1

    }//Fin Box 1
}//Fin PeliculasPrincipal


//Funcion para la primera Row de peliculas
@Composable
fun pelis1 (modifier: Modifier = Modifier){
    Row(
        Modifier
            .background(Color.White)
            .border(width = 0.dp, color = Color(0xFF000000))
            .width(360.dp)
            .height(193.dp)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween


    ){
        //1 Column FLORERO
        ImagenTitulo(
            imageRes = R.drawable.ramo,  // Reemplaza con el recurso de imagen que desees
            title = "El Florero"
        )


        //2 Column BOSQUE
        ImagenTitulo(
            imageRes = R.drawable.bosque,  // Reemplaza con el recurso de imagen que desees
            title = "El Bosque"
        )

    }//Fin 1Box
}//Fin pelis1


//Funcion para la segunda Row de peliculas
@Composable
fun pelis2 (modifier: Modifier = Modifier){
    Row(
        Modifier
            .background(Color.White)
            .border(width = 0.dp, color = Color(0xFF000000))
            .width(360.dp)
            .height(193.dp)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween


    ){
        //1 Column FLORERO
        ImagenTitulo(
            imageRes = R.drawable.ramo,  // Reemplaza con el recurso de imagen que desees
            title = "Otro Bosque"
        )


        //2 Column BOSQUE
        ImagenTitulo(
            imageRes = R.drawable.bosque,  // Reemplaza con el recurso de imagen que desees
            title = "Tulipanes"
        )

    }//Fin 1Box
}//Fin pelis2

//Funcion para la tercera Row de peliculas
@Composable
fun pelis3 (modifier: Modifier = Modifier){
    Row(
        Modifier
            .background(Color.White)
            .border(width = 0.dp, color = Color(0xFF000000))
            .width(360.dp)
            .height(193.dp)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween


    ){
        //1 Column FLORERO
        ImagenTitulo(
            imageRes = R.drawable.ramo,  // Reemplaza con el recurso de imagen que desees
            title = "Clase"
        )


        //2 Column BOSQUE
        ImagenTitulo(
            imageRes = R.drawable.bosque,  // Reemplaza con el recurso de imagen que desees
            title = "Rugby"
        )

    }//Fin 1Box
}//Fin pelis3


//Funcion para la cabecera con el titulo
@Composable
fun TopBar (tittle:String){
    Box(
        Modifier
            .fillMaxWidth()
            .border(width = 3.dp, color = Color(0xFF354699))
            .width(305.dp)
            .height(93.dp)
            .background(color = Color(0xFFDFE4FF))


    ) {
        // Text Titulo "Mis Películas"
        Text(
            text = "Mis Películas",
            color = Color(0xFF354699),  // White text color
            style = TextStyle(
                fontSize = 50.sp,  // Adjust font size as needed
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .align(Alignment.Center) // Center the text within the box
                .padding(8.dp) // Add padding around the text
        )//Fin Text Titulo "Mis Películas"
    }
}//Fin TopBar



@Composable
fun ImagenTitulo(
    imageRes: Int,  // Parámetro para el recurso de imagen
    title: String   // Parámetro para el texto del título
) {
    Column(
        modifier = Modifier
            .padding(0.dp)
            .width(175.dp)
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = title,
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp) // Ajusta la altura según sea necesario
        )

        // Título
        Text(
            text = title,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .padding(3.dp)
        )
    }
}


//Funcion Preview
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Inft_ImagenesTheme {
        PeliculasPrincipal()
    }
}
