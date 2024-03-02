package com.gabriel.pilhas.exercicios.livroforex03;

import java.time.LocalDate;
import java.util.Date;

public class Livro {

    private String nome;
    private String isbn;
    private int ano_lancamento;

    private String autor;

    public Livro(String nome, String isbn, int ano_lancamento, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.ano_lancamento = ano_lancamento;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", ano_lancamento=" + ano_lancamento +
                ", autor=" + autor +
                '}';
    }
}
