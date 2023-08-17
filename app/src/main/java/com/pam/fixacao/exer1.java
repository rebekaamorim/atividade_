package com.pam.fixacao;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class exer1 extends AppCompatActivity {

    private EditText editTextA, editTextB;
    private TextView textViewResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        textViewResult = findViewById(R.id.textViewResult);
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
}