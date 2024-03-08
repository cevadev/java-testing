package junit.ch01;

import com.junit.ch01.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        double result = calc.add(10,50);
        Assertions.assertEquals(60, result, 0);
    }
}
