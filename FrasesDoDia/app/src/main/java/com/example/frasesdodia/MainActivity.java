package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String frases[] = {
                "Oi amor, te amo.",
                "Estou com fome.",
                "Não quero brincar.",
                "Esta com sono? Vá dormir."
        };

        int numero = new Random().nextInt(4);
        TextView texto = findViewById(R.id.exibeFraseDoDia);
        texto.setText(frases[numero]);
    }
}

