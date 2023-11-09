package com.edteam.testing;

public class Calculadora {
    public double calcularIMC(double peso, double altura)throws InterruptedException{
        if(peso == 0 || altura == 0)
            throw new IllegalArgumentException("No se aceptan valores con cero");
        double imc = peso / (altura * altura);
        imc = Math.round(imc * 1000);
        imc = imc / 1000;

        // agregamos esta linea para hacer la prueba de Test Timeout
        Thread.sleep(1000L);
        return imc;
    }
/*
    public double calcularIMC(double peso, double altura){
        double imc = peso / (altura * altura);
        imc = Math.round(imc * 1000);
        imc = imc / 1000;
        return imc;
    }
*/
}
