package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.name);
    }

    public void Submit(View view) {
        String data = ed.getText().toString();
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("Name",data);
        startActivity(i);

    }
}