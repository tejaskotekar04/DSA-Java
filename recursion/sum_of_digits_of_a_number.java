package recursion;

class sum_of_digits_of_a_number {

    //function to check the sum of all the digits
    static int sum(int num){
        if(num==0)
            return 0;
        return(num % 10 + sum(num/10));
    }

    //Driver program to check above
    public static void main(String[] args){
        int number=38;
        int result=sum(number);
        System.out.println(result);
    }
}
