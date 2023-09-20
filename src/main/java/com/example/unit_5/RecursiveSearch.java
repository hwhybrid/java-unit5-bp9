package com.example.unit_5;

public class RecursiveSearch {

    public static int recursiveSearch(String item, String[] items) {
        return recursiveSearchHelper(item, items, 0); //Helper function to start the search at index 0
    }

    private static int recursiveSearchHelper(String item, String[] items, int index) {
        // Base case: If one reaches the end of the array without finding the item, return -1
        if (index >= items.length) {
            return -1;
        }

        // Check if the current element is equal to the sought item
        if (items[index].equals(item)) {
            return index;
        }

        // Recursively search the rest of the array
        return recursiveSearchHelper(item, items, index + 1);
    }

    public static void main(String[] args) {
        String[] arr = {"hey", "there", "you"};

        int index1 = recursiveSearch("hey", arr);
        int index2 = recursiveSearch("porcupine", arr);

        System.out.println(index1); // Output: 0
        System.out.println(index2); // Output: -1
    }
}

// The worst-case scenario is that one would have to got through every element to check. So the runtime is O(N)