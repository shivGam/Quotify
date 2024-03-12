package com.example.quotif.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.unit.dp
import com.example.quotif.models.Quotes

@Composable
fun QuoteListItem(quotes: Quotes,onClick : (quote : Quotes) -> Unit){
    Card(
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        modifier = Modifier.padding(8.dp)
            .clickable { onClick(quotes) },
        colors = CardDefaults.cardColors(Color.Black),
    ) {
        Row(Modifier.padding(2.dp,8.dp,8.dp,2.dp)) {
            Text(text = """ " """,
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                fontFamily = FontFamily.Monospace)
            Column {
                Spacer(modifier = Modifier.padding(0.dp,12.dp,0.dp,0.dp))
                Text(text = quotes.text,
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.fillMaxWidth(1f))
                Spacer(modifier = Modifier.padding(8.dp))
                Box {
                    Text(text = "-",
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth(.4f)
                            .height(2.dp))
                }
                Text(text = " ~${quotes.author}",
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