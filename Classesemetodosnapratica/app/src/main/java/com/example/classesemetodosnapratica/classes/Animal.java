package com.example.classesemetodosnapratica.classes;

public class Animal {
    protected int tamanho;
    protected String cor;
    protected double peso;

    //getters e setters

    public int getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    //como aprendi a fazer
    public String getCor(){
        return this.cor;
    }

    //como eu fiz
//    void getCor(){
//        this.cor = cor;
//        System.out.println(cor);
//    }


    void dormir(){
        System.out.println("Dormir como um animal");
    }

    void correr(){
        System.out.print("Correr como um ");
    }
}
