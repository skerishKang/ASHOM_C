package com.example.ashom_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    private Button b_b_home;
    private Button b_b_diarybtn;
    private Button b_b_boardbtn;
    private Button b_b_healthbtn;
    private Button b_exc_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        b_b_home = findViewById(R.id.b_b_home);
        b_b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        b_b_diarybtn = findViewById(R.id.b_b_diarybtn);
        b_b_diarybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this,MainActivity7.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        b_b_boardbtn = findViewById(R.id.b_b_boardbtn);
        b_b_boardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this,MainActivity8.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        b_b_healthbtn = findViewById(R.id.b_b_healthbtn);
        b_b_healthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this,MainActivity9.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        b_exc_btn = findViewById(R.id.b_exc_btn);
        b_exc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this,MainActivity2.class);
                startActivity(intent);  //액티비티 이동
            }
        });
    }
}