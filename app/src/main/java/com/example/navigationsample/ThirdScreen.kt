package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ThirdScreen(navigateToFirstScreen:()->Unit){


//    Adding a column
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text("This is the third screen", fontSize = 24.sp)
        Text("Welcome!", fontSize = 24.sp)

//        Adding a button
        Button(onClick = { navigateToFirstScreen() }) {
            Text("Go to the first screen!")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun ThirdPreview(){
    ThirdScreen({})
}
