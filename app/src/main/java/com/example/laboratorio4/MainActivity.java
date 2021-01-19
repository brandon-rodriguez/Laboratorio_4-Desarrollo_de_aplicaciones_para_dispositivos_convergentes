package com.example.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1= (Button) findViewById(R.id.btn_1);
        Button btn2= (Button) findViewById(R.id.btn_2);
        Button btn3= (Button) findViewById(R.id.btn_3);
        Button btn4= (Button) findViewById(R.id.btn_4);
        Button btn5= (Button) findViewById(R.id.btn_5);
        Button btn6= (Button) findViewById(R.id.btn_6);
        Button btn7= (Button) findViewById(R.id.btn_7);
        Button btn8= (Button) findViewById(R.id.btn_8);
        Button btn9= (Button) findViewById(R.id.btn_9);
        Button btn10= (Button) findViewById(R.id.bnt_10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e1.class);
                startActivity(nuevaActividad);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e2.class);
                startActivity(nuevaActividad);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e3.class);
                startActivity(nuevaActividad);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e4.class);
                startActivity(nuevaActividad);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e5.class);
                startActivity(nuevaActividad);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e6.class);
                startActivity(nuevaActividad);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e7.class);
                startActivity(nuevaActividad);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e8.class);
                startActivity(nuevaActividad);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e9.class);
                startActivity(nuevaActividad);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nuevaActividad = new Intent(MainActivity.this, e10.class);
                startActivity(nuevaActividad);
            }
        });




    }
}