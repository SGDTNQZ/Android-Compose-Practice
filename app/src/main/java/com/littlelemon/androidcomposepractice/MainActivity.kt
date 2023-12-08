package com.littlelemon.androidcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.littlelemon.androidcomposepractice.ui.theme.AndroidComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewApp()
        }
    }

    @Composable
    fun MyApp(){
        val label = remember { mutableStateOf("") }
        val buttonValue7: String = "7"
        val buttonValue8: String = "8"
        val buttonValue9: String = "9"

        Column(
            modifier = Modifier
                .fillMaxSize()
                .border(5.dp, color = Color(R.color.black))
                .padding(all =  10.dp)
        ) {
            Row (
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 10.dp)
            ){
                Text(text = label.value)
            }
            Row (
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxSize()
            ){
                Button(
                    onClick = { label.value = "${label.value}$buttonValue7" } ,
                    modifier = Modifier.weight(1f)
                )
                {
                    Text(
                        text = "7")
                }
                Button(
                    onClick = { label.value = "${label.value}$buttonValue8"},
                    modifier = Modifier.weight(1f)
                    ) {
                    Text(text = "8")
                }
                Button(
                    onClick = { label.value = "${label.value}$buttonValue9" },
                    modifier = Modifier.weight(1f)
                    ) {
                    Text(text = "9")
                }
                Button(
                    onClick = { label.value = "" },
                    modifier = Modifier.weight(1f)
                    ) {
                    Text(text = "C")
                }
            }

        }
    }
    @Preview
    @Composable
    fun PreviewApp(){
        AndroidComposePracticeTheme {
            MyApp()
        }
    }
}
