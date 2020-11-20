package com.example.ashom_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button b_home;
    private Button b_diarybtn;
    private Button b_boardbtn;
    private Button b_healthbtn;
    private Button sqt_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        b_diarybtn = findViewById(R.id.b_diarybtn);
        b_diarybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity7.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        b_boardbtn = findViewById(R.id.b_boardbtn);
        b_boardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity8.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        b_healthbtn = findViewById(R.id.b_healthbtn);
        b_healthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity9.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        sqt_btn = findViewById(R.id.sqt_btn);
        sqt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        b_home = findViewById(R.id.b_home);
        b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

    }
}