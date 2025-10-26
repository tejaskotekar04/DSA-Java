/*
Prema is fascinated by number conversions and wants to build a program to convert decimal numbers to octal numbers. 
She needs your help to write the program using recursion.
Write a program to help Prema convert a given decimal number to its octal representation.
Example -:
Input:
200
Output:
310

Explanation -:
If the decimal number 200 has to be converted to octal, 
200/8=25, remainder 0
25/8, remainder 0
3/8, remainder 
The equivalent octal number of the decimal number 200 is 310.
Function specifications: int decimalToOctal(int decimal);
 */
import java.util.Scanner;
public class decimalToOctal {
    //Recursive function to convert decimal to octal
    static int DecimalToOctal(int decimal){
        if(decimal == 0){ //Base case
            return 0;
        }
        //Recursively divide the number by 8 and append remainder 
        return DecimalToOctal(decimal / 8) * 10 + decimal % 8;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt(); //Input decimal number
        int octal = DecimalToOctal(decimal); //Function call to convert decimal to octal
        System.out.println(octal);    
        sc.close();
    }
}

/*
An octal number is a number in a base-8 system that uses only the digits 0, 1, 2, 3, 4, 5, 6, and 7. 
Each position in an octal number represents a power of 8, similar to how the decimal system uses powers of 10.

If decimal number 200 has to be converted to octal,
Step 1-:
200/8=25, remainder 0
Now decimal number is 25
Step 2-:
25/8=3, remainder 1
Now decimal number is 3
Step 3-:
3/8=0, remainder 3
Now decimal number is 0, so we stop here.
Now, reading the remainders from bottom to top, we get 310.
The equivalent octal number of the decimal number 200 is 310.

We go reverse (bottom to top) because each remainder represents digits from least significant to most significant, 
and recursion (or a stack) naturally reverses that order when unwinding.

Remainder 0 is the least significant digit (rightmost), and remainder 3 is the most significant digit (leftmost).
0 will be at the unit place(8^0), 1 at the eight's place(8^1), and 3 at the sixty-four's place(8^2) in the octal number 310.
 */
