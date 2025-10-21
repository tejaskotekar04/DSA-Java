public class hashTable {
	private static final int MAX=1000;
    private static boolean[][] HashTable  = new boolean[MAX + 1][2];

 // Search method to find if element exists
    public static boolean search(int x) {
        if (x >= 0) {
            return HashTable[x][0];
        } else {
            x = Math.abs(x);
            return HashTable[x][1];
        }
    }
    
    // Insert method to add elements to hash table
    public static void insert(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                HashTable[a[i]][0] = true;
            } else {
                HashTable[Math.abs(a[i])][1] = true;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {-1, 9, 2, -5, 3, 1};
        int n = arr.length;
        
        insert(arr, n);
        
        int find = -1;
        if (search(find)) {
            System.out.println("Element is present");
        } else {
            System.out.println("Element is not present");
        }
    }
}
