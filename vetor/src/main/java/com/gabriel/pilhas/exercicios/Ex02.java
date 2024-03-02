package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();


        for (int i = 1; i <= 10; i++) {
            int num = readNum("Entre com um número inteiro: ", scan);

            if (num % 2 == 0 && num != 0) {
                System.out.printf("Empilhando valor %d na pilha [PAR] \n", num);
                par.push(num);
            } else if (num % 2 == 1) {
                System.out.printf("Empilhando valor %d na pilha [IMPAR] \n", num);
                impar.push(num);
            } else  {
                if (!par.isEmpty()) {
                    System.out.println("Desempilhando valor da pilha [PAR]: " + par.top());
                    par.pop();
                } else {
                    System.out.println("Pilha [PAR] está vazia");
                }

                if (!impar.isEmpty()) {
                    System.out.println("Desempilhando valor da pilha [IMPAR]: " + impar.top());
                    impar.pop();
                } else {
                    System.out.println("Pilha [IMPAR] está vazia.");
                }
            }
        }

        System.out.println("\033[33mTodos os valores foram lidos\033[m...");

        System.out.println("\033[31mDesempilhando pilha \033[32m[PAR]\033[m");
        while (!par.isEmpty()) {
            System.out.println("Desempilhando elemento: " + par.top());
            par.pop();
        }

        System.out.println("\033[31mDesempilhando pilha \033[32m[IMPAR]\033[m");
        while (!impar.isEmpty()) {
            System.out.println("Desempilhando elemento: " + impar.top());
            impar.pop();
        }
    }

    private static int readNum(String text, Scanner scan) {
        System.out.print(text);
        return scan.nextInt();
    }

}
