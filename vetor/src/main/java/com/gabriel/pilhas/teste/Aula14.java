package com.gabriel.pilhas.teste;

import com.gabriel.pilhas.Pilha;

public class Aula14 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 10; i++) {
            pilha.push(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

    }
}
