package com.example.camerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);
        Intent intent = getIntent();
        Bundle data = intent.getExtras();
        String val =  (String) data.get("data");
        TextView tx = findViewById(R.id.textView);
        tx.setText(val);
    }
}
