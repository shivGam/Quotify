package com.example.quotif

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform
import com.example.quotif.models.DataManager
import com.example.quotif.models.Quotes
import com.example.quotif.screens.QuoteItemView
import com.example.quotif.screens.QuoteList
import com.example.quotif.screens.QuoteListItem
import com.example.quotif.screens.QuoteScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if (! Python.isStarted()) {
            Python.start(AndroidPlatform(this))
        }
        val py = Python.getInstance()
        val module = py.getModule("get_quotes")
        val fact = module["calculate_factorial"]
        val num = fact?.call(10)

        CoroutineScope(Dispatchers.IO).launch{
            DataManager.loadAsset(applicationContext)
        }
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    if(DataManager.isLoaded.value){
        if(DataManager.currentPage.value == Screen.List){
            QuoteScreen(data = DataManager.data) {
                DataManager.switchScreen(it)
            }
        }
        else {
           DataManager.currentQuote?.let{
               QuoteItemView(quotes = it)
           }
        }

    }
    else {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize(1f)
        ) {
           Text(text = "Loading",
               style = MaterialTheme.typography.bodyMedium)
        }

    }
}
enum class Screen{
    List,
    View
}

