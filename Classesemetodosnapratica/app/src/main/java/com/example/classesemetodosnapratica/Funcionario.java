package com.example.classesemetodosnapratica;

class Funcionario {

    String nome;
    double salario;

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    void recuperarSalario(){
        System.out.println(this.salario);
    }

    void recuperarNome(){
        System.out.println(this.nome);
    }

    double recuperaSalarioNovo(double descontoPrevidencia, double descontoPlanoSaude){
        return this.salario - descontoPrevidencia - descontoPlanoSaude;
    }


}
