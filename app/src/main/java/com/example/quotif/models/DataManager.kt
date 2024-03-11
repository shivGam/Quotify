package com.example.quotif.models

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson

object DataManager {
    var data = emptyArray<Quotes>()
    var isLoaded = mutableStateOf(false)
    fun loadAsset(context : Context) {

        val ipStream = context.assets.open("quotes.json")
        val size = ipStream.available()
        val buffer = ByteArray(size)
        ipStream.read(buffer)
        ipStream.close()

        val json = String(buffer,Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json,Array<Quotes>::class.java)

        isLoaded.value = true
    }
}