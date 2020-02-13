package com.google.distlergrace.fortuneteller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    //Program Constants
    final int       MINNUMBER   = 1;
    final int       MAXNUMBER   = 12;
    final String[]  fortunes    =
    {
            "A friend asks only for your time not your money",
            "If you refuse to accept anything but the best, you very often get it",
            "Hard work pays off in the future, laziness pays off now",
            "Change can hurt, but it leads a path to something better",
            "You learn from your mistakes... You will learn a lot today",
            "A dream you have will come true",
            "You will become great if you believe in yourself",
            "You already know the answer to the questions lingering inside your head",
            "You can make your own happiness",
            "The greatest risk is not taking one",
            "You are very talented in many ways",
            "A stranger, is a friend you have not spoken to yet",
    };

    //Program Widget Variables
    Button  buttonRevealFortune;

    //Program Non-Widget Variables
    int     randomNumber;
    String  fortune;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Widget References
        buttonRevealFortune = (Button) findViewById(R.id.buttonRevealFortune);

        buttonRevealFortune.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                revealFortune();

                //Create A Bundle Object
                Bundle extras = new Bundle();

                //Add 'fortune' To Bundle
                extras.putString("fortune", fortune);

                //Create & Initialize Intent
                Intent intent =  new Intent(getApplicationContext(), FortuneActivity.class);

                //Attach Bundle To Intent
                intent.putExtras(extras);

                //Start The Activity
                startActivity(intent);
            }
        });
    }

    private void revealFortune()
    {
        //String[] randomString = new String[1];

        Random rand = new Random();
        randomNumber = rand.nextInt((MAXNUMBER - MINNUMBER) + 1) + MINNUMBER;

        if (randomNumber == 1)
        {
            fortune = fortunes[1];
        }
        else if (randomNumber == 2)
        {
            fortune = fortunes[2];
        }
        else if (randomNumber == 3)
        {
            fortune = fortunes[3];
        }
        else if (randomNumber == 4)
        {
            fortune = fortunes[4];
        }
        else if (randomNumber == 5)
        {
            fortune = fortunes[5];
        }
        else if (randomNumber == 6)
        {
            fortune = fortunes[6];
        }
        else if (randomNumber == 7)
        {
            fortune = fortunes[7];
        }
        else if (randomNumber == 8)
        {
            fortune = fortunes[8];
        }
        else if (randomNumber == 9)
        {
            fortune = fortunes[9];
        }
        else if (randomNumber == 10)
        {
            fortune = fortunes[10];
        }
        else if (randomNumber == 11)
        {
            fortune = fortunes[11];
        }
        else if (randomNumber == 12)
        {
            fortune = fortunes[12];
        }
    }
}
