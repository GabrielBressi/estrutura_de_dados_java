package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;

public class ResolucaoEx05 {

    public static void main(String[] args) {
       imprimeResultado("ADA");
       imprimeResultado("ABCD");
       imprimeResultado("ABCCBA");
       imprimeResultado("Hanah");
    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }

}
