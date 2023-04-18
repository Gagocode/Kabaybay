package com.example.kabaybay;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.LinearLayout;

import org.xml.sax.helpers.AttributesImpl;

public class MyKeyboard extends LinearLayout implements View.OnClickListener {

    private Button button1, button2, button3, button4, button5,
            button6, button7, button8, button9, button0, button11,
            button12, button13, button14, button15, button16, button17,
            button18, button19 , button20 ,buttonDelete, buttonspace,
            peroid, pause;

    private SparseArray<String> keyValues = new SparseArray<>();
    private InputConnection inputConnection;

    public MyKeyboard(Context context) {
        this(context, null, 0);
    }
    public MyKeyboard (Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public MyKeyboard(Context context, AttributeSet attrs, int defstyleAttr){
        super(context, attrs, defstyleAttr);
        init(context,attrs);
    }

    private void init (Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.keyboard, this, true);
        button1 = (Button) findViewById(R.id.ka);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.ga);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.nga);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.e);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.ta);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.da);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.na);
        button7.setOnClickListener(this);

        button8 = (Button) findViewById(R.id.pa);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.ba);
        button9.setOnClickListener(this);
        button0 = (Button) findViewById(R.id.ma);
        button0.setOnClickListener(this);
        button11 = (Button) findViewById(R.id.o);
        button11.setOnClickListener(this);
        button12 = (Button) findViewById(R.id.ya);
        button12.setOnClickListener(this);
        button13 = (Button) findViewById(R.id.la);
        button13.setOnClickListener(this);
        button14 = (Button) findViewById(R.id.wa);
        button14.setOnClickListener(this);

        button15 = (Button) findViewById(R.id.a);
        button15.setOnClickListener(this);
        button16 = (Button) findViewById(R.id.i);
        button16.setOnClickListener(this);
        button17 = (Button) findViewById(R.id.u);
        button17.setOnClickListener(this);
        button18 = (Button) findViewById(R.id.silent);
        button18.setOnClickListener(this);
        button19 = (Button) findViewById(R.id.sa);
        button19.setOnClickListener(this);
        button20 = (Button) findViewById(R.id.ha);
        button20.setOnClickListener(this);

        peroid = (Button) findViewById(R.id.period);
        peroid.setOnClickListener(this);
        pause = (Button) findViewById(R.id.pause);
        pause.setOnClickListener(this);

        buttonspace = (Button) findViewById(R.id.space);
        buttonspace.setOnClickListener(this);
        buttonDelete = (Button) findViewById(R.id.delete);
        buttonDelete.setOnClickListener(this);

        keyValues.put(R.id.ka, "ᜃ");
        keyValues.put(R.id.ga, "ᜄ");
        keyValues.put(R.id.nga, "ᜅ");
        keyValues.put(R.id.e, "ᜒ");
        keyValues.put(R.id.ta, "ᜆ");
        keyValues.put(R.id.da, "ᜇ");
        keyValues.put(R.id.na, "ᜈ");

        keyValues.put(R.id.pa, "ᜉ");
        keyValues.put(R.id.ba, "ᜊ");
        keyValues.put(R.id.ma, "ᜋ");
        keyValues.put(R.id.o, "ᜓ");
        keyValues.put(R.id.ya, "ᜌ");
        keyValues.put(R.id.la, "ᜎ");
        keyValues.put(R.id.wa, "ᜏ");

        keyValues.put(R.id.a, "ᜀ");
        keyValues.put(R.id.i, "ᜁ");
        keyValues.put(R.id.u, "ᜂ");
        keyValues.put(R.id.silent, "᜔");
        keyValues.put(R.id.sa, "ᜐ");
        keyValues.put(R.id.ha, "ᜑ");

        keyValues.put(R.id.pause, "|");
        keyValues.put(R.id.period, "||");
        keyValues.put(R.id.space, " ");
    }
    @Override
    public void onClick(View v) {
        if (inputConnection == null){
            return;
        }
        if (v.getId() == R.id.delete) {
            CharSequence selectedText = inputConnection.getSelectedText(0);

            if (TextUtils.isEmpty(selectedText)){
                inputConnection.deleteSurroundingText(1,0);
            } else {
                inputConnection.commitText("", 1);
            }
        } else {
            String value = keyValues.get(v.getId());
            inputConnection.commitText(value, 1);
        }
    }
    public void setInputConnection(InputConnection ic) {
        inputConnection = ic;
    }
}
