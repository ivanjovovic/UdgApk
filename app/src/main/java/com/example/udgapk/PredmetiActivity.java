package com.example.udgapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PredmetiActivity extends AppCompatActivity {
    CardView mikro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predmeti);
        mikro=findViewById(R.id.mikro);
        mikro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PredmetiActivity.this,MikroActivity.class));
            }
        });
    }
}
