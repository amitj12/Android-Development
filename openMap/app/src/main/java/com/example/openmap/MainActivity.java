package com.example.openmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1= findViewById(R.id.t1);

    }
    public void next(View view)
    {
        String s=f1.getText().toString();
        Intent i=new Intent(Intent.ACTION_VIEW);
        Uri data = Uri.parse("geo:0,0?q="+s);

        i.setData(data);
        startActivity(i);

    }
}