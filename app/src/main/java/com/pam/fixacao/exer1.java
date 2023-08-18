package com.pam.fixacao;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class exer1 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exer1);

        // Nesta parte, está ligado as variáveis com a view desta activity
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        textViewResult = findViewById(R.id.textViewResult);
        btnverificar = findViewById(R.id.btnverificar);

        btnverificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Foram usadas as variáveis para verificar todos do tipo "integer"
                int a = Integer.parseInt(editTextA.getText().toString());
                int b = Integer.parseInt(editTextB.getText().toString());

                // Métodos de checar/verificar múltiplos:
                checkMultiples(a, b);
            }
        });
    }

    @SuppressLint("SetTextI18n")

    // Criando o método de checar/verificar os multiplos dos valores de a e b
    public void checkMultiples(int a, int b) {

        // Condições/Fórmula utilizada:
        if (a % b == 0 || b % a == 0) {
            textViewResult.setText("São múltiplos");
        } else {
            textViewResult.setText("Não são múltiplos");
        }
    }
    // Variáveis utilizadas:
    EditText editTextA;
    EditText editTextB;
    TextView textViewResult;
    Button btnverificar;
}