package arrays;

import java.util.Arrays;

public class Duplicate {
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 5, 1, 6, 5}; // Example array with duplicates
        int[] resultArray = removeDuplicates(inputArray); // Remove duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray)); // Print result
    }
}
