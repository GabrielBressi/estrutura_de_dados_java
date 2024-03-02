package com.gabriel.pilhas.teste;

import com.gabriel.pilhas.Pilha;

public class Aula15 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.isEmpty());

        pilha.push(1);

        System.out.println(pilha.isEmpty());
    }
}
