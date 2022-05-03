package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    ConverterSwitch convertSwitch;

    @Before
    public void convertSwitch() {
        convertSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldConvertMonth() {
        assertEquals("June", convertSwitch.convertMonth(6));
    }

    @Test
    public void shouldConvertDay() {
        assertEquals("Friday", convertSwitch.convertDay(6));
    }

}