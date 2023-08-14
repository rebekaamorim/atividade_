package com.pam.fixacao;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class exer3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exer3);

        extra = (EditText) findViewById(R.id.idextras);
        faltas = (EditText) findViewById(R.id.idfaltas);
        result = (TextView) findViewById(R.id.result);
        btn_cal = (CheckBox) findViewById(R.id.idcalcular);
    }

    EditText extra;
    EditText faltas;
    TextView result;
    CheckBox btn_cal;
}