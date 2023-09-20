package com.example.unit_5;
import java.util.HashSet;

public class MissingNumber {
// The Problem
// Imagine a list of numbers from 1 to max_num, inclusive - except that one of these numbers will be missing from the list.
// Write a function that takes this list of numbers, as well as the max_num, and it should return the missing number.
// For example, given a list of numbers, in random order, of 1…10, 8 was removed.
// If this list and the maxNum of 10 was passed into the function, it would return 8: missingNumber({2, 1, 4, 3, 6, 5, 7, 10, 9}, 10) ⇒ 8
// If there is no missing number, the function should return 0.

        public static int findMissingNumber(int[] nums, int maxNum) {
            HashSet<Integer> numSet = new HashSet<>();

            // First add all numbers from the input array to the HashSet
            for (int num : nums) {
                numSet.add(num);
            }

            // Check each number by iterating through from 1 to maxNum to find the missing one
            // This is what makes the solution O(N)
            for (int i = 1; i <= maxNum; i++) {
                if (!numSet.contains(i)) {
                    return i;
                }
            }

            // If no missing number is found, return 0
            return 0;
        }

        public static void main(String[] args) {
            int[] input = {2, 1, 4, 3, 6, 5, 7, 10, 9};
            int maxNum = 10;
            int missingNumber = findMissingNumber(input, maxNum);

            System.out.println("The missing number is: " + missingNumber);
            System.out.println("The time complexity is O(N)");
        }

}

    // My use of a hash set rather than a set is slightly different from the solution shown for step 1.
    // However, the approach is more or less the same. I did not use the java.util.stream.Collectors .
    // It's cool to see the different ways the same thing can be achieved.

