package com.example.kabaybay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle ;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import kotlin.math.UMathKt;

public class Kasaysayan extends AppCompatActivity {

    RelativeLayout relativeLayout;
    TextView textView;
    SwipeListener swipeListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasaysayan);

        relativeLayout= findViewById(R.id.relative_layout);
        textView = findViewById(R.id.text_view);

        swipeListener = new SwipeListener(relativeLayout);

    }

    private class SwipeListener implements View.OnTouchListener {
        GestureDetector gestureDetector;
        SwipeListener(View view) {
            int threshold = 100;
            int velocity_threshold = 100;

            GestureDetector.SimpleOnGestureListener listener =
                    new GestureDetector.SimpleOnGestureListener() {
                        @Override
                        public boolean onDown(MotionEvent e) {
                            return true;
                        }

                        @Override
                        public boolean onFling(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {
                            float xdiff = e2.getX() - e1.getX();
                            float ydiff = e2.getY() - e1.getY();
                            ;

                            try {
                                if (Math.abs(xdiff) > Math.abs(ydiff)) {
                                    if (Math.abs(xdiff) > threshold && Math.abs(velocityX) > velocity_threshold) {
                                        if (xdiff > 0) {
                                            textView.setText("right");
                                        } else {
                                            textView.setText("left");
                                        }
                                        return true;
                                    }
                                } else {
                                    if (Math.abs(ydiff) > threshold && Math.abs(velocityY) > velocity_threshold) {
                                        if (ydiff > 0) {
                                            textView.setText("down");
                                        } else {
                                            textView.setText("up");
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return false;
                        }
                    };
            gestureDetector = new GestureDetector(listener);
            view.setOnTouchListener(this);
        }
        @Override
        public  boolean onTouch (View view, MotionEvent motionEvent) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
    }
}