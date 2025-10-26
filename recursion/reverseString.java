

class reverseString {
    public static String reverse(String str){
        if(str.isEmpty()) //Base Case
            return str;
        return reverse(str.substring(1)) + str.charAt(0);

    }
    public static void main(String[] args){
        String str="Tejas Kotekar";
        System.out.println(reverse(str));
    }
}
/*
Base Case:
If the string is empty (str.isEmpty()), return the empty string.

Recursive Case:
Take the substring from index 1 to end: str.substring(1)
Call reverse(...) on it
Then add the first character (charAt(0)) to the end

Example: reverse("abc")
Initial Call:reverse("abc")

1st call: reverse("abc")
→ reverse("bc") + 'a'

2nd call: reverse("bc")
-> reverse("c") + 'b'

3rd call: reverse("c")
→ reverse("") + 'c'

Base Call:reverse("")
→ returns ""

Now we return back:
reverse("c")     → "" + 'c' = "c"
reverse("bc")    → "c" + 'b' = "cb"
reverse("abc")   → "cb" + 'a' = "cba"

Methods Explanation:
str.isEmpty()
Checks if the string is "" (length 0).
This acts as the base condition to stop recursion.

str.substring(1)
Returns the string without the first character.
Example: "Tejas".substring(1) → "ejas"

str.charAt(0)
Gets the first character of the string.
Example: "Tejas".charAt(0) → 'T'
 */
