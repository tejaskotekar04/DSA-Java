/*
Given two arrays, a and b of equal length. The task is to determine if the given arrays are equal or not. 
Two arrays are considered equal if:
1) Both arrays contain the same set of elements.
2) The arrangements (or permutations) of elements may be different.
3) If there are repeated elements, the counts of each element must be the same in both arrays.
 */
import java.io.*;
import java.util.*;

class equal {

    public static boolean checkEqual(int a[], int b[]) {
        int n = a.length, m = b.length;
        if (n != m)
            return false;

        Map<Integer, Integer> map
            = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) == null)
                map.put(a[i], 1);
            else {
                count = map.get(a[i]);
                count++;
                map.put(a[i], count);
            }
        }

        for (int i = 0; i < n; i++) {

            if (!map.containsKey(b[i]))
                return false;

            if (map.get(b[i]) == 0)
                return false;

            count = map.get(b[i]);
            --count;
            map.put(b[i], count);
        }

        return true;
    }

    public static void main(String[] args) {
        int a[] = { 3, 5, 2, 5, 2 };
        int b[] = { 2, 3, 5, 5, 2 };

        if (checkEqual(a, b))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

/*
Use of a hash map to count the occurrences of each element in one array 
and then verifying these counts against the second array.
 */