package com.example.ashom_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    private Button d_b_home;
    private Button d_b_diarybtn;
    private Button d_b_boardbtn;
    private Button d_b_healthbtn;
    private Button d_exc_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        d_b_home = findViewById(R.id.d_b_home);
        d_b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        d_b_diarybtn = findViewById(R.id.d_b_diarybtn);
        d_b_diarybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this,MainActivity7.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        d_b_boardbtn = findViewById(R.id.d_b_boardbtn);
        d_b_boardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this,MainActivity8.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        d_b_healthbtn = findViewById(R.id.d_b_healthbtn);
        d_b_healthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this,MainActivity9.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        d_exc_btn = findViewById(R.id.d_exc_btn);
        d_exc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this,MainActivity2.class);
                startActivity(intent);  //액티비티 이동
            }
        });

    }
}