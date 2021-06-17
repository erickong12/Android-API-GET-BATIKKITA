package com.example.a1822250025ericagustianwinardi;
//eric agustian winardi 1822250025
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView Id, Name, daerah,makna,tmin,tmax;
    Button btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Id = findViewById(R.id.tId);
        Name = findViewById(R.id.tNama);
        daerah = findViewById(R.id.tDaerah);
        makna = findViewById(R.id.tMakna);
        tmin = findViewById(R.id.tMin);
        tmax = findViewById(R.id.tMax);

        Intent mIntent = getIntent();
        Id.setText(mIntent.getStringExtra("Id"));
        Name.setText(mIntent.getStringExtra("Nama"));
        daerah.setText(mIntent.getStringExtra("Daerah"));
        makna.setText(mIntent.getStringExtra("Makna"));
        tmin.setText(mIntent.getStringExtra("Min"));
        tmax.setText(mIntent.getStringExtra("Max"));
        btBack = findViewById(R.id.btBackGo);
        btBack.setOnClickListener(v -> {
            MainActivity.ma.recreate();
            finish();
        });
    }
}