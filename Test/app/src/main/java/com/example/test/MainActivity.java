package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button a1,a2,b1,b2;
    TextView v1,v2,v3;
    int count1=0,count2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1=findViewById(R.id.first_plus);
        a2=findViewById(R.id.first_minus);
        b1=findViewById(R.id.second_plus);
        b2=findViewById(R.id.second_minus);

        v1=findViewById(R.id.first_text);
        v2=findViewById(R.id.second_text);
        v3=findViewById(R.id.middle_text);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1++;
                v1.setText(String.valueOf(count1));
                if(count1==count2) {
                    v3.setText("Result is same");
                }
                else
                {
                    v3.setText("Result is Different");
                }

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1--;
                v1.setText(String.valueOf(count1));
                if(count1==count2) {
                    v3.setText("Result is same");
                }
                else
                {
                    v3.setText("Result is Different");
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2++;
                v2.setText(String.valueOf(count2));
                if(count1==count2) {
                    v3.setText("Result is same");
                }
                else
                {
                    v3.setText("Result is Different");
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2--;
                v2.setText(String.valueOf(count2));
                if(count1==count2) {
                    v3.setText("Result is same");
                }
                else
                {
                    v3.setText("Result is Different");
                }

            }
        });

    }
}
