package com.example.viewmodel;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    int count;

    public MainViewModel() {
        Log.v("Main","Main View Model is created");
        count = 0;

    }

    //This method runs when activity destroyed so taken out of memory
    //after onDestroys() calls


    @Override
    protected void onCleared() {
        super.onCleared();
        Log.v("Main","ViewModel Destroyed");
    }

    public void increment(){
        count++;
    }

    public void decrement(){
        count--;
    }
}
