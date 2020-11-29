package com.example.passandodadosatividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);


        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Intanciar um objeto da classe Usuario
                Usuario usuario = new Usuario("Alexandro", "jornalsinal@gmail.com");


                //passar dados de uma activity pra outra
                intent.putExtra("nome", "Sofia Lopes da Silva");
                intent.putExtra("idade", 9);
                intent.putExtra("objeto", usuario);
                startActivity(intent);

            }
        });
    }
}