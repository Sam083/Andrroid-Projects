package com.example.broadcastreceiver;

import static android.content.Intent.ACTION_POWER_CONNECTED;
import static android.content.Intent.ACTION_POWER_DISCONNECTED;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class PowerReceiver extends BroadcastReceiver {

    ImageView imageView;
    TextView textView;

    public enum status{
        POWER_CONNECTED, POWER_DISCONNECTED
    }

    PowerReceiver(ImageView imageView,TextView textView)
    {
        this.imageView = imageView;
        this.textView = textView;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        switch (intent.getAction())
        {
            case ACTION_POWER_CONNECTED:

                imageView.setImageResource(R.drawable.charging);
                textView.setText(status.POWER_CONNECTED.toString());
                break;
            case  ACTION_POWER_DISCONNECTED:
                imageView.setImageResource(R.drawable.discharging);
                textView.setText(status.POWER_DISCONNECTED.toString());
                break;
        }
    }
}