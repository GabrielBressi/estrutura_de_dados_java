package com.gabriel.vetor.teste;


import com.gabriel.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        vetor.remove(1);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        vetor.remove(3);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        vetor.adiciona("K");
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

    }
}
