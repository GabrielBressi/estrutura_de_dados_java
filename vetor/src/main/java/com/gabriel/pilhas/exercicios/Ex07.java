package com.gabriel.pilhas.exercicios;

import com.gabriel.pilhas.Pilha;

public class Ex07 {

    public static void main(String[] args) {
        imprimeResultado(45);
    }

    public static void imprimeResultado(int decimal) {
        System.out.println(convertDecimalToBinary(decimal));
    }

    public static Pilha<Integer> convertDecimalToBinary(int decimal) {
        Pilha<Integer> pilha = new Pilha<>();
        Pilha<Integer> binario = new Pilha<>();
        while ((decimal / 2) != 0) {
            pilha.push(decimal % 2);
            decimal /= 2;
        }
        pilha.push(decimal);

        for (int i = pilha.tamanho() - 1; i >= 0; i--) {
            binario.push(pilha.pop());
        }

        return binario;
    }

    /* SOLUTION 2 */
    public static int decimalToBinary(int dec) {
        Pilha<Integer> pilha = new Pilha<>();
        String binario = "";
        int bin;
        while ((dec / 2) >= 0) {
            pilha.push(dec / 2);
            dec /= 2;
            if (dec == 1) {
                pilha.push(dec);
            }
            binario += String.valueOf(pilha.pop());
        }

        bin = Integer.parseInt(binario);


        return 0;
    }
}
