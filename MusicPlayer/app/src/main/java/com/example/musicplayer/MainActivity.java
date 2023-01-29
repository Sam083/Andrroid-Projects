package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_baseline_library_music_24);
    }

    public void startMusic(View view) {
        startService(new Intent(this,MusicServices.class));
    }

    public void stopMusic(View view) {
        stopService(new Intent(this,MusicServices.class));
    }
}