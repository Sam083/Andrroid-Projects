package com.example.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mobile mobile;
        MobileComponent mobileComponent = DaggerMobileComponent.create();

        mobile = mobileComponent.getMobile();

    }
}