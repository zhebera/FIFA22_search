package com.example.fifa22search.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.fifa22search.Player

@Dao
interface PlayerDao{
    @Query("select * from playerentity")
    fun getAllDBPlayers(): List<Player>  //LiveData<List<Player>>
}