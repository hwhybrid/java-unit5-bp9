package com.example.unit_5;

public class BalancedParentheses {

    public static boolean isBalanced(String s) {
        int openCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount == 0) {
                    return false;
                }
                openCount--;
            }
        }

        return openCount == 0;
    }

    public static void main(String[] args) {
        String str1 = "((()))";
        String str2 = "(()))";

        System.out.println(isBalanced(str1)); // true
        System.out.println(isBalanced(str2)); // false
    }
}


// What is the runtime complexity of your solutions for Step 1 and Step 2? See below for solution 1:

// This is the runtime complexity of Solution 1:
        //The isBalanced function has an O(n) run time as it iterates through each member of a string.

// How do the solutions compare to yours? What improvements do you think you could have made to your solution?
    //On the stack:
        // Naming conventions for functions and use of an array in implementation

// How would the implementation of the Stack from Step 3 change if you were to implement a queue?

    // One can create a custom CustomQueue class that uses two instances of CustomStack to mimic the behavior of a queue.


