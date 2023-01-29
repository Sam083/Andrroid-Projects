package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.audiofx.BassBoost;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed,ed2,phone_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.url_et);
        ed2 = findViewById(R.id.url_et2);
        phone_et = findViewById(R.id.phone_et);
    }

    public void Open(View view) {
        String data = ed.getText().toString();
        Uri webpage;
        if(data.contains("https://"))
            webpage = Uri.parse(data);
         else
             webpage = Uri.parse("https://"+data);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(webpage);
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
        else
            Toast.makeText(this,"No Activity Found",Toast.LENGTH_SHORT);


    }

    public void OpenMaps(View view) {

        String data = ed2.getText().toString();
        Uri mappage;
        if(data.contains("geo:0,0?q="))
            mappage = Uri.parse(data);
        else
            mappage = Uri.parse("geo:0,0?q="+data);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(mappage);
        //or Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q="+data));
        startActivity(intent);
    }

    public void openDailer(View view) {
        String pn = phone_et.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+pn));
        startActivity(intent);
    }

    public void OpenWIFI(View view) {
        Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(intent);
    }
}