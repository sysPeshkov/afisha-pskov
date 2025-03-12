package com.example.afishapskov

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Тестовые данные
        val events = listOf(
            Event("Вечер романса", "15 марта 2025, 19:00", "Псковская филармония"),
            Event("Выставка картин", "16 марта 2025, 10:00", "Псковский музей"),
            Event("Концерт рок-группы", "20 марта 2025, 20:00", "Клуб Псков")
        )

        // Настройка RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.eventRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EventAdapter(events)
    }
}