package com.politecnicomalaga.dados2023.model;

public class Partida {

    private String[] resultados;
    private Jugador jugador1;
    private Jugador jugador2;

    public Partida() {
        jugador1 = new Jugador(1);
        jugador2 = new Jugador(2);
        resultados = new String[5];
    }

    public String[] getResultados() {
        return resultados;
    }

    public int calculaGanador() {
        if (jugador1.getTirada().nSeis() > jugador2.getTirada().nSeis()) {
            return 1;
        } else if (jugador1.getTirada().nSeis() < jugador2.getTirada().nSeis()) {
            return 2;
        } else if (jugador1.getTirada().sumaNum() > jugador2.getTirada().sumaNum()) {
            return 1;
        } else if (jugador1.getTirada().sumaNum() < jugador2.getTirada().sumaNum()) {
            return 2;
        } else return 0;
    }

    public void nuevaPartida(){
        jugador1.nuevaTirada();
        jugador2.nuevaTirada();
        resultados[0] = jugador1.getTirada().getD1().getValor() + "";
        resultados[1] = jugador1.getTirada().getD2().getValor() + "";
        resultados[2] = jugador2.getTirada().getD1().getValor() + "";
        resultados[3] = jugador2.getTirada().getD2().getValor() + "";
        if (calculaGanador() == 1) {resultados[4] = "Jugador 1";}
        else if (calculaGanador() == 2) {resultados[4] = "Jugador 2";}
        else {resultados[4] = "Empate";}
    }
}