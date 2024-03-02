package com.gabriel.vetor.exercicios;

import com.gabriel.vetor.Lista;

import java.util.ArrayList;

public class Ex03 {

    public static void main(String[] args) {

        Lista<String> vetor = new Lista<>();
        ArrayList<String> vet = new ArrayList<>();

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor);
        vetor.remove("D");
        vetor.remove("E");
        vetor.remove("C");
        System.out.println(vetor);
        System.out.println(vetor.tamanho());
        System.out.println("-------------");

        vet.add("A");
        vet.add("C");
        vet.add("D");
        vet.add("E");
        System.out.println(vet);
        vet.remove("D");
        System.out.println(vet);
        System.out.println(vet.size());




    }

}
