package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class next extends AppCompatActivity {

    TextView f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
         f1=findViewById(R.id.t2);

         Intent j=getIntent();
         String l=j.getStringExtra("k1");
         f1.append(l);

    }
}