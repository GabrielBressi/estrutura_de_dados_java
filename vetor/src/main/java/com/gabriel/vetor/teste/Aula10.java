package com.gabriel.vetor.teste;

import com.gabriel.vetor.VetorObjetos;

public class Aula10 {

    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato(
                "Contato 1",
                "1234-5678",
                "contato1@email.com"
        );

        Contato c2 = new Contato(
                "Contato 2",
                "5231-5678",
                "contato2@email.com"
        );

        Contato c3 = new Contato(
                "Contato 3",
                "9876-5678",
                "contato3@email.com"
        );

        Contato c4 = new Contato(
                "Contato 1",
                "1234-5678",
                "contato1@email.com"
        );

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);


        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c4);
        if(pos > -1) {
            System.out.println("Elemento existe");
        } else System.out.println("Elemento não existe");

        System.out.println(vetor);
    }
}
