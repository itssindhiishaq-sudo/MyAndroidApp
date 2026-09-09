package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Hello World!\nMy first GitHub APK");
        text.setTextSize(24);
        text.setGravity(17);

        setContentView(text);
    }
}
