package com.gabriel.filas;

public class FilaComPrioridade<T> extends Fila<T> {


    /**
     * Enfileira os elementos seguindo a ordem de prioridade
     * @param elemento
     * @return void
     * */
    @Override
    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i = 0; i < this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona(i, elemento);
    }

}
