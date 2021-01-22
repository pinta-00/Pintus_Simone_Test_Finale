package com.example.pintus_simone_testfinale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String ris_storia = getIntent().getStringExtra("storia");
        TextView txt_storia =(TextView)findViewById(R.id.txt_storia);
        txt_storia.setVisibility(View.VISIBLE);
        if (ris_storia== null){
            txt_storia.setText("");
        }else{
            txt_storia.setText("Ultimo test eseguito storia :"+String.valueOf(ris_storia));
        }

        String ris_geo = getIntent().getStringExtra("geografia");
        TextView txt_geografia =(TextView)findViewById(R.id.txt_geografia);
        txt_geografia.setVisibility(View.VISIBLE);
        if (ris_geo== null){
            txt_geografia.setText("");
        }else{
            txt_geografia.setText("Ultimo test eseguito geografia :"+String.valueOf(ris_geo));
        }

        String ris_let = getIntent().getStringExtra("letteratura");
        TextView txt_letteratura =(TextView)findViewById(R.id.txt_letteratura);
        txt_letteratura.setVisibility(View.VISIBLE);
        if (ris_let== null){
            txt_letteratura.setText("");
        }else{
            txt_letteratura.setText("Ultimo test eseguito letteratura :"+String.valueOf(ris_let));
        }

        String ris_sport = getIntent().getStringExtra("sport");
        TextView txt_sport =(TextView)findViewById(R.id.txt_sport);
        txt_sport.setVisibility(View.VISIBLE);
        if (ris_sport== null){
            txt_sport.setText("");
        }else{
            txt_sport.setText("Ultimo test eseguito sport  :"+String.valueOf(ris_sport));
        }

        String ris_spet = getIntent().getStringExtra("spettacolo");
        TextView txt_spettacolo =(TextView)findViewById(R.id.txt_spettacolo);
        txt_spettacolo.setVisibility(View.VISIBLE);
        if (ris_spet== null){
            txt_spettacolo.setText("");
        }else{
            txt_spettacolo.setText("Ultimo test eseguito spettacolo  :"+String.valueOf(ris_spet));
        }

        String ris_animali = getIntent().getStringExtra("animali");
        TextView txt_animali =(TextView)findViewById(R.id.txt_animali);
        txt_animali.setVisibility(View.VISIBLE);
        if (ris_animali== null){
            txt_animali.setText("");
        }else{
            txt_animali.setText("Ultimo test eseguito animali  :"+String.valueOf(ris_animali));
        }

        findViewById(R.id.btn_storia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), QuizStoria.class);
                startActivity(a);
            }
        });
        findViewById(R.id.btn_geografia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(), QuizGeografia.class);
                startActivity(b);
            }
        });
        findViewById(R.id.btn_letteratura).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(), QuizLetteratura.class);
                startActivity(c);
            }
        });

        findViewById(R.id.btn_sport).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getApplicationContext(), QuizSport.class);
                startActivity(d);
            }
        });

        findViewById(R.id.btn_spettacolo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(getApplicationContext(), QuizSpettacolo.class);
                startActivity(e);
            }
        });

        findViewById(R.id.btn_animali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(getApplicationContext(), QuizAnimali.class);
                startActivity(f);
            }
        });
    }
}