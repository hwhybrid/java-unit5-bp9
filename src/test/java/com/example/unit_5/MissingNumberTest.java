package com.example.unit_5;
import static org.junit.Assert.*;

import com.example.unit_5.MissingNumber;
import org.junit.Test;

public class MissingNumberTest {

    @Test
    public void testMissingNumber() {
        int[] input1 = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum1 = 10;
        int missingNumber1 = MissingNumber.findMissingNumber(input1, maxNum1);
        assertEquals(8, missingNumber1);
    }

    @Test
    public void testNoMissingNumber() {
        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxNum2 = 10;
        int missingNumber2 = MissingNumber.findMissingNumber(input2, maxNum2);
        assertEquals(0, missingNumber2);
    }

    @Test
    public void testMissingNumberAtEnd() {
        int[] input3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int maxNum3 = 10;
        int missingNumber3 = MissingNumber.findMissingNumber(input3, maxNum3);
        assertEquals(10, missingNumber3);
    }

    @Test
    public void testEmptyArray() {
        int[] input4 = {};
        int maxNum4 = 10;
        int missingNumber4 = MissingNumber.findMissingNumber(input4, maxNum4);
        assertEquals(1, missingNumber4);
    }

    @Test
    public void testLargeMaxNum() {
        int[] input5 = {5, 3, 4, 2, 6};
        int maxNum5 = 1000;
        int missingNumber5 = MissingNumber.findMissingNumber(input5, maxNum5);
        assertEquals(1, missingNumber5);
    }
}
