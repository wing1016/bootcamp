package com.example.demotdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // private Calculator calculoator;

    @Test
    void testSum(){
        new Calculator(Arrays.asList(3,10,2));
        assertEquals(15, new Calculator(Arrays.asList(3,10,2)).sum());
        assertEquals(99, new Calculator(Arrays.asList(-3,100,2)).sum());
        //sir
    }
}