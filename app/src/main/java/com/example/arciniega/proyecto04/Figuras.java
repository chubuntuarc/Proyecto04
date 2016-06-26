package com.example.arciniega.proyecto04;

/**
 * Created by arciniega on 24/06/16.
 */
public class Figuras {

    //Declaración de variables
    private double valor1;
    private double valor2;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    private double resultado;

    //Constructor de la clase
    public Figuras(){

    }


    public String calculo(){
        resultado = (valor1 * valor2) / 2;
        return "" + String.valueOf(resultado);
    }
}
