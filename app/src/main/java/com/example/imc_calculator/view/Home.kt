package com.example.imc_calculator.view

import android.icu.text.CaseMap
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imc_calculator.ui.theme.Blue
import com.example.imc_calculator.ui.theme.Red

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(){

    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    var textFieldError by remember { mutableStateOf(false) }
    var resultMessage by remember { mutableStateOf("IMC 24.1 \n Peso normal") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "IMC calculator")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Blue,
                    titleContentColor = Color.White
                )
            )
        }
    ) {paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(paddingValues)
                .background(color = Color.White)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Height (cm)",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(20.dp, 60.dp, 0.dp, 20.dp)
                )
                Text(text = "weight (kg)",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp, 60.dp, 20.dp, 20.dp)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(0.3f)
                        .padding(20.dp, 0.dp, 0.dp, 0.dp),
                    keyboardOptions = KeyboardOptions(
                       keyboardType = KeyboardType.NumberPassword
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedLabelColor = Blue,
                        focusedIndicatorColor = Blue,
                        unfocusedIndicatorColor = Blue,
                        cursorColor = Blue,
                        errorContainerColor = Color.White
                    ),
                    isError = textFieldError,
                    value = height,
                    onValueChange = {
                        if (it.length <= 3){
                            height = it
                        }
                    },
                    label = {
                        Text(text = "Ex: 165")
                    }
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(0.5f)
                        .padding(0.dp, 0.dp, 20.dp, 0.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Decimal
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedLabelColor = Blue,
                        focusedIndicatorColor = Blue,
                        unfocusedIndicatorColor = Blue,
                        cursorColor = Blue,
                        errorContainerColor = Color.White
                    ),
                    isError = textFieldError,
                    value = weight,
                    onValueChange = {
                        if(it.length <= 7){
                            weight = it
                        }
                    },
                    label = {
                        Text(text = "Ex: 70.50")
                    }
                )
            }

            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Blue
                ),
                onClick = {}
            ) {
                Text(text = "Calculate", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }

            Text(text = resultMessage,
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                fontSize = 18.sp,
                color = Blue,
                textAlign = TextAlign.Center
            )

        }

    }
}

@Preview
@Composable
private fun HomePreview(){
    Home()
}