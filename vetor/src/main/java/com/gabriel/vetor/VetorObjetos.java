package com.gabriel.vetor;

import java.util.Arrays;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;


    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
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


    public boolean adiciona(int posicao, Object elemento) {
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
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao) {
        isPositionValid(posicao);

        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
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
            s.append(",");
        }


        if(this.tamanho>0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return Arrays.toString(elementos);
    }

}
