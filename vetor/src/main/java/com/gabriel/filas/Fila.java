package com.gabriel.filas;

import com.gabriel.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila () {
        super();
    }
    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }

    public T peek() throws Exception {
        if(!isEmpty()) {
            return (T) this.elementos[0];
        }

        throw new Exception("A fila está vazia");
    }

    public T desenfilera() throws Exception {
        T firstElement = (T) this.elementos[0];
        if(!isEmpty()) {
            for(int i = 0; i < this.tamanho; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.elementos[this.tamanho - 1] = null;
            this.tamanho--;
            return firstElement;
        }

        throw new Exception("A fila está vazia");
    }

}
