package com.company.sumvalues;

import com.company.ArraySum;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class ArraySumTest {
    @Test
    public void getSum(){
        assertEquals(55, ArraySum.getSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        //assertEquals(56, ArraySum.getSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        //assertEquals(55, ArraySum.getSum(new int[]{1, 2, 3, 5, 5, 6, 7, 8, 9, 10}));
    }
}