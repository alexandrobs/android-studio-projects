 package com.example.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.classesemetodosnapratica.classes.Animal;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Animal animal = new Animal();
    System.out.println(animal);


//    Conta conta = new Conta();
//    conta.setNumeroConta(123456);
//    conta.setSaldo(1000);
//    conta.depositar(100);
//    System.out.println("Número da conta: " + conta.getNumeroConta() +"\n"
//            + "Saldo da conta: " + conta.getSaldo());
//    conta.sacar(200);
//    System.out.println("Saldo da conta: " + conta.getSaldo());

//        Cao cao = new Cao();
//        cao.setCor("preto e branco");
//        cao.correr();

        // A diferença entre meu getCor e o outro que aprendi
        //é que o outro eu vou ter que criar aqui no main um sysout
        //pra exibir o valor da propriedade, o meu já mandava imprimir na tela direto
//        System.out.println(cao.getCor());
//        cao.latir();
//        cao.correr();
//        cao.dormir();
//
//         Passaro passaro = new Passaro();
//         passaro.correr();
//         passaro.dormir();
//         passaro.voar();
//
//        Animal animal = new Animal();
//        animal.correr();
//        animal.dormir();


//        Casa casinha = new Casa();
//        casinha.cor = "Vermelha";
//        casinha.abrirPorta();
//        System.out.println(casinha.cor);

      /*  Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Joãozinho";
        funcionario1.salario = 900;

        //System.out.println(funcionario1.getNome() + "\n" +funcionario1.getSalario());

//        funcionario1.recuperarNome();
//        funcionario1.recuperarSalario();

        double salarioRecuperado = funcionario1.recuperaSalarioNovo(100,250);
        System.out.println(salarioRecuperado);*/
    }
}