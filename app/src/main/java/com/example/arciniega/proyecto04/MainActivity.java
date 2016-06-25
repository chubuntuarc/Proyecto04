package com.example.arciniega.proyecto04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    // Se declara la clase Figuaras para despues instanciarla
    private Figuras figuras;
    //Se declara un arreglo para almacenar las opciones que contendra el spinner
    private String arreglo_spinner[];

    // Variables que se usaran para asignar los valores correspondientes en la clase Figuras
    private Spinner spinner;
    private String spinVal;
    private EditText valor1;
    private EditText valor2;

    private Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se asignan los valores que contendra el arreglo del spinner
        arreglo_spinner = new String[4];
        arreglo_spinner[0] = "Réctangulo";
        arreglo_spinner[1] = "Triángulo";
        arreglo_spinner[2] = "Paralelogramo";
        arreglo_spinner[3] = "Rombo";

        // Se crea el objeto del espiner
        Spinner s = (Spinner)findViewById(R.id.spinner);
        // Se utiliza un ArrayAdapter para asignar los valores al spinner
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arreglo_spinner);
        s.setAdapter(adaptador);

        //Se asignan los valores correspondientes a las variables a usar.
        spinner = (Spinner)findViewById(R.id.spinner);
        spinVal = spinner.getSelectedItem().toString();
        valor1 = (EditText)findViewById(R.id.editValor1);
        valor2 = (EditText)findViewById(R.id.editValor2);

        btnCalcular = (Button)findViewById(R.id.btnCalcular);

        // Se declara el elemento en el que se asignara el resultado de la operación
        final EditText resultado = (EditText)findViewById(R.id.editResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Instancia de la clase Figuras
                figuras =  new Figuras();

                // Se asignan los valores a los elementos de la clase Figuras
                figuras.setValor1(Integer.parseInt(valor1.getText().toString())); //Se convierten a string y despues a integer para obtener el numero en el EditText
                figuras.setValor2(Integer.parseInt(valor2.getText().toString()));

                figuras.setFigura(spinVal);

                figuras.calculo();

            }
        });
    }
}
