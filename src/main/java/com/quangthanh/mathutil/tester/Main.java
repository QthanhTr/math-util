package com.quangthanh.mathutil.tester;

import com.quangthanh.mathutil.core.MathUtility;

import static com.quangthanh.mathutil.core.MathUtility.getFactorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //testGetFactorialGivenWrongArg0ThrowException();

        //xài thử hàm tính giai thừa
        System.out.println("5! = " + MathUtility.getFactorial(5));
        System.out.println("6! = " + MathUtility.getFactorial(6));


    }

    public static void testGetFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1;
        long actual;
        actual = getFactorial(n);
        System.out.println("Actual: " + actual + " Expected: " + expected);
    }

    public static void testGetFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1;
        long actual;
        actual = getFactorial(n);
        System.out.println("Actual: " + actual + " Expected: " + expected);
    }

    public static void testGetFactorialGivenRightArg2RunsWell() {
        int n = 2;
        long expected = 1;
        long actual;
        actual = getFactorial(n);
        System.out.println("Actual: " + actual + " Expected: " + expected);
    }

    public static void testGetFactorialGivenRightArg3RunsWell() {
        int n = -5;
        String expected = "exception";
        long actual;
        actual = getFactorial(n);
        System.out.println("Actual: " + actual + " Expected: " + expected);
    } // hàm mlem với n = -5 --> đúng

    public static void testGetFactorialGivenWrongArg0ThrowException(){
        System.out.println("25! Expected: Exception; Actual: ");
        getFactorial(25);
    }
    // test case 1
    //id, test case description | data| steps/ procedure | expected result | result |(pass / failed) | test date | test by
    //ID | DESC                   | DATA | STEPS       | EXPECTED RESULT | STATUS | DATE | BY
    //TC01 | VERIFY getFactorial() n = 0 |n=0
    //       CHECK                        UNTIL getF(O)  1 as the result   moi
    //       TEST
    //       WITH VALID n


}