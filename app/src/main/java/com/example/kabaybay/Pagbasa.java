package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Pagbasa extends AppCompatActivity {

    private Button btn;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagbasa);

        btn = (Button) findViewById(R.id.button5);
        btn2 = (Button) findViewById(R.id.button6);
        btn3 = (Button) findViewById(R.id.button7);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBa();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKa();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTa();
            }
        });

    }

    private void openTa() {
        Intent intent = new Intent(this, Ta.class);
        startActivity(intent);
    }

    private void openKa() {
        Intent intent = new Intent(this, Ka.class);
        startActivity(intent);
    }

    private void openBa() {
        Intent intent = new Intent(this, Ba.class);
        startActivity(intent);
    }
}