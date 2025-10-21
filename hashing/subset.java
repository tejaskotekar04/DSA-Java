/*Check if an array is subset of another array
 * Given two arrays a[] and b[] of size m and n respectively, 
 * the task is to determine whether b[] is a subset of a[]. 
 * Both arrays are not sorted, and elements are distinct.
 */
public class subset {
    public static boolean isSubset(int[] a, int[] b){
        int m=a.length, n=b.length; //Get array lengths

        //Outer loop
        for(int i=0; i<n; i++){ //Iterates through each element in array 'b'
            boolean found = false;

            //Inner loop
            for(int j=0; j<m; j++){ //For each element in 'b', searches for it in array 'a'
                if(b[i] == a[j]){
                    found = true;
                    a[j] = -1; //mark as visited
                       break; //exit inner loop
                }
            }
            if(!found) // if element not found, not a subset
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a ={11,1,13,21,3,7};
        int[] b={11,3,7,1};

        if(isSubset(a, b)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
/*
 * Why We Need a[j] = -1 (Marking)?
The marking prevents the same element in array 'a' 
from being matched multiple times.
Example : Without Marking (Wrong Approach)
Let's say we have:
a = {5, 10, 15}
b = {10, 10} (b has duplicate 10s)

Question: Is 'b' a subset of 'a'?
Expected Answer: NO (because 'a'has only one 10, but 'b' needs two 10s)
Without marking, here's what happens:
for (int i = 0; i < n; i++) {
    boolean found = false;
    for (int j = 0; j < m; j++) {
        if (b[i] == a[j]) {
            found = true;
            // NO MARKING HERE
            break;
        }
    }
    if (!found) return false;
}

Execution:
i=0: Looking for b[0] = 10
  j=0: a[0]=5,  10==5?  NO
  j=1: a[1]=10, 10==10? YES! found=true, break
  Array a remains: {5, 10, 15}

i=1: Looking for b[1] = 10
  j=0: a[0]=5,  10==5?  NO  
  j=1: a[1]=10, 10==10? YES! found=true, break
  Array a remains: {5, 10, 15}

Result: true (WRONG! The same 10 was used twice)

With Marking a[j] = -1,
Execution:
i=0: Looking for b[0] = 10
  j=0: a[0]=5,  10==5?  NO
  j=1: a[1]=10, 10==10? YES! found=true
  a[1] = -1 (mark as used)
  Array a becomes: {5, -1, 15}
  break

i=1: Looking for b[1] = 10
  j=0: a[0]=5,   10==5?  NO
  j=1: a[1]=-1,  10==-1? NO
  j=2: a[2]=15,  10==15? NO
  End of inner loop, found=false

Result: false (CORRECT! Second 10 not found)
 */


