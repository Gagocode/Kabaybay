package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pagsusulat extends AppCompatActivity {

    private Button btn;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagsulat);

        btn = (Button) findViewById(R.id.typing);
        btn2 = (Button) findViewById(R.id.baybay);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTyping();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBaybay();
            }
        });
    }

    private void openBaybay() {
        Intent intent = new Intent(this, baybay.class);
        startActivity(intent);
    }

    private void openTyping() {
        Intent intent = new Intent(this,Sulat.class);
        startActivity(intent);
    }
}