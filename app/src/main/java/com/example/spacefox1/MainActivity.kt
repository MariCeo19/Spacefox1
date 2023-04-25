package com.example.spacefox1

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spacefox1.ui.theme.Spacefox1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Spacefox1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlanoDeFundo()
                }
            }
        }
    }
}




@Composable
fun PlanoDeFundo(){
      Image(
          painter = painterResource(id = R.drawable.papeldeparede1),
          contentDescription = null,
          contentScale = ContentScale.Crop,

      )
    Cabecalho()
    Rodape()

}

@Composable
fun Rodape() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(bottom = 40.dp)
       
    ) {
    Contatos(
        painter = painterResource(id = R.drawable.telefonerosa),
        text = stringResource(R.string.telefone)
    )
    Contatos(
        painter = painterResource(id = R.drawable.emailrosa),
        text = stringResource(R.string.meu_email)
    )
    Contatos(
        painter = painterResource(id = R.drawable._coneinsta)  ,
        text = stringResource(R.string.meu_instagram)
    )
        

    }
}



@Composable
    fun Contatos(painter: Painter, text:String){


    Row() {
        Image(
            painter = painterResource(id = R.drawable.telefonerosa) ,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)

        )
         Text(
             text = text,
             fontSize = 25.sp,
             color = Color.LightGray,
             textAlign = TextAlign.Left,
             modifier = Modifier
                 .fillMaxSize()

         )
    }

    }

@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable._cone),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Mariana Thayza",
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.Medium

        )
        Text(
            text = "Ceo",
            fontSize = 30.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Medium
        )
    }

}


