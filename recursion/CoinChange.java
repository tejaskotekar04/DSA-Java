/*
Given an integer array of coins of size N representing different types of currency and an integer sum M. 
The task is to find the number of ways to make the sum by using different combinations from the coins array, using recursion.
Function specifications: int count ways(int [], int, int)
Input format -:
The first line of input consists of the number of coins N.
The second line consists of N integers denoting the coin denominations.
The third line consists of the integer sum M to be produced with those coins.

Output format-:
The output displays the number of ways to make the sum by using different combinations from the coins array.

Input -:
3
1 2 3
4
Output -:
4
 */
import java.util.Scanner;

public class CoinChange {
    //Recursive function to count ways 
    static int countWays(int[] coins, int n, int sum){
        //Base case: if sum is 0, there is 1 way (use no coin)
        if(sum == 0){
            return 1;
        }
        //If sum becomes negative or no coins left, no solution
        if(sum < 0 || n<=0){
            return 0;
        }
        //Two options: include the last coin or exclude it
        return countWays(coins, n-1, sum) + countWays(coins, n, sum - coins[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt(); //Number of coins
        int[] coins = new int[N];
        for(int i = 0; i< N; i++){
            coins[i] = sc.nextInt(); //Coin denominations
        }
        int M = sc.nextInt(); //Target sum

        int ways = countWays(coins, N, M);
        System.out.println(ways); //Output the number of ways
        sc.close();
    }
}
