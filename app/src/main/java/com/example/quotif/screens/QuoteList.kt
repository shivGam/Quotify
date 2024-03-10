package com.example.quotif.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ShowPreview() {
    QuoteListItem()
}
@Composable
fun QuoteListItem(){
    Card(
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        modifier = Modifier.padding(8.dp).background(
            Color(255 ,255, 255)
        )
    ) {
        Row(Modifier.padding(2.dp,2.dp,8.dp,2.dp)) {
            Text(text = """ " """,
                style = MaterialTheme.typography.headlineMedium,
                fontFamily = FontFamily.Monospace)
            Column {
                Spacer(modifier = Modifier.padding(0.dp,12.dp,0.dp,0.dp))
                Text(text = "Time is the most valuable thing a man can spend.")
                Spacer(modifier = Modifier.padding(8.dp))
                Box {
                    Text(text = "-",
                        modifier = Modifier
                            .background(Color(0xFF424242))
                            .fillMaxWidth(.4f)
                            .height(2.dp))
                }
                Text(text = "~ Dhananjay Tripathi",
                    style = MaterialTheme.typography.bodySmall,
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