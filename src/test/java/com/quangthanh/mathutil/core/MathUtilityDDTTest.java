package com.quangthanh.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.quangthanh.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // ham tra ve mang 2 chieu
    //ham nay dung de tra ve mang data dung de test ham tinh giai thua
    // Chuan bi data de nhoi vao ham test = data driven
    public static Object[][] initData(){

        Object dataSet[][] = {{0, 1},
                              {1, 1},
                              {2, 2},
                              {3, 6},
                              {4, 24},
                              {5, 120}
                             };

        return dataSet;
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testGetFactorialGivenRightArg2RunsWell( int n, long expected){
        assertEquals(expected, getFactorial(n));
    }




}