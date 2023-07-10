package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.res);
    }

    public void decre(View view) {
        count--;
        t1.setText(String.valueOf(count));
    }

    public void incr(View view) {
        count++;
        t1.setText(String.valueOf(count));
    }
}