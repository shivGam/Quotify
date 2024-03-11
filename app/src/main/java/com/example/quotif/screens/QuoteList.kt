package com.example.quotif.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ShowPreview() {
    QuoteItemView()
}
@Composable
fun QuoteListItem(){
    Card(
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        modifier = Modifier.padding(8.dp),
        colors = CardDefaults.cardColors(Color.Black),
        //onClick = {  }
    ) {
        Row(Modifier.padding(2.dp,2.dp,8.dp,2.dp)) {
            Text(text = """ " """,
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                fontFamily = FontFamily.Monospace)
            Column {
                Spacer(modifier = Modifier.padding(0.dp,12.dp,0.dp,0.dp))
                Text(text = "Time is the most valuable thing a man can spend.",
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.padding(8.dp))
                Box {
                    Text(text = "-",
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth(.4f)
                            .height(2.dp))
                }
                Text(text = "~ Dhananjay Tripathi",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White,
                    modifier = Modifier
                        .padding(8.dp)
                        .align(
                            AbsoluteAlignment.Right
                        ),
                    textAlign = TextAlign.End)
            }
        }
    }
}

@Composable
fun QuoteItemView(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.Black,
                        Color.White
                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.elevatedCardElevation(4.dp),
            modifier = Modifier.padding(32.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Column(
                verticalArrangement =Arrangement.Center,
                modifier = Modifier.padding(16.dp,24.dp)
            ) {
                Text(text = """ " """,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(4.dp,0.dp,0.dp,0.dp))
                Spacer(modifier = Modifier.padding(4.dp))
                Text(
                    text = "Time is the most valuable thing a nan can spend." ,
                    style = MaterialTheme.typography.headlineMedium,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(16.dp,0.dp,0.dp,0.dp))
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text = "Dhananjay Tripathi",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(16.dp,0.dp,0.dp,0.dp))

            }
        }
    }
    
}