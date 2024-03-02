package com.gabriel.vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    private static int DEFAULT_CAPACITY = 10;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista() {
        this.elementos = (T[]) new Object[DEFAULT_CAPACITY];
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] =  elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public void isPositionValid(int position) {
        if(!(position >= 0 && position < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
    }


    public boolean adiciona(int posicao, T elemento) {
        isPositionValid(posicao);

        this.aumentaCapacidade();

        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }

    public void remove(int posicao) {
        isPositionValid(posicao);

        for (int i = posicao; i <= this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T busca(int posicao) {
        isPositionValid(posicao);

        return this.elementos[posicao];
    }

    /* EXERCICIO 01: Implementar método contém  semelhante ao método contains da classe ArrayList */
    public boolean contem(T elemento) {
        int pos = busca(elemento);

        return !busca(pos).equals(-1);
    }

    /* Loiane Resolução */
    public boolean contains(T elemento) {
        return busca(elemento) > -1;
    }

    /* EXERCICIO 02: Implentar método lastIndexOf da classe ArrayList */
    public int lastIndexOf(T elemento) {
        for (int i = this.tamanho -1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    /* EXERCICIO 03: Implementar método remove(T elemento) */
    public void remove(T elemento) {
        int pos = busca(elemento);
        // loiane added if verification
        if(pos > -1) {
            remove(pos);
        }
    }

    /* EXERCICIO 04: Implementar método obtem que é semelhante ao método get da classe ArrayList */
    public T get(int index) {
        return this.busca(index);
    }

    /* EXERCICIO 05: Implementar método limpar semelhante ao método clear da classe ArrayList */
    public void clear() {
        for (int i = this.tamanho -1; i >= 0; i--) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    /* Loiane Resolução */
    public void limpar() {
        this.elementos = (T[]) new Object[this.elementos.length];
    }

    public int busca(T elemento) {
        // algoritimo de busca sequencial ( considerado o algoritimo mais simple de busca )
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho>0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }


}
