package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.t1);


    }

    public void nextPage(View view) {
        String s = e1.getText().toString();
        Intent i=new Intent(this,next.class);

        i.putExtra("k1",s);
        startActivity(i);



    }
}