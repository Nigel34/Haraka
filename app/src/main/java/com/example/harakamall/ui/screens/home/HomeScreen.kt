package com.example.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.harakamall.R
import org.w3c.dom.Text

@Composable
fun HomeScreen(){
Column(modifier = Modifier.fillMaxSize()
) {
    Text(
        text = "Harakamall" ,
        fontSize = 30.sp,
        color = Color.Gray,
        fontWeight = FontWeight.ExtraBold,
    )
    Text(
        text = "Welcome to my app",
        fontSize = 15.sp,
        fontStyle = FontStyle.Italic

        )

    Image(painter = painterResource(R.drawable.Freelancing),
        contentDescription = "home"
    )
    
    Text(
        text = "Focus by MDS is a Chrome extension designed to enhance your productivity. It combines a to-do list with a Pomodoro timer, helping you manage tasks efficiently while maintaining focus. Beautiful wallpapers add an aesthetic touch, creating a motivating and visually pleasing workspace in every new tab.",
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,

    )
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(Color.Gray),
        shape = RoundedCornerShape(size = 10.dp)


    ) {
        Text(text = "Add to cart")

    }
}

}
@Preview(showBackground = true)
@Composable
fun HomescreenPreview(){
    HomeScreen()
}