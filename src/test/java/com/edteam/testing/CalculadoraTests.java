package com.edteam.testing;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class CalculadoraTests {
    @Test
    public void pruebaCalcularIMC(){
        Calculadora cal = new Calculadora();
        double imc = cal.calcularIMC(70, 180);
        Assert.isTrue(0.002 == imc, "OK");
    }
}
