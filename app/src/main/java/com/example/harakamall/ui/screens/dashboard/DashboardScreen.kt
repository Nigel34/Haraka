package com.example.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.harakamall.R
import com.example.harakamall.ui.theme.madorange
import com.example.harakamall.ui.theme.vomitgreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().background(vomitgreen)

    ){
//Box
        Box (){
            //Card
            Card(modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(madorange)

                ) {
                TopAppBar(
                    title = { Text(text = "DASHBOARD SECTION") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "") }
                    }
                )



            }
//End of card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(start = 20.dp, end = 20.dp)
                .offset(y = 90.dp)
            ) {
//Contents of the card
            }

        }
        //End of box
        Spacer(modifier = Modifier.height(100.dp))
        //Row
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //Card1
            Card (modifier = Modifier.width(150.dp).height(200.dp),
            elevation = CardDefaults.cardElevation(10.dp)){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.graded),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 15.sp)
                }

            }
            //End of Card1
            Spacer(modifier = Modifier.width(20.dp))
            //Card2
            Card (modifier = Modifier.width(150.dp).height(200.dp),
                elevation = CardDefaults.cardElevation(10.dp)){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 15.sp)
                }

            }
            //End of Card2
        }
        //End of the row

            Spacer(modifier = Modifier.height(30.dp))

        Row(modifier = Modifier.padding(start = 20.dp)) {

            //Card1
            Card (modifier = Modifier.width(150.dp).height(200.dp),
                elevation = CardDefaults.cardElevation(10.dp)){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.products),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 15.sp)
                }

            }
            //End of Card1
            Spacer(modifier = Modifier.width(20.dp))
            //Card2
            Card (modifier = Modifier.width(150.dp).height(200.dp),
                elevation = CardDefaults.cardElevation(10.dp)){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 15.sp)
                }

            }
            //End of Card2
        }
        //End of the row
    }

}
@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
