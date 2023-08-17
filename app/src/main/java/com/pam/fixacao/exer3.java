package com.pam.fixacao;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
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
        hextra = (TextView) findViewById(R.id.hextra);
        hfaltas = (TextView) findViewById(R.id.hfaltas);
        btn_cal = (CheckBox) findViewById(R.id.idcalcular);


        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h_ex = Double.parseDouble(extra.getText().toString());
                h_fal = Double.parseDouble(faltas.getText().toString());

                calcular();
                apresentar();

            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void calcular() {

        double H = (h_ex) - (2 / 3* (h_fal));

        if (btn_cal.isChecked()){
            if (H>2400){
                result.setText("Seu prêmio é de R$500,00!");
            } else if (H >=1801){
                result.setText("Seu prêmio é de R$400,00!");
            } else if (H >= 1201){
                result.setText("Seu prêmio é de R$300,00!");
            } else if (H >= 600 ){
                result.setText("Seu prêmio é de R$200,00!");
            } else{
                result.setText("Seu prêmio é de R$100,00!");
            }

        } else {
            result.setText("");
        }
    }


    @SuppressLint("SetTextI18n")
    public void apresentar() {


        double horaext = h_ex / 60;
        double horafal = h_fal / 60;

        if (btn_cal.isChecked()) {

            hextra.setText(Double.toString(horaext));
            hfaltas.setText(Double.toString(horafal));

        } else{
                hextra.setText("");
                hfaltas.setText("");
            }
    }
    EditText extra;
    EditText faltas;
    TextView result;
    TextView hextra;
    TextView hfaltas;
    CheckBox btn_cal;
    Double h_ex, h_fal;
}

