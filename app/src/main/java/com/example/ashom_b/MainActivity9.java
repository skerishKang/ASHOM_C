package com.example.ashom_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    private Button q_b_home;
    private Button q_b_diarybtn;
    private Button q_b_boardbtn;
    private Button q_b_healthbtn;
    private Button q_exc_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        q_b_home = findViewById(R.id.q_b_home);
        q_b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this,MainActivity.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        q_b_diarybtn = findViewById(R.id.q_b_diarybtn);
        q_b_diarybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this,MainActivity7.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        q_b_boardbtn = findViewById(R.id.q_b_boardbtn);
        q_b_boardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this,MainActivity8.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        q_b_healthbtn = findViewById(R.id.q_b_healthbtn);
        q_b_healthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this,MainActivity9.class);
                startActivity(intent);  //액티비티 이동
            }
        });

        q_exc_btn = findViewById(R.id.q_exc_btn);
        q_exc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this,MainActivity2.class);
                startActivity(intent);  //액티비티 이동
            }
        });
    }
}