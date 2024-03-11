package com.example.quotif.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotif.models.Quotes

@Composable
fun QuoteList(data:Array<Quotes> ,onClick : () -> Unit ){
    LazyColumn(content =  {
        items(data){
            QuoteListItem(quotes = it) {
                onClick()
            }
        }
    })
}