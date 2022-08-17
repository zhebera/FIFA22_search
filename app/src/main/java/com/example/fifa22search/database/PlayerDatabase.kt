package com.example.fifa22search.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PlayerEntity::class], version = 1, exportSchema = false)
abstract class playerDatabase: RoomDatabase(){

    abstract val dbDao: PlayerDao

    companion object{
        //@Volatile
        private var INSTANCE: playerDatabase? = null

        fun getInstance(context: Context): playerDatabase{
            synchronized(this){
                var instance = INSTANCE

                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        playerDatabase::class.java,
                        "PlayerTable"
                    ).fallbackToDestructiveMigration()
                        .build()
                }
                INSTANCE = instance
                return instance
            }
        }
    }
}