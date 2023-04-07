package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle ;
import android.view.View;
import android.widget.Button;

public class Kasaysayan extends AppCompatActivity {

    private Button btn;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasaysayan);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSimula();
            }
        });
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKolonyalisasyon();
            }
        });
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRebolusyon();
            }
        });
    }

    private void openSimula() {
        Intent intent = new Intent(this, Simula.class);
        startActivity(intent);
    }
    private void openKolonyalisasyon() {
        Intent intent = new Intent(this, Koloniyalisasyon.class);
        startActivity(intent);
    }
    private void openRebolusyon() {
        Intent intent = new Intent(this, Rebolusyon.class);
        startActivity(intent);
    }


}