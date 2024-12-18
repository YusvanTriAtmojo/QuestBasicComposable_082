package com.example.application2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.application2.ui.theme.Application2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Application2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(
    modifier: Modifier = Modifier
){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().background(Color(0xFFE0E0E0))){
        Text(
            text = "Indonesia",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green,
            )
        )
        Text(
            text = "0",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )

        Image(painter = painterResource(id =R.drawable.fifa),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .shadow(5.dp, shape = CircleShape)
        ) //atau " "

        Text(
            text = "Nama",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(20.dp),
        )

        Text(
            text = "Yusvan Tri Atmojo",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                brush = Brush.linearGradient(listOf(Color.Green, Color.Blue)),
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                shadow = Shadow(
                    color = Color.Black,
                    offset = Offset(3f,3f),
                    blurRadius = 5f),
            )
        )
        Text(
            text = "20220140082",
            modifier = Modifier.padding(20.dp),
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Blue,
                letterSpacing = 4.sp,
            )

        )
        Image(painter = painterResource(id =R.drawable.saya),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .shadow(5.dp, shape = CircleShape)
        )
    }
}
