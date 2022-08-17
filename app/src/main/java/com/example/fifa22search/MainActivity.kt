package com.example.fifa22search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recylerView)

        val players = initPlayers()
        val adapter = PlayerAdapter(players)
        recyclerView.adapter = adapter
    }

    private fun initPlayers(): List<Player> {
        val players: MutableList<Player> = mutableListOf()

        players.add(Player("Ricardo","https://upload.wikimedia.org/wikipedia/commons/9/99/Ricardo_Costa_-_Croatia_vs._Portugal%2C_10th_June_2013_%28crop%29.jpg"))
        players.add(Player("Totti", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ea/KL-2018_%287%29.jpg/250px-KL-2018_%287%29.jpg"))

        return players
    }
}