package com.example.udgapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView predmeti;
    CardView kviz;
    CardView caskanje;
    CardView onama;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        predmeti=findViewById(R.id.predmeti);
        kviz=findViewById(R.id.kviz);
        caskanje=findViewById(R.id.caskanje);
        onama=findViewById(R.id.onama);

        predmeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,PredmetiActivity.class));
            }
        });
        kviz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,KvizActivity.class));
            }
        });
        caskanje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CaskanjeActivity.class));
            }
        });
        onama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OnamaActivity.class));
            }
        });
    }
}
