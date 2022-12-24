package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class first extends AppCompatActivity {
    Button b1, b2;
    TextView result;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        b1 = findViewById(R.id.plus);
        b2 = findViewById(R.id.minus);
        result = findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count<10) {
                    count++;
                    result.setText(String.valueOf(count));
                }
                else
                {
                    result.setText("value is greater than 10");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count>0) {
                    count--;
                    result.setText(String.valueOf(count));
                }
                else
                {
                    result.setText("value is less than 0 ");
                }
            }
        });
    }
}