package com.gabriel.filas.exercicios;

import com.gabriel.filas.Fila;

public class Ex01 {

    public static void main(String[] args) throws Exception {
        Fila<Documento> fila = new Fila<>();

        Documento doc1 = new Documento("doc1", 30);
        Documento doc2 = new Documento("doc2", 10);

        fila.enfileira(doc1);
        fila.enfileira(doc2);

        System.out.println(fila);

        System.out.println(fila.desenfilera());
        System.out.println(fila.desenfilera());

        System.out.println(fila);

    }

}
