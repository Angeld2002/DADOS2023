package com.politecnicomalaga.dados2023.model;

public class Dados {
    private int valor;

    public Dados() {
        this.valor = this.nuevoValor();
    }

    public int getValor() {
        return valor;
    }

    public int nuevoValor(){
      this.valor = (int) (Math.random()*6 + 1);
      return valor;
    }
}
