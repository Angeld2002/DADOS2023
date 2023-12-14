package com.politecnicomalaga.dados2023.model;

public class Tirada {
    private Dados d1;
    private Dados d2;

    public Tirada() {
        this.d1 = new Dados();
        this.d2 = new Dados();
    }

    public Dados getD1() {
        return d1;
    }

    public Dados getD2() {
        return d2;
    }

    public int nSeis(){
        int contador = 0;
        if (this.d1.getValor() == 6) {
            contador++;
        }
        if (this.d2.getValor() == 6) {
            contador++;
        }
        return contador;
    }
    public int sumaNum(){
        return (d1.getValor() + d2.getValor());
    }
}
