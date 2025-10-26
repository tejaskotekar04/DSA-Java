/*Given a string s, the task is to find the minimum number of characters
 to be inserted to convert it to a palindrome*/
/*Example-:Input: s = "geeks"
Output: 3
Explanation: "skgeegks" is a palindromic string, which requires 3 insertions.*/

class Form_a_palindrome {
//Recursive function to find minimum number of insertions
    static int minRecur(String s, int l, int h) {

        //Base case
        if (l >= h)
            return 0;

        //if the first and last characters are same, then no need to insert element
        if (s.charAt(l) == s.charAt(h)) {
            return minRecur(s, l + 1, h - 1);
        }
        //Insert at beginning or at end
        return Math.min(minRecur(s, l + 1, h),
                minRecur(s, l, h - 1)) + 1;
    }
    static int findMinInsertions(String s) {
        return minRecur(s, 0, s.length() - 1);
    }
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(findMinInsertions(s));
    }
}
