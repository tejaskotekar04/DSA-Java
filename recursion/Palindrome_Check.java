package recursion;
class Palindrome_Check {
    //Recursive util function to check if a string is a palindrome or not
    static boolean isPalindromeUtil(String s, int left, int right) {
        //Base case
        if (left >= right)
            return true;

        //If the characters at current position are not equal, it is not a palindrome
        if (s.charAt(left) != s.charAt(right))
            return false;

        //Move left pointer to right and right pointer to left
        return isPalindromeUtil(s, left + 1, right - 1);
    }

    //Function to check if a string is a palindrome
    static boolean isPalindrome(String s){
    int left = 0, right = s.length() - 1;
    return isPalindromeUtil(s, left, right);
}

public static void main(String[] args){
        String s = "abba";
        if(isPalindrome(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



