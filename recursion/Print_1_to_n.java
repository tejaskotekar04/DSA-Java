//Print 1 to n without using loops.
//To solve the problem without using loops, you can use recursion.
// You define a function that takes a counter as an argument and prints its value.
// Then, the function calls itself, passing an incremented counter as the argument.
// This continues until the counter reaches a certain limit, at which point a base case stops the recursion.
class Print_1_to_n {
    static void printNos(int n) {
        if (n > 0) {
            printNos(n - 1); //Recursive call first
            System.out.print(n + " ");//Print after recursive returns
        }
    }
        public static void main(String[] args){
            int n=10;
            printNos(n);
        }
}

//Base case: if (n > 0) - keeps calling the function until n becomes 0.
//When n = 0, it stops calling and starts returning.

/*Example-: printNos(3)
//Function calls-:
printNos(3)
  ↳ printNos(2)
       ↳ printNos(1)
            ↳ printNos(0) → STOP (base condition met)

            Now it prints during the return:

printNos(0) → nothing happens
printNos(1) → prints 1
printNos(2) → prints 2
printNos(3) → prints 3

Final output-: 1 2 3

Because:
The recursive call goes down to 0 (base case),then prints on the way back up.
 */

