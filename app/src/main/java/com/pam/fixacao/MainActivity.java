package com.pam.fixacao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btn_exer1);
        btn2= (Button) findViewById(R.id.btn_exer3);
        // fazer intent btn1 depois que o paulo fizer

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick (View v) {
                Intent in = new Intent(MainActivity.this, exer3.class);

                startActivity(in);
            }
        });

    }

    Button btn1;
    Button btn2;
}


