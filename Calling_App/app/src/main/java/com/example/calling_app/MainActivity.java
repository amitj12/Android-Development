package com.example.calling_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= findViewById(R.id.t1);
    }
    public void next(View view)
    {
        String s=e1.getText().toString();
        Intent i = new Intent(Intent.ACTION_CALL);
        Uri data = Uri.parse("tel:"+s);
        i.setData(data);

        startActivity(i);


    }
}