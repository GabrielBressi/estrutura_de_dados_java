package com.gabriel.vetor.exercicios;

import com.gabriel.vetor.Lista;

public class Ex05 {

    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>();

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor);
        System.out.println(vetor.tamanho());
        vetor.clear();
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

    }
}
