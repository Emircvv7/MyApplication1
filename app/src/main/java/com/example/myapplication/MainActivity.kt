package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etc = intArrayOf(2, 4, 6, 8, 10)
        Log.d("MainActivity", "All numbers are even: ${etc.all { it % 2 == 0 }}") // Задача 1
        Log.d("MainActivity", "Sum of all numbers: ${etc.sum()}") // Задача 2
        Log.d("MainActivity", "Assembled name: ${assembleName("Эмирлан")}") // Задача 3
    }

    private fun assembleName(myName: String): String {
        val names = listOf("Эмиль", "Мирбек", "Ислам", "Руслан", "Лариса", "Аманжан", "Нурбек", "Зоя", "Иван", "Кирилл", "Дауд")
        return myName.map { char -> names.first { it.startsWith(char, ignoreCase = true) } }.joinToString(" ")
    }
}
