package com.demo.cletyrivera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imgOne = findViewById(R.id.burj);
        imgOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, burj.class);
                startActivity(i);
            }
        });

        ImageView imgTwo = findViewById(R.id.park);
        imgTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, park.class);
                startActivity(i);
            }
        });

        ImageView imgThree = findViewById(R.id.tower);
        imgThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, tower.class);
                startActivity(i);
            }
        });

        ImageView imgFour = findViewById(R.id.falls);
        imgFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, falls.class);
                startActivity(i);
            }
        });
    }
}