package com.example.classesmetodosparte2.classes;

import com.example.classesmetodosparte2.Presidente;

public class Obama extends Cidadao implements Presidente {

    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar eleição nos EUA");
    }
}
