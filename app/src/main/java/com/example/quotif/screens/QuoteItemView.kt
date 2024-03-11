package com.example.quotif.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.quotif.models.Quotes

@Composable
fun QuoteItemView(quotes: Quotes){
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
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp,24.dp)
            ) {
                Text(text = """ " """,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(4.dp,0.dp,0.dp,0.dp))
                Spacer(modifier = Modifier.padding(4.dp))
                Text(
                    text = quotes.text ,
                    style = MaterialTheme.typography.headlineMedium,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.padding(16.dp,0.dp,0.dp,0.dp))
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text = quotes.author,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(16.dp,0.dp,0.dp,0.dp))

            }
        }
    }

}