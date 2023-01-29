package com.example.livedata;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LiveModel extends ViewModel {
    MutableLiveData<Integer>count;

    public LiveModel() {
        Log.e("Main","Main View Model is created");
        count = new MutableLiveData<>();
        count.setValue(0);


    }

    //This method runs when activity destroyed so taken out of memory
    //after onDestroys() calls


    @Override
    protected void onCleared() {
        super.onCleared();
        Log.v("Main","ViewModel Destroyed");
    }

    public void increment(){

        count.setValue(count.getValue() + 1);
    }

    public void decrement(){

        count.setValue(count.getValue() - 1);
    }
}
