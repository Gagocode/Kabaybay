package com.example.kabaybay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;

public class Sulat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulat);

        EditText editText = (EditText) findViewById(R.id.editText);
        MyKeyboard keyboard = (MyKeyboard) findViewById(R.id.keyboard);

        editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
        editText.setTextIsSelectable(true);
        editText.setShowSoftInputOnFocus(false);

        InputConnection ic = editText.onCreateInputConnection(new EditorInfo());
        keyboard.setInputConnection(ic);

    }
}