package com.moke.dogsapp.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class DogsApiService {


    private static final String BASE_URL = "https://raw.githubusercontent.com/";

    private DogsApi api;

    public DogsApiService() {
        // getting retrofit all the information that calls the API
        // and know how to return the information from the API to this application
        api = new Retrofit.Builder()
                .baseUrl(BASE_URL) // retrofit takes the host url then attach the endpoint on DogsAPI interface
                .addConverterFactory(GsonConverterFactory.create()) // Gson is an API provided by Google that simply converts Gson on the API site(backend) into the DogBreed class converts json site doc format into objects varbiale in DogBreed class into a list of json
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) // CallAdapterFActory converts List of Dogs Breed (<List<DogBreed>> into Single observable
                .build()
                .create(DogsApi.class);
    }

    public Single<List<DogBreed>> getDogs() {
        return api.getDogs();
    }

//    // this is just an example if u want to add more api's to have more endpoints(directory) of the backend server
//    public Single<List<CatBreed>> getCats() {
//        return api.getCats();
//    }
}
