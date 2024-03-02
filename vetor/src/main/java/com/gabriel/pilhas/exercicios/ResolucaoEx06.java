package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;

public class ResolucaoEx06 {

    public static void main(String[] args) {
        imprimeResultado("A + B"); // true
        imprimeResultado("A + B + (C - D)"); // true
        imprimeResultado("{[()]}[](){()}"); // true
        imprimeResultado("{[(]}[](){()}"); // false
        imprimeResultado("{[()]}[](){()"); // false

    }

    public static void imprimeResultado(String exp) {
        System.out.println(exp + " está balanceado? " + verificaSimbolosBalanceados(exp));
    }

    /*** ABRE e FECHA deve seguir os mesmos indices *
     * EX:
     * ABRE
     *   0  1  2
     * [ (, [, { ]
     * FECHA
     *   0  1  2
     * [ ), ], } ]
     */

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaSimbolosBalanceados(String exp) {
        Pilha<Character> pilha = new Pilha<>();
        char simbolo, topo;

        for (int i = 0; i < exp.length(); i++) {
            simbolo = exp.charAt(i);

            if(ABRE.indexOf(simbolo) > -1) {
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {

                if (pilha.isEmpty()) {
                    return false;
                } else {
                    topo = pilha.pop();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

        }

        return true;
    }

    public static boolean checkSimbols(String exp) {

        Pilha<Character> pilha = new Pilha<>();

        char simbol, top;

        for (int i = 0; i < exp.length(); i++) {
            simbol = exp.charAt(i);
            if (ABRE.indexOf(simbol) > -1) {
                pilha.push(simbol);
            } else if (FECHA.indexOf(exp.charAt(i)) > -1) {
                if(pilha.isEmpty()) {
                    return false;
                } else  {
                    top = pilha.pop();
                    if(ABRE.indexOf(top) != FECHA.indexOf(simbol)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
