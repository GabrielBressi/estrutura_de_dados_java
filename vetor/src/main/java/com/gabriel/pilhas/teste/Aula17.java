package com.gabriel.pilhas.teste;

import com.gabriel.pilhas.Pilha;

public class Aula17 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println(pilha.top());
        System.out.println(pilha);

        pilha.pop();
        System.out.println(pilha.top());
        System.out.println(pilha);
    }
}
