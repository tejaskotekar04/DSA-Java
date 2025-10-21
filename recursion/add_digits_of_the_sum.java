//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
package recursion;
class add_digits_of_the_sum {
    public static int addDigits(int num) {

        //loop until the number becomes less than 10 (i.e., a single digit).
        while(num >= 10) {
             int sum=0;

            //break the number of digits and add them
             while(num>0){
                 sum+=num%10; //Add the last digit
                 num/=10; //Remove the last digit
             }
             num = sum; //Update num with the sum of the digits
        }
        return num;
    }
    public static void main(String[] args){
        System.out.println(addDigits(38));
    }
}
/*
Example: num = 38
Initial value:
num = 38
1st Outer While Loop (num >= 10 is true)
sum = 0;

Inner While Loop (num > 0 is true):
num = 38
sum = 0 + (38 % 10) = 0 + 8 = 8
num = 38 / 10 = 3
num = 3
sum = 8 + (3 % 10) = 8 + 3 = 11
num = 3 / 10 = 0 → Exit inner loop

Now update:
num=11
2nd Outer While Loop (num >= 10 is still true)
sum = 0;

Inner While Loop:
num = 11
sum = 0 + (11 % 10) = 0 + 1 = 1
num = 11 / 10 = 1
num = 1
sum = 1 + (1 % 10) = 1 + 1 = 2
num = 1 / 10 = 0 → Exit inner loop

Now update:
num=2
 */