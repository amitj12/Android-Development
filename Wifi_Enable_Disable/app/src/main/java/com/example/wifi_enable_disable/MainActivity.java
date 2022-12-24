package com.example.wifi_enable_disable;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wifi_enable_disable.R;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.e1);
        b2 = findViewById(R.id.d1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                WifiManager w1;
                w1 = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                w1.setWifiEnabled(true);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager w1;
                w1 = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                w1.setWifiEnabled(false);

            }
        });

    }
}