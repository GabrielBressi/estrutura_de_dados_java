package com.gabriel.lista.testes;

import com.gabriel.lista.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) throws Exception {
        //adicionaNoInicio();

        //adicionaNaPosicao();
        //removerInicio();
        //removerFinal();
        removerPosicao();
    }

    public static void removerInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaNoInicio(5);
        lista.adicionaNoInicio(4);
        lista.adicionaNoInicio(3);
        lista.adicionaNoInicio(2);
        lista.adicionaNoInicio(1);
        System.out.println(lista);
        System.out.println(lista.removeInicio());
        System.out.println(lista);

    }



    public static void removerFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

 /*       lista.adicionaNoInicio(5);
        lista.adicionaNoInicio(4);
        lista.adicionaNoInicio(3);
        lista.adicionaNoInicio(2);*/
        lista.adicionaNoInicio(1);

        System.out.println(lista.removeFinal());
        System.out.println(lista);


    }

    public static void removerPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);
        System.out.println("Elemento removido:" + lista.removePosicao(1));
        System.out.println("List: " + lista);

    }


    public static void adicionaNaPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaNoInicio(5);
        lista.adicionaNoInicio(4);
        lista.adicionaNoInicio(3);
        lista.adicionaNoInicio(2);
        lista.adicionaNoInicio(1);


        lista.adiciona(3, 15);
        System.out.println(lista);
    }

    public static void adicionaNoInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaNoInicio(3);
        lista.adicionaNoInicio(2);
        lista.adicionaNoInicio(1);

        System.out.println(lista);
    }

    public static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        //System.out.println("Tamanho: " + lista.getTamanho());
        //System.out.println(lista);

        lista.adiciona(2);
        //System.out.println(lista);

        lista.adiciona(3);
        //System.out.println(lista);

        //lista.clear();
        //System.out.println(lista);

        //System.out.println(lista.busca(52, 0));

        lista.adiciona(1, 30);
        System.out.println(lista);
    }

}
