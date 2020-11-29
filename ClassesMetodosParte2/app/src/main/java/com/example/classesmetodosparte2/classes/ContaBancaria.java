package com.example.classesmetodosparte2.classes;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        System.out.println("Número da Conta: " + numeroConta + " Saldo: " + saldo);
    }

    public ContaBancaria(){
        System.out.println("construtor sem parâmetros");
    }

    public ContaBancaria(int numeroC, double sd, String nomeB){
        System.out.println("Número da Conta: " + numeroC + " Saldo: " + sd + "Nome do Banco: " + nomeB);
    }



}
