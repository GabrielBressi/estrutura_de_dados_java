package com.gabriel.filas.exercicios;

public class Documento {

    private String nome;
    private int quatidadeFolhas;

    public Documento() {
    }

    public Documento(String nome, int quatidadeFolhas) {
        this.nome = nome;
        this.quatidadeFolhas = quatidadeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuatidadeFolhas() {
        return quatidadeFolhas;
    }

    public void setQuatidadeFolhas(int quatidadeFolhas) {
        this.quatidadeFolhas = quatidadeFolhas;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", quatidadeFolhas=" + quatidadeFolhas +
                '}';
    }
}
