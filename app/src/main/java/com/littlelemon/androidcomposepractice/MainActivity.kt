package com.littlelemon.androidcomposepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.androidcomposepractice.ui.theme.AndroidComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        5.dp,
                        color = Color(R.color.white)
                    )
                    .height(50.dp)
            )
            {
                Row (
                    modifier = Modifier
                        .height(32.dp)
                        .border(
                            1.dp,
                            color = Color(R.color.purple_500)
                        )
                        .fillMaxWidth()
                        .background(Color(R.color.teal_700)),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically

                ){
                    Text(
                        text = stringResource(id = R.string.normal_text),
                        color = Color(R.color.black)
                    )
                    Text(
                        text = stringResource(id = R.string.bold_text),
                        fontWeight = FontWeight.Bold,
                        color = Color(R.color.black)
                    )
                    Text(
                        text = stringResource(id = R.string.italic_text),
                        fontStyle = FontStyle.Italic,
                        color = Color(R.color.black)
                    )
                    Text(
                        text = stringResource(id = R.string.bold_italic_text),
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color(R.color.black)
                    )

                }
            }


        }
    }
}
