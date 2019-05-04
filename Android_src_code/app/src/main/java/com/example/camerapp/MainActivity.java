package com.example.camerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView ivImage;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImage = (ImageView) findViewById(R.id.ivImage);
        button1 =(Button) findViewById(R.id.btnsaveyourplanet);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startsaveplanet();
            }
        });
    }
    public void startsaveplanet()
    {
        Intent intent= new Intent(this, Activity2.class);
        startActivity(intent);
    }


}