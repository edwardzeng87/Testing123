package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void correctFinalSumAfterAddingTwoNumbers() {
        Calculator calculator = new Calculator();
        int finalSum = calculator.add(5, 5);
        assertEquals(10, finalSum);
    }

    @Test
    public void correctFinalSumAfterSubtractingTwoNumbers() {
        Calculator calculator = new Calculator();
        int finalSum = calculator.subtract(5, 2);
        assertEquals(3, finalSum);
    }
}
