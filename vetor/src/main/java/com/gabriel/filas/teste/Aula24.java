package com.gabriel.filas.teste;

import com.gabriel.Paciente;
import com.gabriel.base.EstruturaEstatica;
import com.gabriel.filas.Fila;
import com.gabriel.filas.FilaComPrioridade;

public class Aula24 {

    public static void main(String[] args) {
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("B", 2));
        fila.enfileira(new Paciente("A", 1));
        fila.enfileira(new Paciente("C", 3));

        /*fila.enfileira(3);
        fila.enfileira(1);
        fila.enfileira(2);*/

        System.out.println(fila);

    }

}
