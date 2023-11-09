package com.edteam.testing;

import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;


public class CalculadoraTests {
    private Calculadora calculadora;
    @Before
    public void antesDeCadaTest(){
        calculadora = new Calculadora();
    }

    @After
    public void despuesDeCadaTest(){
        System.out.println("Pruebas ejecutadas");
    }

    @Test
    public void calcularIMC_PersonaDelgada() throws InterruptedException{
        // Given
        double altura = 175;
        double peso = 72;

        // When
        double imc = calculadora.calcularIMC(peso, altura);

        // Then: Usando Assertions.assertAll()
        Assertions.assertAll(
                ()-> Assert.assertEquals(0.002, imc, 0),
                ()-> Assert.assertTrue(imc >0)
        );

    }

    @DisplayName("Test-> Calculo IMC persona Obesa")
    @Test
    public void calcularIMC__PersonaObesa()throws InterruptedException{
        // Given
        double altura = 160;
        double peso = 110;

        // When
        double imc = calculadora.calcularIMC(peso, altura);

        // Then
        Assert.assertEquals(0.004, imc, 0);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void calcularIMC__NoPuedeRecibirValoresConCero()throws InterruptedException{
        // Given
        double altura = 0;
        double peso = 110;

        // When
        double imc = calculadora.calcularIMC(peso, altura);
    }

    @Test(timeout = 2000) // valor en milisegundos. si tarda mas de 1 segundo se termina el test
    public void calcularIMC_Timeout()throws InterruptedException{
        // Given
        double altura = 160;
        double peso = 110;

        // When
        double imc = calculadora.calcularIMC(peso, altura);
    }


/*
    @Test
    public void pruebaCalcularIMC(){
        Calculadora cal = new Calculadora();
        double imc = cal.calcularIMC(70, 180);
        // colocamos primero el valor que esperamos que se cumpla
        // colocamos segundo el valor con el que vamos a comparar
        // colocamos la cantidad de decimales a comparar
        Assert.assertEquals(0.002, imc, 0);
    }
 */
}
