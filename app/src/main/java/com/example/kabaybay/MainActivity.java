package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button btn2;
    private Button btn3;
    private Button setting;
    private long pressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPagbasa();
            }
        });

        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPagsulat();
            }
        });

        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKasaysayan();
            }
        });

        setting = (Button) findViewById(R.id.settings);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });


    }

    private void openSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void openPagbasa() {
        Intent intent = new Intent(this, Pagbasa.class);
        startActivity(intent);
    }
    public void openPagsulat() {
        Intent intent = new Intent(this, Pagsusulat.class);
        startActivity(intent);
    }
    public void openKasaysayan() {
        Intent intent = new Intent(this, Kasaysayan.class);
        startActivity(intent);
    }
}