package com.moke.dogsapp.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {DogBreed.class}, version = 1)
public abstract class DogDataBase extends RoomDatabase {

    private static DogDataBase instance;

    public static DogDataBase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    DogDataBase.class,
                    "dogdatabase")
                    .build();
        }
        return instance;
    }

    public abstract DogDao dogDao();
}
