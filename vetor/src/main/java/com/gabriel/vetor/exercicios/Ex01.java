package com.gabriel.vetor.exercicios;

import com.gabriel.vetor.Lista;

public class Ex01 {

    public static void main(String[] args) {

        Lista<String> vetor = new Lista<>();

        vetor.adiciona("A");
        vetor.adiciona("B");

        System.out.println(vetor.contem("A"));

        System.out.println(vetor.contains("B"));

    }
}
