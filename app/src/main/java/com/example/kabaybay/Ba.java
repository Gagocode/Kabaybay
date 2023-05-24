package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ba extends AppCompatActivity {

    private ImageButton btn, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba);

        btn = (ImageButton) findViewById(R.id.Player);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.ba);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        btn2 = (ImageButton) findViewById(R.id.Player2);
        final MediaPlayer mmp = MediaPlayer.create(this, R.raw.be_bi);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmp.start();
            }
        });
        btn3 = (ImageButton) findViewById(R.id.Player3);
        final MediaPlayer mpp = MediaPlayer.create(this, R.raw.bo_bu);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpp.start();
            }
        });
    }
}