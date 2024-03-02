package com.gabriel.filas.teste;

import com.gabriel.filas.Fila;

public class Aula19 {

    public static void main(String[] args) throws Exception {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        System.out.println(fila);
        System.out.println(fila.peek());
        fila.desenfilera();
        System.out.println(fila);
        fila.desenfilera();
        System.out.println(fila);
        fila.desenfilera();
        System.out.println(fila);
        fila.desenfilera();
        System.out.println(fila);
    }
}
