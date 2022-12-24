package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.intellij.lang.annotations.Language;

public class MainActivity<language> extends AppCompatActivity {

    EditText name;
    RadioGroup group;
    String gender = "Prefer Not to Say";
    CheckBox mar,hin,eng;
    Spinner sp;
    String Country;
    SwitchCompat switchcompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.e1);
        group = findViewById(R.id.rg);
        mar = findViewById(R.id.marathi);
        hin = findViewById(R.id.hindi);
        eng = findViewById(R.id.english);
        sp=findViewById(R.id.countries);
        switchcompat=findViewById(R.id.switch_com);
        String items[]=new String[]{"India","Pak","usa","uk"};

        ArrayAdapter<String> adapter=
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        sp.setAdapter(adapter);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id= radioGroup.getCheckedRadioButtonId();
                if(id==R.id.r1)
                    gender = "Male";
                else if(id==R.id.r2)
                    gender = "Female";
                else
                    gender ="Prefer Not to Say";

            }
        });

    }

   public void Capture(View view)
    {
        String s=name.getText().toString();
        String language = "";

       /* if (mar.isChecked())
            language += "marathi"+"\n";
        if(hin.isChecked())
            language += "Hindi"+"\n";
        if(eng.isChecked())
            language = "English"+"\n";
        if(!language.isEmpty())
            Toast.makeText(this, language, Toast.LENGTH_SHORT).show();*/
        if(switchcompat.isChecked()){
            Toast.makeText(this, "Switch ON", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Switch Off", Toast.LENGTH_LONG).show();
        }
    }

    public void lengthShort(View view) {
        Toast.makeText(this, "SHORT DURATION", Toast.LENGTH_SHORT).show();
    }

    public void LengthLong(View view) {
        Toast.makeText(this, "Long DURATION", Toast.LENGTH_SHORT).show();
    }
}