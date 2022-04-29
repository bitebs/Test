package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualsTest {
    @Test
    public void getStringEquals(){
        String str = null;
        assertEquals(false, Equals.getStringEquals(str));
    }

    @Test
    public void getStringEquals1(){
        String str = null;
        assertEquals(true, Equals.getStringEquals(str));
    }
}