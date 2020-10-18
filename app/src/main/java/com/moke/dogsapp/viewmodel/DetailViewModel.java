package com.moke.dogsapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.moke.dogsapp.model.DogBreed;

public class DetailViewModel extends AndroidViewModel {

    public MutableLiveData<DogBreed> dogLiveData = new MutableLiveData<DogBreed>();

    public void fetch() {
        DogBreed dog1 = new DogBreed("1", "corgi", "15 years", "", "companionship", "calm and friendly", "");
        dogLiveData.setValue(dog1);
    }

    public DetailViewModel(@NonNull Application application) {
        super(application);
    }
}
