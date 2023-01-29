package com.example.databinding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding mainBinding;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        if (savedInstanceState != null && savedInstanceState.containsKey("KEY")) //conains key for if there are more than one key
        {
            count = savedInstanceState.getInt("KEY");
            mainBinding.textView.setText(String.valueOf(count));
        }

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("KEY", count);
        //outState.putInt("KEY2",counter2); ---> if more values r there
    }


    public void incrementScore(View view){
        count++;
        mainBinding.textView.setText(String.valueOf(count));
    }
    public void decrementScore(View view){
        count--;
        mainBinding.textView.setText(String.valueOf(count));
    }
}