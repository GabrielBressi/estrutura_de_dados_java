package com.gabriel.vetor;

import java.util.Arrays;

public class Vetor {
  // Vetor (ou array) é a estrutura de dados mais simples
  // Um vetor armazena uma sequência de valores onde todos são do mesmo tipo
  // declarar vetor(array)  tipo[] variavelName = new tipo[quantidade_de_posições(ex: 365)];

  private String[] elementos;
  private int tamanho;


  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.tamanho = 0;
  }

  /* public void adiciona(String elemento) {
    for(int i = 0; i < this.elementos.length; i++) {
      if(this.elementos[i] == null) {
        this.elementos[i] = elemento;
        break;
      }
    }
  } */

  /* public void adiciona(String elemento) throws Exception{

    if(this.tamanho < this.elementos.length) {
      this.elementos[this.tamanho] =  elemento;
      this.tamanho++;
    } else {
      throw new Exception("Vetor já está cheio, não é possivel adicionar mais elementos");
    }

  } */

  public boolean adiciona(String elemento) {
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


  public boolean adiciona(int posicao, String elemento) {
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
      String[] elementosNovos = new String[this.elementos.length * 2];
      for (int i = 0; i < this.elementos.length; i++) {
        elementosNovos[i] = this.elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }

  public String busca(int posicao) {
    isPositionValid(posicao);

    return this.elementos[posicao];
  }

  public int busca(String elemento) {
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
