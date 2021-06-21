package com.example.higherorlowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

        int randomNum;


    public void click(View view){
        int k;

        EditText editTextGuess=findViewById(R.id.editTextGuess);

        k= Integer.parseInt(editTextGuess.toString());

      // nextInt as provided by Random is exclusive of the top value so you need to add 1
        String message;


        if(k>randomNum){
            message="lower";
        }
        else if (k<randomNum){
            message="higher";
        }
        else
        {
            message="got it";generateRandNumber();
        }

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
         randomNum = rand.nextInt( 20) + 1;

    }
}