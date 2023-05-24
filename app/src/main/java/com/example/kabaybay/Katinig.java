package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Katinig extends AppCompatActivity {

    private Button btn;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katinig);

        btn = (Button) findViewById(R.id.ba);
        btn2 = (Button) findViewById(R.id.ka);
        btn3 = (Button) findViewById(R.id.da);
        btn4 = (Button) findViewById(R.id.ga);
        btn5 = (Button) findViewById(R.id.ha);
        btn6 = (Button) findViewById(R.id.la);
        btn7 = (Button) findViewById(R.id.ma);
        btn8 = (Button) findViewById(R.id.na);
        btn9 = (Button) findViewById(R.id.pa);
        btn10 = (Button) findViewById(R.id.sa);
        btn11 = (Button) findViewById(R.id.ta);
        btn12 = (Button) findViewById(R.id.wa);
        btn13 = (Button) findViewById(R.id.ya);
        btn14 = (Button) findViewById(R.id.nga);
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
                openDa();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGa();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHa();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLa();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMa();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNa();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPa();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSa();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTa();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWa();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYa();
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNga();
            }
        });

    }

    private void openNga() {
        Intent intent = new Intent(this, nga.class);
        startActivity(intent);
    }

    private void openYa() {
        Intent intent = new Intent(this, Ya.class);
        startActivity(intent);
    }
    private void openWa() {
        Intent intent = new Intent(this, Wa.class);
        startActivity(intent);
    }
    private void openTa() {
        Intent intent = new Intent(this, Ta.class);
        startActivity(intent);
    }

    private void openSa() {
        Intent intent = new Intent(this, Sa.class);
        startActivity(intent);
    }

    private void openPa() {
        Intent intent = new Intent(this, Pa.class);
        startActivity(intent);
    }

    private void openNa() {
        Intent intent = new Intent(this, Na.class);
        startActivity(intent);
    }

    private void openMa() {
        Intent intent = new Intent(this, Ma.class);
        startActivity(intent);
    }
    private void openLa() {
        Intent intent = new Intent(this, La.class);
        startActivity(intent);
    }

    private void openHa() {
        Intent intent = new Intent(this, Ha.class);
        startActivity(intent);
    }

    private void openGa() {
        Intent intent = new Intent(this, Ga.class);
        startActivity(intent);
    }

    private void openDa() {
        Intent intent = new Intent(this, Da.class);
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