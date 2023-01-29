package com.example.livedata;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.livedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding mainBinding;
LiveModel liveModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        liveModel = new ViewModelProvider(this).get(LiveModel.class);
        //if there will be any change in data so it detects
        liveModel.count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                mainBinding.textView.setText(String.valueOf(liveModel.count.getValue()));
            }
        });


    }



    public void incrementScore(View view){
        liveModel.increment();

    }
    public void decrementScore(View view){
        liveModel.decrement();

    }
}