package com.example.ashom_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button a_excbtn;
    private Button a_diarybtn;
    private Button a_boardbtn;
    private Button a_healthbtn;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a_excbtn = findViewById(R.id.a_excbtn);
        a_excbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        a_diarybtn = findViewById(R.id.a_diarybtn);
        a_diarybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity7.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        a_boardbtn = findViewById(R.id.a_boardbtn);
        a_boardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity8.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        a_healthbtn = findViewById(R.id.a_healthbtn);
        a_healthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity9.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_sub1.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_sub2.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_sub4.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity_sub3.class);
                startActivity(intent);  //액티비티 이동
            }
        });


    }
}