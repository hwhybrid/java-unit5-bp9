package com.example.unit_5;

public class MissingNumberSolution2 {
    public static int findMissingNumber(int[] nums, int maxNum) {
        // Calculate the expected sum of numbers from 1 to maxNum
        // This uses the standard math formula for calculating the sum of a series of consecutive numbers in range from 1 to n.
        // ***This will not work if the numbers are not consecutive, so I am operating under the assumption that they are.
        int expectedSum = (maxNum * (maxNum + 1)) / 2;

        // Calculate the actual sum of the numbers in the input array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] input = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missingNumber = findMissingNumber(input, maxNum);

        System.out.println("The missing number is: " + missingNumber);
        System.out.println("The space complexity is: O(1)");
        System.out.println("The time complexity is O(n log n)");
    }
}


// My approach matches the alternate solution that was presented except for the fact that I did not use streams or import anything for my solution.