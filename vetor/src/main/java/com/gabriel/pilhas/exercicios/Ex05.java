package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pilha<Character> pilha1 = new Pilha<>();
        Pilha<Character> pilha2 = new Pilha<>();

        System.out.print("Digite uma palavra: ");
        String word = scan.next().toUpperCase();

        /**
         * Empilha os caracteres da palavra digitada na pilha1
         **/
        for (char character: word.toCharArray()) {
            pilha1.push(character);
        }
        System.out.println(pilha1);

        if (pilha1.tamanho() % 2 == 0) {
            for (int i = 0; i <= (pilha1.tamanho() + 1) / 2; i++) {
                pilha2.push(pilha1.top());
                pilha1.pop();
            }
        } else {
            for (int i = 0; i <= (pilha1.tamanho() + 1) / 2; i++) {
                pilha2.push(pilha1.top());
                pilha1.pop();
            }
            pilha2.push(pilha1.top());
        }

        System.out.println(pilha1);
        System.out.println(pilha2);

        for (int i = 0; i <= word.toCharArray().length / 2; i++) {
            if (pilha1.top() == pilha2.top()) {
                pilha1.pop();
                pilha2.pop();
            }
        }
        if (pilha1.isEmpty() && pilha2.isEmpty()) {
            System.out.println("A palavra digitada é um palíndromo");
        } else {
            System.out.println("A palavra digitada NÃO é um palíndromo");
        }
    }

}
