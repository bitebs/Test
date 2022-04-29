package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTest {
    @Test
    public void getLengthString() {
        assertEquals(11, Exercises.getLengthString("example.com"));
    }
    
}