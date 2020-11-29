package com.example.sistemadecadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonCadastro;
    private Button buttonConsultar;
    private Button buttonSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCadastro = findViewById(R.id.buttonCadastro);
        buttonConsultar = findViewById(R.id.buttonConsultar);
        buttonSair = findViewById(R.id.buttonSair);

        
    }
}