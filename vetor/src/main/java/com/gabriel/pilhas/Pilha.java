package com.gabriel.pilhas;

import com.gabriel.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    /**
     * Empilha os elementos
     * */
    public void push(T elemento) {
        super.adiciona(elemento);
    }

    /**
     * Ver o topo da pilha
     * */
    public T top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.elementos[this.tamanho -1];
    }

    /**
     * Desempilha - remove o ultimo item adicionado
     * */
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return this.elementos[--tamanho];
    }

}
