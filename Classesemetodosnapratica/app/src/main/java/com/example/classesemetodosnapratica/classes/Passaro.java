package com.example.classesemetodosnapratica.classes;

class Passaro extends Animal{

    void voar(){
        System.out.println("Voar como uma passáro");
    }

    void correr(){
        super.correr();
        System.out.println("passáro");
    }
}
