package com.example.internalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    EditText n,a;
    TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=findViewById(R.id.PersonName);
        a=findViewById(R.id.person_age);
        v=findViewById(R.id.textView);
    }

    public void savedata(View view) {
        String name = n.getText().toString() + "\n"; int age = Integer.parseInt(a.getText().toString());


        FileOutputStream fos;

        try {

            fos = openFileOutput("amit.txt",MODE_PRIVATE);
            fos.write(name.getBytes());
            fos.write((""+age).getBytes());
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        Toast.makeText(this, "Data is saved!", Toast.LENGTH_SHORT).show();

    }

    public void loadData(View view) {
        FileInputStream fis;
        try{
            fis = openFileInput("amit.txt");
            BufferedReader br =new BufferedReader(new InputStreamReader(fis));
            String line="";
            StringBuilder s=new StringBuilder();
            while ((line= br.readLine())!=null)
            {
                s.append(line+"\n");
            }
            v.setText(s.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}