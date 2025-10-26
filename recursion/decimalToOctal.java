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
        if(decimal == 0){
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
