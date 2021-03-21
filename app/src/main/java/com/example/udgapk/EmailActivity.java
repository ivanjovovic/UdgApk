package com.example.udgapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmailActivity extends AppCompatActivity {

    EditText mprimalac,mtema,mporuka;
    Button posalji;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        mprimalac=findViewById(R.id.primalac);
        mtema=findViewById(R.id.tema);
        mporuka=findViewById(R.id.poruka);
        posalji=findViewById(R.id.salji);

        posalji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primalac=mprimalac.getText().toString().trim();
                String tema= mtema.getText().toString().trim();
                String poruka=mporuka.getText().toString().trim();
                posaljimejl(primalac,tema,poruka);

            }
        });


    }

    private void posaljimejl(String primalac, String tema, String poruka) {
        Intent mEmailIntent=new Intent(Intent.ACTION_SEND);
        mEmailIntent.setData(Uri.parse("mailto:"));
        mEmailIntent.setType("text/plain");
        mEmailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{primalac});
        mEmailIntent.putExtra(Intent.EXTRA_SUBJECT,tema);
        mEmailIntent.putExtra(Intent.EXTRA_TEXT,poruka);
        try {
            startActivity(Intent.createChooser(mEmailIntent,"Izaberi email klijenta"));

        }
        catch (Exception e) {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();

        }

    }
}
