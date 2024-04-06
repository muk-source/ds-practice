/*
 * 1903. Largest Odd Number in String

You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string)
 that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
Example 3:

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.

Approach is very simple , we will traverse the array from backwards ,since we have to get the largest odd possible
so if the last digit of any number is odd , the whole number is odd , hence we check from backwards
if the digit is odd then we can return the substring from starting to that index.
 */
public class LargestOddNumberInString {
    public static String largestOdd(String num) {
        for(int i=0;i<num.length();i++) {
            int digit = num.charAt(i) - '0'; // to change the char into integer
            if(digit%2!=0) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String num = "52";
        String ans = largestOdd(num);
        System.out.println("ans:"+ ans);
    }
}
