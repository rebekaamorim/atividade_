package com.pam.fixacao;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class exer1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = (EditText) findViewById(R.id.editTextA);
        editTextB = (EditText) findViewById(R.id.editTextB);
        textViewResult = (TextView) findViewById(R.id.TextVewResult);
    }

    @SuppressLint("SetTextI18n")
    public void checkMultiples(View view) {
        int a = Integer.parseInt(editTextA.getText().toString());
        int b = Integer.parseInt(editTextB.getText().toString());

        if (a % b == 0 || b % a == 0) {
            textViewResult.setText("São múltiplos");
        } else {
            textViewResult.setText("Não são múltiplos");
        }
    }
    EditText editTextA, editTextB;
    TextView textViewResult;

}