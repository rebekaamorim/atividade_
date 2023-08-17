package com.pam.fixacao;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class exercicio1 extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        calcular = (Button) findViewById(R.id.btncal);
        val1 = (EditText) findViewById(R.id.idn1);
        val2 = (EditText) findViewById(R.id.idn2);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Integer.parseInt(val1.getText().toString());
                n2 = Integer.parseInt(val2.getText().toString());

                cal();
            }
        });
    }

    public void cal() {


    }


    Button calcular;
    EditText val1;
    EditText val2;

    int n1;
    int n2;

}