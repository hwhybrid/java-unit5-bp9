package com.example.unit_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsTest {

    @Test
    public void testBalancedString1() {
        String string1 = "{[()]}";
        assertTrue(BalancedBrackets.isBalanced(string1));
    }

    @Test
    public void testUnbalancedString1() {
        String string2 = "{[()]})";
        assertFalse(BalancedBrackets.isBalanced(string2));
    }

    @Test
    public void testUnbalancedString2() {
        String string3 = "{[<]}";
        assertFalse(BalancedBrackets.isBalanced(string3));
    }

    @Test
    public void testNoBrackets() {
        String string4 = "abc";
        assertTrue(BalancedBrackets.isBalanced(string4));
    }

    @Test
    public void testEmptyString() {
        String string5 = "";
        assertTrue(BalancedBrackets.isBalanced(string5));
    }

    @Test
    public void testNestedBrackets() {
        String string6 = "{[()]}{}";
        assertTrue(BalancedBrackets.isBalanced(string6));
    }

    @Test
    public void testMissingClosingBracket() {
        String string7 = "{[()]";
        assertFalse(BalancedBrackets.isBalanced(string7));
    }

    @Test
    public void testMissingOpeningBracket() {
        String string8 = "([)]";
        assertFalse(BalancedBrackets.isBalanced(string8));
    }
}
