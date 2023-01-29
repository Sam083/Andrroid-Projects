package com.example.contentresolver;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

//uri is path of the file
public class MainActivity extends AppCompatActivity {

    //First copy of the unique identifier of the content provider you want to access

    public static String AUTHORITIES= "com.example.data";
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);

        Uri CONTENT_URI = Uri.parse("content://"+AUTHORITIES);

        Cursor c = getContentResolver().query(CONTENT_URI,null,null,null,null);

        result.setText("");
        c.moveToFirst();
        do{
            result.append(c.getInt(0)+"\n");
            result.append(c.getString(1)+"\n");
            result.append(c.getInt(2)+"\n\n");
        }while(c.moveToNext());

    }
    }