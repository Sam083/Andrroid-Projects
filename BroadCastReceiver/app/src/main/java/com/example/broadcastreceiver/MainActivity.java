package com.example.broadcastreceiver;

import static android.content.Intent.ACTION_POWER_CONNECTED;
import static android.content.Intent.ACTION_POWER_DISCONNECTED;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    //enum status{Connected, Disconnected }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.power);

        IntentFilter intentFilter = new IntentFilter();
        //broadcast which you want to receive written to this object
        intentFilter.addAction(ACTION_POWER_CONNECTED);
        intentFilter.addAction(ACTION_POWER_DISCONNECTED);

        /* Register Broadcast */
        registerReceiver(new PowerReceiver(imageView,textView),intentFilter);
    }

        /* Unregister Receiver */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(new PowerReceiver(imageView,textView));
    }
}



/*
I want to receive
-->ACTION POWER CONNECTED
-->ACTION POWER DISCONNECTED

Your broadcast receiver class will have onReceive(...)method and invoked only when
there is a broadcast of our interest appears
 */