package com.example.counter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);

        if (savedInstanceState != null && savedInstanceState.containsKey("KEY")) //conains key for if there are more than one key
        {
            counter = savedInstanceState.getInt("KEY");
            result.setText(String.valueOf(counter));
        }
    }


    public void plus(View view) {
        result.setText(String.valueOf(++counter));
    }

    public void minus(View view) {
        result.setText(String.valueOf(++counter));
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("KEY", counter);
        //outState.putInt("KEY2",counter2); ---> if more values r there
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu); //inflate means attach
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.first:
                Toast.makeText(this,"First",Toast.LENGTH_SHORT).show();
                break;
            case R.id.second:
                Toast.makeText(this,"Second",Toast.LENGTH_SHORT).show();
                break;
            case R.id.reset:
            {
                counter = 0;
                result.setText(String.valueOf(counter));
                break;
            }
        }
        return true;
    }
}






