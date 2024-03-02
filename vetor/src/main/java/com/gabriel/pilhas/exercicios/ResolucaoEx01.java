package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;

import java.util.Scanner;

public class ResolucaoEx01 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um número: ");

            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando o número " + num);
                pilha.push(num);
            } else {
                Integer desempilhado = pilha.pop();

                if (desempilhado == null) {
                    System.out.println("pilha está vazia");
                } else {
                    System.out.println("Número impar, desempilhando um elemento da pilha: " + desempilhado);
                }

            }

        }

        System.out.println("Todos os números foram lidos, desempilhando...");

        while (!pilha.isEmpty()) {
            Integer desempilhado = pilha.pop();
            System.out.println("desempilhando um elemento da pilha: " + desempilhado);
        }

        System.out.println("Todos os elementos foram desempilhados");

    }
}
