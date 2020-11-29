package com.example.classesmetodosparte2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.classesmetodosparte2.classes.ContaBancaria;
import com.example.classesmetodosparte2.classes.Jamilton;
import com.example.classesmetodosparte2.classes.Obama;
import com.example.classesmetodosparte2.classes.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sobrecarga de método
//        Pessoa pessoa = new Pessoa();
//        pessoa.exibirNome("Sofia");
//        pessoa.exibirNome("Auri " + 49);

        //construtores
//        ContaBancaria contaBancaria = new ContaBancaria(123456, 50000);
//        ContaBancaria cb = new ContaBancaria();
//        ContaBancaria cb2 = new ContaBancaria(12345687, 55000, "Itaú");
        Jamilton jamilton = new Jamilton();
        jamilton.direitosDeveres();
        jamilton.ganharEleicao();

        Obama obama = new Obama();
        obama.direitosDeveres();
        obama.ganharEleicao();
    }
}