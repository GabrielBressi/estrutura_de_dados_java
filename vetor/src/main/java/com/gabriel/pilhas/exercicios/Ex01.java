package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 10; i++) {
            int num = readNumber("Digite um numero: ", scan);
            if (num % 2 == 0) {
                System.out.println("Empilhando o número: " + num);
                pilha.push(num);
            } else {
                if (!pilha.isEmpty()) {
                    System.out.println("Desempilhando número: " + pilha.top());
                    pilha.pop();
                } else {
                    System.out.println("A pilha esta vazia.");
                }
            }
        }
        System.out.println("Todo os valores foram lidos, desempilhando...");
        if (!pilha.isEmpty()) {
            for (int i = pilha.tamanho() -1; i >= 0; i--) {
                System.out.println("Elemento desempilhado: " + pilha.top());
                pilha.pop();
            }
        } else {
            System.out.println("Pilha está vazia!");
        }
    }

    private static int readNumber(String text, Scanner scan) {
        System.out.print(text);
        return scan.nextInt();
    }

}
