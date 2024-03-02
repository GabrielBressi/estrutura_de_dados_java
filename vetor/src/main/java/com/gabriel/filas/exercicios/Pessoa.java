package com.gabriel.filas.exercicios;

public class Pessoa implements Comparable<Pessoa> {

    private String name;

    /**
     * Refere-se ao tipo de atendimento:
     * PRIORITÁRIO ou COMUM
     * */
    private String tipo;

    private int prioridade;

    private static final String PRIORITARIO = "prioritario";
    private static final String COMUM = "comum";


    @Override
    public int compareTo(Pessoa p) {

        if(this.prioridade < p.getPrioridade()) {
            return 1;
        } else if (this.prioridade > p.getPrioridade()) {
            return -1;
        }

        return 0;
    }


    // Contructors
    public Pessoa() {
    }
    public Pessoa(String name, String tipo, int prioridade) {
        this.name = name;
        this.tipo = tipo;
        this.prioridade = prioridade;
     }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", tipo='" + tipo + '\'' +
                ", prioridade=" + prioridade + '\'' +
                '}';
    }

}
