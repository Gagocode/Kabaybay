package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pagbasa extends AppCompatActivity {
    private Button btn;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagbasa);

        btn = (Button) findViewById(R.id.patinig);
        btn2 = (Button) findViewById(R.id.katinig);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPatinig();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKatinig();
            }
        });
    }

    private void openKatinig() {
        Intent intent = new Intent(this, Katinig.class);
        startActivity(intent);
    }

    private void openPatinig() {
        Intent intent = new Intent(this, Patinig.class);
        startActivity(intent);
    }
}