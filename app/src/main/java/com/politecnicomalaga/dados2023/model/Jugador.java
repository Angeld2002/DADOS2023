package com.politecnicomalaga.dados2023.model;

public class Jugador {

    private int njugador;
    private int perdidas;
    private int ganadas;
    private int empatadas;
    private int numTiradas;
    private Tirada tirada;

    public Jugador(int njugador) {
        njugador = njugador;
        perdidas = 0;
        ganadas = 0;
        empatadas = 0;
        this.numTiradas = 0;
        this.tirada = nuevaTirada();
    }

    public Tirada nuevaTirada(){
        tirada = new Tirada();

        this.numTiradas++;
        return tirada;
    }

    public void setPerdidas(int perdidas) {
        perdidas = perdidas;
    }

    public void setGanadas(int ganadas) {
        ganadas = ganadas;
    }

    public void setEmpatadas(int empatadas) {
        empatadas = empatadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public int getGanadas() {
        return ganadas;
    }

    public int getEmpatadas() {
        return empatadas;
    }

    public int getNumTiradas() {
        return numTiradas;
    }

    public Tirada getTirada() {
        return tirada;
    }
}
