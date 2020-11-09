package com.example.classesemetodosnapratica;

public class Conta {
    protected int numeroConta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDoDeposito){
        this.saldo = this.saldo + valorDoDeposito;
    }

    public void sacar(double valorDoSaque){
        this.saldo = this.saldo - valorDoSaque;
    }


}
