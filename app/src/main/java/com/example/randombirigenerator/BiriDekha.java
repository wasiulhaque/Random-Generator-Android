package com.example.randombirigenerator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BiriDekha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biri_dekha);
        //String[] string = getResources().getStringArray(R.array.biri);
        String[] string = getResources().getStringArray(R.array.biri);
        int i = (int) (6.0 * Math.random());
        String s = string[i];
        TextView text;
        text = findViewById(R.id.biriname);
        text.setText(s);
    }
}
