package com.gabriel.vetor.exercicios;

import com.gabriel.vetor.Lista;

public class Ex02 {

    public static void main(String[] args) {
        //ArrayList<String> vet = new ArrayList<>();
        Lista<String> vet = new Lista<>();

        vet.adiciona("A"); // 0
        vet.adiciona("B"); // 1
        vet.adiciona("C"); // 2
        vet.adiciona("A"); // 3
        vet.adiciona("B"); // 4
        vet.adiciona("C"); // 5
        vet.adiciona("C"); // 6
        vet.adiciona("C"); // 7
        vet.adiciona("B"); // 8


        System.out.println(vet.lastIndexOf("A"));
    }
}
