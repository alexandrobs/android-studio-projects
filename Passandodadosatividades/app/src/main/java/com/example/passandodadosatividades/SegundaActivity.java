package com.example.passandodadosatividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textViewNome;
    private TextView textViewIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewNome = findViewById(R.id.textViewNome);
        textViewIdade = findViewById(R.id.textViewIdade);

        //Recuperar os dados enviados
        Bundle bundle = getIntent().getExtras();
        String nome = bundle.getString("nome");
        int idade = bundle.getInt("idade");
        Usuario usuario = (Usuario) bundle.getSerializable("objeto");


        //Configurar valores recuperados
        //textViewNome.setText(nome);
        textViewNome.setText(usuario.getEmail());
        //textViewNome.setText(usuario.getNome());
        textViewIdade.setText(String.valueOf(idade));

    }
}