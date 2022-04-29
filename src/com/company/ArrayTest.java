package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    @Test
    public void getAverageValue(){
        assertEquals(7, Array.getAverageValue(new int[]{20, 30, 25, 35, -16, 60, -100}));
    }
}