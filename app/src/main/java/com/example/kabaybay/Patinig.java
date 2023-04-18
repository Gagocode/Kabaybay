package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patinig extends AppCompatActivity {

    private Button btn, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patinig);

        btn = (Button) findViewById(R.id.a);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.a);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        btn2 = (Button) findViewById(R.id.e);
        final MediaPlayer mmp = MediaPlayer.create(this, R.raw.e_i);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmp.start();
            }
        });
        btn3 = (Button) findViewById(R.id.o);
        final MediaPlayer mpp = MediaPlayer.create(this, R.raw.o_u);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpp.start();
            }
        });
    }
}