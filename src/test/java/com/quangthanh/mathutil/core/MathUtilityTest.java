package com.quangthanh.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.quangthanh.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void testGetFactorialGivenWrongArg0RunsWell(){
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
    }

    @Test
    public void testGetFactorialGivenWrongArg1RunsWell(){
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(25);});
    }

    @Test
    public void testGetFactorialGivenRightArg2RunsWell(){
        assertEquals(120, getFactorial(5));
    }

    @Test
    public void testGetFactorialGivenRightArg1RunsWell(){
        assertEquals(1, getFactorial(1));
    }

    //framework: phải viết code theo một quy tắc,cấu trúc thì mới run
    @Test
    public void testGetFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1;
        long actual;
        actual = getFactorial(n);

        assertEquals(expected, actual); // hàm này sẽ so sánh 2 đại lượng, nếu = nhau thì ném ra màu xanh, nếu khác biệt, ném màu đỏ
        // xanh đỏ để pass/fail

        //System.out.println("Actual: " + actual + " Expected: " + expected);
    }
}