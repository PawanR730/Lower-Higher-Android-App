package com.example.pawan.lowerhigher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void toast(String string)
    {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
    int randomnumber;
    public void guess(View view)
    {
        EditText guessEditText=(EditText) findViewById(R.id.guessEditText);
        int guessNumber=Integer.parseInt(guessEditText.getText().toString());

        if(guessNumber > randomnumber)
        {
            toast("Lower");
        }
        else if(guessNumber < randomnumber)
        {
            toast("Higher");
        }
        else
        {
            toast("You got it Correct!!Get Ready for the next Guess!!");
            Random rand=new Random();
            randomnumber=rand.nextInt(20)+1;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        randomnumber=rand.nextInt(20)+1;
    }
}
