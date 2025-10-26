//program to find factorial of a number
class recursion1 {

    //method to find factorial
    static int factorial(int n) {
        int rec = 1;
        for (int i = 2; i <= n; i++) {
            rec *= i;
        }
            return rec;
        }

        public static void main (String[]args){
            int num = 4;
            System.out.println("Factorial of " + num + " is " + factorial(4));
        }
    }
/*The idea is simple, we initialize result as 1. Then run a loop from 1 to n and multiply every number with n.

Illustration for n = 4
Initialize rec = 1
Run a loop for i = 2 to 4
i = 2 :  rec = rec * 2 = 2
i = 3 :  rec = rec * 3 = 6
i = 4 :  rec = rec * 4 = 24
 */


