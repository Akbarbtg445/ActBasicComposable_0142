package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ClasC(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 100.dp)) {
        Text("malam wok")
        Text("Selamat malam")
        Text("Saya sedang belajar")
    }
}