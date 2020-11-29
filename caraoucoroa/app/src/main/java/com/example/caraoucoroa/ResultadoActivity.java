package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private Button buttonVoltar;
    private ImageView imageViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);
        imageViewResultado = findViewById(R.id.imageViewResultado);


                //recuperar dados
                Bundle bundle = getIntent().getExtras();
                int numero = bundle.getInt("numeroAleatorio");

                if(numero == 0){
                    imageViewResultado.setImageResource(R.drawable.moeda_cara);
                }else{
                    imageViewResultado.setImageResource(R.drawable.moeda_coroa);
                }

                buttonVoltar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
            }
    }