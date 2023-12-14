package com.politecnicomalaga.dados2023.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.politecnicomalaga.dados2023.R;
import com.politecnicomalaga.dados2023.control.Controller;

public class MainActivity extends AppCompatActivity {
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void playGame(View v) {

        controller.getInstance();

        String[] resultados = controller.resultados();


        TextView tvResultado = (TextView) this.findViewById(R.id.tvResultadoFinal);


        TextView tvDado1J1 = (TextView) this.findViewById(R.id.tvDado1J1);
        TextView tvDado2J1 = (TextView) this.findViewById(R.id.tvDado2J1);

        TextView tvDado1J2 = (TextView) this.findViewById(R.id.tvDado1J2);
        TextView tvDado2J2 = (TextView) this.findViewById(R.id.tvDado2J2);
        

        tvDado1J1.setText(resultados[0]);
        tvDado2J1.setText(resultados[1]);

        tvDado1J2.setText(resultados[2]);
        tvDado2J2.setText(resultados[3]);

        tvResultado.setText(resultados[4]);

        }
}
