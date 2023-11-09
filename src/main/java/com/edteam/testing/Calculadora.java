package com.edteam.testing;

public class Calculadora {
    public double calcularIMC(double peso, double altura){
        double imc = peso / (altura * altura);
        imc = Math.round(imc * 1000);
        imc = imc / 1000;
        return imc;
    }
}
