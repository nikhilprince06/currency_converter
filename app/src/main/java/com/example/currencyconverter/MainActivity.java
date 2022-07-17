package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertcurrency(View view){
        Log.i("info","button pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        String indollar = editText.getText().toString();

        double amountindollardouble= Double.parseDouble(indollar);

        double amountinrupeesdouble= amountindollardouble * 69;

        String amountinrupeesstring= String.format("%.2f", amountinrupeesdouble);

        Toast.makeText(this,
                amountindollardouble+" $ "+" will be "+amountinrupeesstring +" in INR",
                Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}