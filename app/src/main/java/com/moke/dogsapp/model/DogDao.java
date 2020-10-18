package com.moke.dogsapp.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

// DAO is always an interface
@Dao
public interface DogDao {
    @Insert
    List<Long> insertAll(DogBreed... dogs);

    @Query("SELECT * FROM dogbreed")
    List<DogBreed> getAllDogs();

    @Query("SELECT * FROM dogbreed WHERE uuid = :dogId")
    DogBreed getDog(int dogId);

    @Query("DELETE FROM dogbreed")
    void deleteAllDogs();
}