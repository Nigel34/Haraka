package com.example.harakamall.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.harakamall.R
import com.example.harakamall.ui.theme.newwhite
import com.example.harakamall.ui.theme.vomitgreen
import com.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),

    ){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = vomitgreen,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite

            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu"  )
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = ""  )
                }
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = ""  )
                }
            }

        )
        //End
        Image(
            painter = painterResource(R.drawable.immigration),
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentDescription = "Home",

        )
        Spacer(modifier = Modifier.height(20.dp))
        //Searchbar

        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "Search..") }
        )
        //End of Searchbar
        Spacer(modifier = Modifier.height(10.dp))

        //Row
      Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
          Row (){
              Image(
                  painter = painterResource(R.drawable.juxta),
                  contentScale = ContentScale.FillWidth,
                  modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                  contentDescription = "Home",


                  )
              Spacer(modifier = Modifier.height(10.dp))

              Column {
                  Text(text = "Men's T-shirt",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold)
                  Text(text = "Casual wear",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold)
                  Text(text = "Ksh 12000",
                      fontSize = 15.sp,
                      textDecoration = TextDecoration.LineThrough, )
                  Text(text = "Ksh 1900",
                      fontSize = 15.sp,
                      fontWeight = FontWeight.ExtraBold)


              }
              Row {
                  Icon(imageVector = Icons.Default.Star, contentDescription = "",)
                  Icon(imageVector = Icons.Default.Star, contentDescription = "",)
                  Icon(imageVector = Icons.Default.Star, contentDescription = "")
                  Icon(imageVector = Icons.Default.Star, contentDescription = "")
                  Icon(imageVector = Icons.Default.Star, contentDescription = "")

              }
              Button(
                  onClick = {},
                  colors = ButtonDefaults.buttonColors(Color.Gray),
                  shape = RoundedCornerShape(size = 10.dp)


              ) {
                  Text(text = "Add to cart")

              }

          }

      }
        //end of row


        //Row
        Row (){
            Image(
                painter = painterResource(R.drawable.juxta),
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentDescription = "Home",


                )
            Spacer(modifier = Modifier.height(10.dp))

            Column {
                Text(text = "Men's T-shirt",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold)
                Text(text = "Casual wear",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold)
                Text(text = "Ksh 12000",
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.LineThrough, )
                Text(text = "Ksh 1900",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.ExtraBold)


            }
            Row {
                Icon(imageVector = Icons.Default.Star, contentDescription = "",)
                Icon(imageVector = Icons.Default.Star, contentDescription = "",)
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
                Icon(imageVector = Icons.Default.Star, contentDescription = "")

            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.Gray),
                shape = RoundedCornerShape(size = 10.dp)


            ) {
                Text(text = "Add to cart")

            }


        }
    } //end of row


    }



@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())

}