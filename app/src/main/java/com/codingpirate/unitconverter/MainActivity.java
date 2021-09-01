package com.codingpirate.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonConvert;
    TextView textViewRupees;
    EditText editTextDollars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        RegisterViews();
        onClickForConvert();
    }

    private void RegisterViews(){
        textViewRupees = (TextView) findViewById(R.id.textViewRupees);
        editTextDollars = (EditText) findViewById(R.id.editTextDollars);
        buttonConvert = (Button) findViewById(R.id.buttonConvert);
    }

    private void onClickForConvert(){
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextDollars.getText().toString()!=null){
                    double dollars = Double.parseDouble(editTextDollars.getText().toString());
                    double rupees = dollars * 74.23;
                    textViewRupees.setText(String.format("%.2f",rupees));
                }
            }
        });
    }

}