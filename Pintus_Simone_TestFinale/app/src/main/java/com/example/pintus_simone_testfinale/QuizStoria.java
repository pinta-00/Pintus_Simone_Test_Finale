package com.example.pintus_simone_testfinale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizStoria extends AppCompatActivity {
    int giusto=0 , totale=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_storia);

        TextView txt_primadomanda = (TextView) findViewById(R.id.txt_primadomanda);
        Button btn_vero1 = (Button) findViewById(R.id.btn_vero1);
        Button btn_falso1 = (Button) findViewById(R.id.btn_falso1);

        TextView txt_secondadomanda = (TextView) findViewById(R.id.txt_secondadomanda);
        Button btn_vero2 = (Button) findViewById(R.id.btn_vero2);
        Button btn_falso2 = (Button) findViewById(R.id.btn_falso2);

        TextView txt_terzadomanda = (TextView) findViewById(R.id.txt_terzadomanda);
        Button btn_vero3 = (Button) findViewById(R.id.btn_vero3);
        Button btn_falso3 = (Button) findViewById(R.id.btn_falso3);

        TextView txt_quartadomanda = (TextView) findViewById(R.id.txt_quartadomanda);
        Button btn_vero4 = (Button) findViewById(R.id.btn_vero4);
        Button btn_falso4 = (Button) findViewById(R.id.btn_falso4);

        TextView txt_quintadomanda = (TextView) findViewById(R.id.txt_quintadomanda);
        Button btn_vero5 = (Button) findViewById(R.id.btn_vero5);
        Button btn_falso5 = (Button) findViewById(R.id.btn_falso5);

        Button btn_inizia = (Button) findViewById(R.id.btn_inizia);
        Button btn_risultato = (Button) findViewById(R.id.btn_risultato);
        Button btn_rifai = (Button) findViewById(R.id.btn_rifai);

        TextView txt_risultato = (TextView) findViewById(R.id.txt_risultato);

        findViewById(R.id.btn_indietro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(getApplicationContext(), MainActivity.class);
                y.putExtra("storia", txt_risultato.getText().toString());
                startActivity(y);
            }
        });
        btn_inizia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               btn_inizia.setVisibility(View.INVISIBLE);

                txt_primadomanda.setVisibility(View.VISIBLE);
                btn_vero1.setVisibility(View.VISIBLE);
                btn_falso1.setVisibility(View.VISIBLE);

                txt_secondadomanda.setVisibility(View.VISIBLE);
                btn_vero2.setVisibility(View.VISIBLE);
                btn_falso2.setVisibility(View.VISIBLE);

                txt_terzadomanda.setVisibility(View.VISIBLE);
                btn_vero3.setVisibility(View.VISIBLE);
                btn_falso3.setVisibility(View.VISIBLE);

                txt_quartadomanda.setVisibility(View.VISIBLE);
                btn_vero4.setVisibility(View.VISIBLE);
                btn_falso4.setVisibility(View.VISIBLE);

                txt_quintadomanda.setVisibility(View.VISIBLE);
                btn_vero5.setVisibility(View.VISIBLE);
                btn_falso5.setVisibility(View.VISIBLE);
            }
        });
        btn_vero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giusto++;
                totale++;
                txt_primadomanda.setVisibility(View.INVISIBLE);
                btn_vero1.setVisibility(View.INVISIBLE);
                btn_falso1.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_falso1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totale++;
                txt_primadomanda.setVisibility(View.INVISIBLE);
                btn_vero1.setVisibility(View.INVISIBLE);
                btn_falso1.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_vero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totale++;
                txt_secondadomanda.setVisibility(View.INVISIBLE);
                btn_vero2.setVisibility(View.INVISIBLE);
                btn_falso2.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_falso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totale++;
                giusto++;
                txt_secondadomanda.setVisibility(View.INVISIBLE);
                btn_vero2.setVisibility(View.INVISIBLE);
                btn_falso2.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_vero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totale++;
                txt_terzadomanda.setVisibility(View.INVISIBLE);
                btn_vero3.setVisibility(View.INVISIBLE);
                btn_falso3.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_falso3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totale++;
                giusto++;
                txt_terzadomanda.setVisibility(View.INVISIBLE);
                btn_vero3.setVisibility(View.INVISIBLE);
                btn_falso3.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_vero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giusto++;
                totale++;
                txt_quartadomanda.setVisibility(View.INVISIBLE);
                btn_vero4.setVisibility(View.INVISIBLE);
                btn_falso4.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_falso4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totale++;
                txt_quartadomanda.setVisibility(View.INVISIBLE);
                btn_vero4.setVisibility(View.INVISIBLE);
                btn_falso4.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_vero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giusto++;
                totale++;
                txt_quintadomanda.setVisibility(View.INVISIBLE);
                btn_vero5.setVisibility(View.INVISIBLE);
                btn_falso5.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_falso5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totale++;
                txt_quintadomanda.setVisibility(View.INVISIBLE);
                btn_vero5.setVisibility(View.INVISIBLE);
                btn_falso5.setVisibility(View.INVISIBLE);
                //txt_risultato.setText("RISULTATO :" + giusto + "/" +totale);
                if (totale == 5) {
                    btn_risultato.setVisibility(View.VISIBLE);
                    btn_rifai.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_risultato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_risultato.setVisibility(View.VISIBLE);
                btn_risultato.setVisibility(View.INVISIBLE);

                if (giusto == 0) {
                    txt_risultato.setText("STAI SCHIACCIANDO A CASO? IL TUO RISULTATO  :" + giusto + "/" + totale);
                }
                if (giusto == 1) {
                    txt_risultato.setText("MEGLIO CHE NIENTE..., IL TUO RISULTATO  :" + giusto + "/" + totale);
                }
                if (giusto == 2) {
                    txt_risultato.setText("NON MALE MA ... SEI ANCORA INSUFFICIENTE, IL TUO RISULTATO  :" + giusto + "/" + totale);
                }
                if (giusto == 3) {
                    txt_risultato.setText("CON UN PO PIU DI IMPEGNO ERA OTTIMO, IL TUO RISULTATO  :" + giusto + "/" + totale);
                }
                if (giusto == 4) {
                    txt_risultato.setText("PER UN SOFFIO ,IL TUO RISULTATO  :" + giusto + "/" + totale);
                }
                if (giusto == 5) {
                    txt_risultato.setText("SEI UN CAMPIONE ,IL TUO RISULTATO  :" + giusto + "/" + totale);
                }
            }
        });
        btn_rifai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giusto = 0;
                totale = 0;
                txt_primadomanda.setVisibility(View.VISIBLE);
                btn_vero1.setVisibility(View.VISIBLE);
                btn_falso1.setVisibility(View.VISIBLE);

                txt_secondadomanda.setVisibility(View.VISIBLE);
                btn_vero2.setVisibility(View.VISIBLE);
                btn_falso2.setVisibility(View.VISIBLE);

                txt_terzadomanda.setVisibility(View.VISIBLE);
                btn_vero3.setVisibility(View.VISIBLE);
                btn_falso3.setVisibility(View.VISIBLE);

                txt_quartadomanda.setVisibility(View.VISIBLE);
                btn_vero4.setVisibility(View.VISIBLE);
                btn_falso4.setVisibility(View.VISIBLE);

                txt_quintadomanda.setVisibility(View.VISIBLE);
                btn_vero5.setVisibility(View.VISIBLE);
                btn_falso5.setVisibility(View.VISIBLE);

                txt_risultato.setVisibility(View.INVISIBLE);
                btn_rifai.setVisibility(View.INVISIBLE);
                btn_risultato.setVisibility(View.INVISIBLE);
            }
        });

    }
}
