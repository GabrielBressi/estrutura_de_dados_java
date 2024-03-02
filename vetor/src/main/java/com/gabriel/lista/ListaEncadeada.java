package com.gabriel.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    private final int NAO_ENCONTRADO = -1;
    private final String LISTA_VAZIA = "Lista está vazia.";
    private final String NAO_EXISTE = "Posição não existe";

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionaNoInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
            this.tamanho++;
        } else {
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
            tamanho++;
        }
    }

    public void adiciona(int posicao, T elemento) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0) {
            this.adicionaNoInicio(elemento);
        } else if (posicao == this.tamanho) {
            this.adiciona(elemento);
        } else {
            No<T> noPosicao = this.buscaNo(posicao);
            No<T> noAnterior = this.buscaNo(posicao -1);
            No<T> novoNo = new No<>(elemento, noPosicao);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    private boolean posicaoNaoExiste(int posicao) {
        return !(posicao >= 0 && posicao <= this.tamanho);
    }

    public T removeInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0) {
            this.ultimo = null;
        }

        return removido;
    }

    public T removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }

        if (this.tamanho != 1) {
            No<T> penultimo = this.buscaNo(this.tamanho - 2);
            T removido = penultimo.getProximo().getElemento();
            penultimo.setProximo(null);
            this.ultimo = penultimo;
            this.tamanho--;

            return removido;
        } else {
            return this.removeInicio();
        }
    }

    public T removePosicao(int posicao) {

        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0) {
            return this.removeInicio();
        }

        if (posicao == this.tamanho - 1) {
            return this.removeFinal();
        }

        No<T> noAnterior = this.buscaNo(posicao - 1);
        No<T> noAtual = noAnterior.getProximo();
        No<T> noProximo = noAtual.getProximo();
        noAnterior.setProximo(noProximo);
        noAtual.setProximo(null);
        this.tamanho--;

        return noAtual.getElemento();
    }



    /*
    My solution
    public void removerInicio() {
        No<T> noInicio = this.inicio;
        No<T> proximo = noInicio.getProximo();
        noInicio.setElemento(null);
        noInicio.setProximo(null);
        this.inicio = proximo;
        this.tamanho--;
    }

    public void removerPosicao(int posicao) {
        if(posicao == 0) {
            this.removerInicio();
        }

        if (posicao == this.tamanho) {
            this.removerFinal();
        }

        No<T> noPosicao = this.buscaNo(posicao);
        No<T> noAnterior = this.buscaNo(posicao -1);
        No<T> noProximo = noPosicao.getProximo();

        noAnterior.setProximo(noProximo);
        noPosicao.setElemento(null);
        noPosicao.setProximo(null);
        this.tamanho--;
    }

    public void removerFinal() {
        No<T> noUltimo = this.ultimo;
        No<T> noAnterior = this.buscaNo(this.tamanho - 1);
        noUltimo.setElemento(null);
        noUltimo.setProximo(null);
        this.tamanho--;
        noAnterior.setProximo(null);
        this.ultimo = noAnterior;
    }

     */



    // My solution - no adding in beginning
    /*public void adiciona(T elemento, int posicao) {
        No<T> noAtual = this.ultimo;
        //No<T> celula = new No<>(elemento);
        this.adiciona(this.ultimo.getElemento());
        noAtual.setProximo(this.ultimo);
        for (int i = this.tamanho; i > posicao; i--) {
            if (posicao != 0) {
                noAtual = buscaNo(i - 1);
                noAtual.setElemento(buscaNo(i - 2).getElemento());
            }
        }
        noAtual.setElemento(elemento);
    }*/

    /**
     * Retorna o elemento de uma determinada posição na lista linkada
     * @param posicao
     * @return No&lt;T&gt;
     * */


    private No<T> buscaNo(int posicao) {

        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }
    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;
        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }
        return NAO_ENCONTRADO;
    }

/*    public No<T> buscaPorPosicao(int posicao) {
        No<T> atual = this.inicio;
        No<T> proximo;

         if (posicao == 0) {
            return atual;
        }

        for (int i = 1; i <= posicao; i++) {
            proximo = atual.getProximo();
            atual = proximo;
        }

        return atual;
    }
    public No<T> busca(T elemento) throws Exception {
        No<T> atual = this.inicio;
        No<T> proximo;

        for (int i = 0; i < this.tamanho -1; i++) {
            if (atual.getElemento().equals(elemento)) {
                return atual;
            }

            proximo = atual.getProximo();
            atual = proximo;
        }

        throw new Exception("Elemento não encontrado na lista");
    }*/

    public void limpa() {
        No<T> atual;
        for (atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void clear() {
        No<T> pp;
        for (int i = 0; i < this.tamanho; i++) {
            pp = inicio.getProximo().getProximo();

            this.inicio.getProximo().setElemento(null);
            this.inicio.getProximo().setProximo(null);

            this.inicio.setProximo(pp);
            tamanho--;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }


    /*@Override // Using While
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (this.tamanho == 0) {
            return "[]";
        }

        No<T> atual = this.inicio;
        builder.append("[");
        builder.append(atual.getElemento());
        if (atual.getProximo() != null) {
            builder.append(", ");
        }
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            builder.append(atual.getElemento());
            if (atual.getProximo() != null) {
                builder.append(", ");
            }
        }
        builder.append("]");


        return builder.toString();
    }*/

    // Using for
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (this.tamanho == 0) {
            return "[]";
        }

        No<T> atual = this.inicio;
        builder.append("[");
        for (int i = 0; i < this.tamanho; i++) {
            builder.append(atual.getElemento());
            if (atual.getProximo() != null) {
                builder.append(", ");
            }
            atual = atual.getProximo();
        }
        builder.append("]");


        return builder.toString();
    }
}
