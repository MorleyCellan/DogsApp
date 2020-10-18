package com.moke.dogsapp.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface DogsApi {

    // Single data type is part of RxJava
    // Single type means an observable that returns a single value and then closes
    @GET("DevTides/DogsApi/master/dogs.json") // converts the information into a List that defines in List DogBreed and returns a data as a Single
    Single<List<DogBreed>> getDogs();

//    // this is just a sample
//    @GET("DevTides/CatsApi/master/cats.json")
//    Single<List<CatBreed>> getCats();
}
