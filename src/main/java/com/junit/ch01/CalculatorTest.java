package com.junit.ch01;

/**
 * Programa que hace un test al metodo add() de la clase Calculator
 */
public class CalculatorTest {
    private int nbErrors = 0;
    Calculator calc = new Calculator();
    public void testAdd(){
        double result = calc.add(10, 50);
        if(result != 60){
            throw new IllegalStateException("Bad result " + result);
        }
    }
    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        try{
            calcTest.testAdd();
        }
        catch(Throwable e){
            calcTest.nbErrors++;
            e.printStackTrace();
        }

        if(calcTest.nbErrors > 0){
            throw new IllegalStateException("There were " + calcTest.nbErrors + " errors");
        }
    }
}
