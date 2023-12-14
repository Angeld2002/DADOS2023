package com.politecnicomalaga.dados2023.control;

import com.politecnicomalaga.dados2023.model.Partida;
import com.politecnicomalaga.dados2023.vista.MainActivity;

public class Controller {

    private static Partida partida = new Partida();
    private static MainActivity miActivity;
    private static Controller Singleton;


    private Controller() {}
    public static Controller getInstance() {
        if (Singleton == null) {Singleton = new Controller();}
        return Singleton;
    }
    public static String[] resultados() {

        partida.nuevaPartida();

        String[] resultados = partida.getResultados();

        return resultados;
    }



}
