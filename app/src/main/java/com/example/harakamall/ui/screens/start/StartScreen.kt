package com.example.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.harakamall.R
import com.example.harakamall.ui.theme.vomitgreen


@Composable
fun StartScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Harakamall",
            fontSize = 20.sp,
            color = Color.Cyan,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(20.dp))

        //Circular Image
        Image(painter = painterResource(R.drawable.immigration),
            contentDescription = "home",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        //End
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Find your order!!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = vomitgreen

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "This page allows you to generate random text strings using true randomness, which for many purposes is better than the pseudo-random number algorithms ...",
            textAlign = TextAlign.Center,
            fontSize = 18.sp
            )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)


        ) {
            Text(text = "Get started")

        }
    }

}
@Preview
@Composable
fun StartScreenPreview(){
    StartScreen()

}