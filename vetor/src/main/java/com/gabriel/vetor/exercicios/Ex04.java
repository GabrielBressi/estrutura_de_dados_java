package com.gabriel.vetor.exercicios;

import com.gabriel.vetor.Lista;


public class Ex04 {

    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>();

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor.get(4));


    }

}
