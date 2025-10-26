
class SumOfArrayElements {

//Recursive method to find the sum
    static int recSum(int[] arr, int n) {
        if (n <= 0) //base case
            return 0;
        return recSum(arr, n - 1) + arr[n - 1];
    }

    //Helper method to start recursion
static int arraySum(int[] arr){
    return recSum(arr, arr.length);
        }
public static void main(String[] args){
    int[] arr={1,2,3,4};
    System.out.println(arraySum(arr));
        }
    }

    /*The recSum function calculates the sum of first n elements of array.
    What's happening?
    n keeps getting reduce by 1 with each recursive call
    The base case is when n<=0, return 0.
    Then,it adds arr[n-1] to the result of recSum(arr, n-1)

    Example-: Array arr=[1,2,3,4]
    Length n=4
    Call:recSum(arr,4)

Recursive Calls:
recSum(arr, 4)
  = recSum(arr, 3) + arr[3] -> recSum(arr, 3) + 4
      = recSum(arr, 2) + arr[2] -> recSum(arr, 2) + 3
          = recSum(arr, 1) + arr[1] -> recSum(arr, 1) + 2
              = recSum(arr, 0) + arr[0] -> recSum(arr, 0) + 1
                  = 0+1 (Base case: recSum(arr, 0) = 0)
                  =1

Now it returns back:
recSum(arr, 1) = 1
→ recSum(arr, 2) = 1 + 2 = 3
→ recSum(arr, 3) = 3 + 3 = 6
→ recSum(arr, 4) = 6 + 4 = 10

Final Answer: 10
     */


