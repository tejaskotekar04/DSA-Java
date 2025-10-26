public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
            return n == 1;
        }

        public static void main (String[] args){
            int n = 8;
            boolean result = isPowerOfTwo(n);
            System.out.println(n + " is power of two? " + result);
        }
    }

/*
Goal-:
We want to check if a number n is a power of 2 (like: 1, 2, 4, 8, 16, 32, 64, etc.)
That means we keep dividing n by 2 until we can't anymore.
If we finally get n == 1, then it's a power of 2.

Example 1: n = 8
Let’s follow the code step-by-step:
n = 8 → it's greater than 0, so move on.
8 % 2 == 0 → true, so divide: n = 8 / 2 = 4
4 % 2 == 0 → true, so divide: n = 4 / 2 = 2
2 % 2 == 0 → true, so divide: n = 2 / 2 = 1
1 % 2 == 0 → false, exit loop
return n == 1 → true
So, 8 is a power of 2.

Example 2: n = 10
n = 10 → greater than 0
10 % 2 == 0 → true, divide: n = 10 / 2 = 5
5 % 2 == 0 → false, exit loop
return n == 1 → false
So, 10 is not a power of 2.

Summary:
The loop keeps dividing n by 2 as long as it's even.
If you finally reach 1, it means it was only divisible by 2 → so it is a power of 2.
If you end up with anything else → not a power of 2.

Why return function is outside the loop?
The while loop only reduces the number.
We don't want to return inside the loop, because we don’t know yet if it's a power of 2.
Only after the loop, we check:
If we reached n == 1, it's a power of 2
If not, it's not.
 */

