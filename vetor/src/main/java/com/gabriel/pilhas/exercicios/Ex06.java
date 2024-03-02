package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;

import java.util.Scanner;

public class Ex06 {

    final static String ABRE = "({[";
    final static String FECHA = ")}]";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String exp = readKeyboard("Digite a expressão matemática: ", scan);

        imprimeResultado(exp);
    }

    public static void imprimeResultado(String exp) {
        if (isExpressionCorrect(exp))
            System.out.println("A Expressão está \033[32mcorreta\033[m");
        else
            System.out.println("A Expressão está \033[31mincorreta\033[m");
    }

    public static String readKeyboard(String text, Scanner scan) {
        System.out.println(text);
        return scan.next();
    }

    public static boolean isExpressionCorrect(String exp) {
        Pilha<Character> esquerda = new Pilha<>();
        Pilha<Character> direita = new Pilha<>();

        char simbol;

        for (int i = 0; i < exp.length(); i++) {
            simbol = exp.charAt(i);
            if (ABRE.indexOf(simbol) > -1) {
                esquerda.push(simbol);
            } else if (FECHA.indexOf(simbol) > -1) {
                direita.push(simbol);
            }
        }
        if (esquerda.tamanho() == direita.tamanho()) {
            return true;
        }


        return false;
    }




}
