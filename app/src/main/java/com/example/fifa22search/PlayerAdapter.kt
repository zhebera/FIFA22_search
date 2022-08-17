package com.example.fifa22search

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlayerAdapter(private val players: List<Player>): RecyclerView.Adapter<PlayerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val view = layoutInflater.inflate(R.layout.players_fifa,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var player = players[position]

        player.playerName = holder.txtPlayerName.toString()
        player.playerPhoto = holder.imgPlayerPhoto.toString()
    }

    override fun getItemCount() = players.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imgPlayerPhoto: ImageView = itemView.findViewById(R.id.player_photo)
        val txtPlayerName: TextView = itemView.findViewById(R.id.player_name)
    }
}