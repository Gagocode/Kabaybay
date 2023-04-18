package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class baybay extends AppCompatActivity {

    private Button btn, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baybay);

        btn = (Button) findViewById(R.id.ba);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBa();
            }
        });
        btn2 = (Button) findViewById(R.id.ka);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKa();
            }
        });
        btn3 = (Button) findViewById(R.id.da);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDa();
            }
        });
    }

    private void openDa() {
        Intent intent = new Intent(this, da_baybay.class);
        startActivity(intent);
    }

    private void openKa() {
        Intent intent = new Intent(this, ka_baybay.class);
        startActivity(intent);
    }

    private void openBa() {
        Intent intent = new Intent(this, ba_baybay.class);
        startActivity(intent);
    }
}