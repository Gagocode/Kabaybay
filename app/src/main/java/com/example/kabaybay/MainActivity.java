package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

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

        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPagsusulit();
            }
        });
    }
    public void openPagbasa() {
        Intent intent = new Intent(this, Pagbasa.class);
        startActivity(intent);
    }
    public void openPagsulat() {
        Intent intent = new Intent(this, Pagsulat.class);
        startActivity(intent);
    }
    public void openKasaysayan() {
        Intent intent = new Intent(this, Pagsulat.class);
        startActivity(intent);
    }
    public void openPagsusulit() {
        Intent intent = new Intent(this, Pagsulat.class);
        startActivity(intent);
    }
    @Override
    public  void  onBackPressed() {

    }
}