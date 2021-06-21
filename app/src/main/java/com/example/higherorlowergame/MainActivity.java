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
        public void generateRandomNumber(){

            Random rand = new Random();
            randomNum = rand.nextInt( 20) + 1;

        }


    public void click(View view){


        EditText editTextGuess=findViewById(R.id.editTextGuess);
        int guessValue=Integer.parseInt(editTextGuess.getText().toString());
        String message;

        if( guessValue > randomNum){
            message="Go Lower!!";
        }
        else if (guessValue < randomNum){
            message = "Go Higher";
        }
        else {
            message = "Correct !!!";

            generateRandomNumber();
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

        Log.i("entered no",editTextGuess.getText().toString());
        Log.i("rand no", String.valueOf(randomNum));



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
         randomNum = rand.nextInt( 20) + 1;

    }
}