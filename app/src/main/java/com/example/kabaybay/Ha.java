package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ha extends AppCompatActivity {

    private Button btn, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha);

        btn = (Button) findViewById(R.id.Player);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.ha);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        btn2 = (Button) findViewById(R.id.Player2);
        final MediaPlayer mmp = MediaPlayer.create(this, R.raw.he_hu);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmp.start();
            }
        });
        btn3 = (Button) findViewById(R.id.Player3);
        final MediaPlayer mpp = MediaPlayer.create(this, R.raw.ho_hu);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpp.start();
            }
        });
    }
}