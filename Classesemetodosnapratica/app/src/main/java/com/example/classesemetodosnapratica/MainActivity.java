package com.example.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Casa casinha = new Casa();
//        casinha.cor = "Vermelha";
//        casinha.abrirPorta();
//        System.out.println(casinha.cor);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Joãozinho";
        funcionario1.salario = 900;

        //System.out.println(funcionario1.getNome() + "\n" +funcionario1.getSalario());

//        funcionario1.recuperarNome();
//        funcionario1.recuperarSalario();

        double salarioRecuperado = funcionario1.recuperaSalarioNovo(100,250);
        System.out.println(salarioRecuperado);
    }
}