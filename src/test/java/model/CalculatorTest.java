package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void correctFinalSumAfterAddingTwoNumbers() {
        Calculator calculator = new Calculator();
        int finaSum = calculator.add(5, 5);
        assertEquals(10, finaSum);
    }


}
