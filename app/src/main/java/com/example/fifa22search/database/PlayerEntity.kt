package com.example.fifa22search.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PlayerEntity (
    @PrimaryKey val playerId: Int,
    @ColumnInfo(name = "playerName") val playerName: String?,
    @ColumnInfo(name = "playerPhoto") val playerPhoto: String?
)
