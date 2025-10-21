/*Python program to check if the given arrays are disjoint ,
i.e., there is no element common in both arrays using hashing*/

import java.util.HashSet;

public class DisjointArrays {
    
    // Function to check if two arrays are disjoint
    static boolean areDisjoint(int[] a, int[] b) {
        // Create a HashSet to store elements of array 'a'
        HashSet<Integer> set = new HashSet<>();

        // Insert all elements of 'a' into the set
        for (int num : a) {
            set.add(num);
        }

        // Check for common elements in 'b'
        for (int num : b) {
            if (set.contains(num)) {
                return false; // Found a common element
            }
        }

        // No common elements found
        return true;
    }

    // Main method
    public static void main(String[] args) {
        int[] a = {12, 34, 11, 9, 3};
        int[] b = {7, 2, 1, 5};

        if (areDisjoint(a, b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

/*
We use a HashSet<Integer> to store all elements of array a.

Then, we loop through array b and check if any element already exists in the set.

If found → arrays are not disjoint → return false.

Otherwise → they are disjoint → return true.
*/