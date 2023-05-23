package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class baybay extends AppCompatActivity {

    private Button btn, btn2, btn3, ga, ha, la, ma, na
            , pa, sa, ta, wa, ya, nga ;
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
        ga = (Button) findViewById(R.id.ga);
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGa();
            }
        });
        ha = (Button) findViewById(R.id.ha);
        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHa();
            }
        });
        la = (Button) findViewById(R.id.la);
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLa();
            }
        });
        ma = (Button) findViewById(R.id.ma);
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMa();
            }
        });
        na = (Button) findViewById(R.id.na);
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNa();
            }
        });
        pa = (Button) findViewById(R.id.pa);
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPa();
            }
        });
        sa = (Button) findViewById(R.id.sa);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSa();
            }
        });
        ta = (Button) findViewById(R.id.ta);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTa();
            }
        });
        wa = (Button) findViewById(R.id.wa);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWa();
            }
        });
        ya = (Button) findViewById(R.id.ya);
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYa();
            }
        });
    }

    private void openYa() {
        Intent intent = new Intent(this, ya_baybay.class);
        startActivity(intent);
    }

    private void openWa() {
        Intent intent = new Intent(this, wa_baybay.class);
        startActivity(intent);
    }

    private void openTa() {
        Intent intent = new Intent(this, ta_baybay.class);
        startActivity(intent);
    }

    private void openSa() {
        Intent intent = new Intent(this, sa_baybay.class);
        startActivity(intent);
    }

    private void openPa() {
        Intent intent = new Intent(this, pa_baybay.class);
        startActivity(intent);
    }

    private void openNa() {
        Intent intent = new Intent(this, na_baybay.class);
        startActivity(intent);
    }

    private void openLa() {
        Intent intent = new Intent(this, la_baybay.class);
        startActivity(intent);
    }

    private void openHa() {
        Intent intent = new Intent(this, ha_baybay.class);
        startActivity(intent);
    }

    private void openGa() {
        Intent intent = new Intent(this, ga_baybay.class);
        startActivity(intent);
    }

    private void openMa() {
        Intent intent = new Intent(this, ma_baybay.class);
        startActivity(intent);
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