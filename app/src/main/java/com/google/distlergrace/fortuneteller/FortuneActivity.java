package com.google.distlergrace.fortuneteller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FortuneActivity extends AppCompatActivity
{
    TextView    textViewRevealedFortune;
    Button      buttonReturnHome;
    String      fortune;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune);

        textViewRevealedFortune = findViewById(R.id.textViewRevealedFortune);
        buttonReturnHome        = findViewById(R.id.buttonReturnHome);

        //Get The Intent In The Target Activity
        Intent intent = getIntent();

        //Get The Attached Bundle From The Intent
        Bundle extras = intent.getExtras();

        //Extract The Stored Data From The Bundle
        if (extras!= null)
        {
            if (extras.containsKey("fortune"))
            {
                fortune = extras.getString("fortune", "");
            }
            textViewRevealedFortune.setText(fortune);
        }

        buttonReturnHome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
    }
}
