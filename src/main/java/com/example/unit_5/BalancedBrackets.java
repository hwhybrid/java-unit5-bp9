package com.example.unit_5;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpeningBracket(c)) {
                stack.push(c);
            } else if (isClosingBracket(c)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '{' || c == '[' || c == '<';
    }

    private static boolean isClosingBracket(char c) {
        return c == ')' || c == '}' || c == ']' || c == '>';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '<' && close == '>');
    }

    public static void main(String[] args) {
        String string1 = "{[()]}";
        String string2 = "{[()]})";
        String string3 = "{[<]}";
        String string4 = "abc";

        System.out.println(isBalanced(string1)); // true
        System.out.println(isBalanced(string2)); // false
        System.out.println(isBalanced(string3)); // false
        System.out.println(isBalanced(string4)); // true (no brackets)
    }
}


// This is the runtime complexity of Solution 2:
        // The isBalanced function has an O(n) run time as it iterates through each member of a string.