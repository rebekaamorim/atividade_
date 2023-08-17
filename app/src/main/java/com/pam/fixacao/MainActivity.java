package com.pam.fixacao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

// arrumar para abrir para uma tela para outra
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn_exer1);
        Button btn2= (Button) findViewById(R.id.btn_exer3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, exer1.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, exer3.class);
                startActivity(intent);
            }
        });
    }
}