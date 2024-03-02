package com.gabriel.vetor;

import com.gabriel.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2() {
        super();
    }

    public Lista2(int capaciadade) {
        super(capaciadade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

}
