package recursion;

class Print_n_to_1 {
    //Prints numbers n to 1
    static void printNos(int n){
        if(n>0){
            System.out.print(n+" "); //Print first,
            printNos(n-1); //then make recursive calls
        }
        return;
    }
    public static void main(String[] args){
        int n=10;
        printNos(n);
    }
}
/*
This code prints: n, n-1,n-2,....,1
Because the print happens before recursive call.

Logic-:
if n>0, it prints n, then calls itself with n-1.
It keeps calling recursively until n==0
n==0 is the base case-: it stops the recursion
 */
