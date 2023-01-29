package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    Spinner spinner;
    SwitchCompat switchCompat;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        switchCompat = findViewById(R.id.switchButton);
        tv = findViewById(R.id.tv);
        String[]entries = new String[]{"","India","USA","UK","Australia","Brazil"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                entries);
        spinner.setAdapter(adapter);
        //TODO: when multiple items are there and only single view
        //TODO: then use array adapter to populate item from database to view

        spinner.setOnItemSelectedListener(this);
        switchCompat.setOnCheckedChangeListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this,adapterView.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked)
            //Toast.makeText(this,"Switch is On",Toast.LENGTH_SHORT).show();
            tv.setText("Switch is On");
        else
            //Toast.makeText(this,"Switch is Off",Toast.LENGTH_SHORT).show();
        tv.setText("Switch is Off");

    }
}