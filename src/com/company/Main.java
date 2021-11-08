package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int soma = 0;
        int cont = 0;

        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.add(20);
        lista.add(25);

        while (lista.size() > cont) {
            soma += lista.get(cont);
            cont++;
        }

        System.out.println("A media da lista é: " + soma/5);
    }
}
