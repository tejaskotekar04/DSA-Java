package sorting;
public class Merge {

    // Main merge sort function
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            // Recursively sort left half
            mergeSort(arr, l, mid);

            // Recursively sort right half
            mergeSort(arr, mid + 1, r);

            // Merge the two sorted halves
            merge(arr, l, mid, r);
        }
    }

    // Merge function to merge two sorted halves
    public static void merge(int[] arr, int l, int mid, int r) {
        // Sizes of two subarrays
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Temporary arrays
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            rArr[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                k++;
                i++;
            } else {
                arr[k] = rArr[j];
                k++;
                j++;
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = lArr[i];
            k++;
            i++;
        }
        while (j < n2) {
            arr[k] = rArr[j];
            k++;
            j++;
        }
    }

    // Main method to run the code
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Before sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
