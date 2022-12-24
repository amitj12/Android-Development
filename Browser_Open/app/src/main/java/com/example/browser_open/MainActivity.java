package com.example.browser_open;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1=findViewById(R.id.e1);
    }

    public void next(View view) {
        String s=f1.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW);
        Uri u =Uri.parse("https://"+s);
        i.setData(u);
        startActivity(i);

    }
}