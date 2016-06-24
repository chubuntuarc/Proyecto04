package com.example.arciniega.proyecto04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    //Se declara un arreglo para almacenar las opciones que contendra el spinner
    private String arreglo_spinner[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se asignan los valores que contendra el arreglo
        arreglo_spinner = new String[4];
        arreglo_spinner[0] = "Réctangulo";
        arreglo_spinner[1] = "Triángulo";
        arreglo_spinner[2] = "Rombo";
        arreglo_spinner[3] = "Paralelogramo";

        // Se crea el objeto del espiner
        Spinner s = (Spinner)findViewById(R.id.spinner);
        // Se utiliza un ArrayAdapter para asignar los valores al spinner
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arreglo_spinner);
        s.setAdapter(adaptador);
    }
}
