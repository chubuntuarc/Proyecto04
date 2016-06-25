package com.example.arciniega.proyecto04;

/**
 * Created by arciniega on 24/06/16.
 */
public class Figuras {

    //Declaración de variables
    private int valor1;
    private int valor2;
    private int resultado;
    private String figura;

    //Constructor de la clase
    public Figuras(){

    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public void calculo(){
        switch(figura){
            case "Réctangulo":
                resultado = valor1 * valor2;
                break;
            case "Triángulo":
                resultado = (valor1 * valor2) / 2;
                break;
            case "Paralelogramo":
                resultado = valor1 * valor2;
                break;
            case "Rombo":
                resultado = (valor1 * valor2)/ 2;
                break;
        }
    }
}
