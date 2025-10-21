class palindrome {
    public boolean isPalindrome(int x) {
        if(x<0 ||(x%10==0 && x !=0)){
            return false;
        }
        int reversedHalf=0;
        while(x>reversedHalf){
            reversedHalf= reversedHalf * 10 + x % 10;
            x /=10;
        }
        return x== reversedHalf || x ==  reversedHalf /10;
        
    }
   
        public static void main(String[] args) {
            palindrome solution = new palindrome();
            
            // Test cases
            int num1 = 121;
            int num2 = -121;
            int num3 = 10;
            int num4 = 12321;
    
            System.out.println(num1 + " is palindrome? " + solution.isPalindrome(num1)); // true
            System.out.println(num2 + " is palindrome? " + solution.isPalindrome(num2)); // false
            System.out.println(num3 + " is palindrome? " + solution.isPalindrome(num3)); // false
            System.out.println(num4 + " is palindrome? " + solution.isPalindrome(num4)); // true
        }
    
    
}
