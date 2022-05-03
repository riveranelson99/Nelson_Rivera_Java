package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void Calculator() {

        calc = new Calculator();
    }

    @Test
    public void thisShouldAdd() {

        assertEquals(2, calc.addition(1, 1));
        assertEquals(5.699999999999999, calc.addition(3.4d, 2.3d), .0001);
    }

    @Test
    public void thisShouldSubtract() {

        assertEquals(-29, calc.subtraction(23, 52));
        assertEquals(5.0, calc.subtraction(5.5d, 0.5d), .0001);
    }

    @Test
    public void thisShouldMultiply() {

        assertEquals(68, calc.multiplication(34, 2));
        assertEquals(29.480000000000004, calc.multiplication(6.7d, 4.4d), .0001);
    }

    @Test
    public void thisShouldDivide() {

        assertEquals(1, calc.division(12, 7));
        assertEquals(4.909090909090909, calc.division(10.8d, 2.2d), .0001);
    }

}