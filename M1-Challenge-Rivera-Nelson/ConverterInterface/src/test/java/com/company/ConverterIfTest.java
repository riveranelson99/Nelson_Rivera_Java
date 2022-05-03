package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    ConverterIf convertIf;

    @Before
    public void convertIf() {
        convertIf = new ConverterIf();
    }

    @Test
    public void shouldConvertMonth() {
        assertEquals("February", convertIf.convertMonth(2));
    }

    @Test
    public void shouldConvertDay() {
        assertEquals("Monday", convertIf.convertDay(2));
    }

}