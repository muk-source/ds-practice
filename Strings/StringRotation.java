/*
 * 

 Given two strings s and goal, return true if and only if s can become goal after some number of shifts
  on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false

There are two approaches
First approach-->
this is very simple approach , first we compare the length of two string , if they are not equal 
then we return false, other wise we run a for loop till the length and rotate the string anc check if it 
is equal and return true if we find one otherwise return fasle.

Second approach 
second approach is also easy , so we first check the lenght and then if the "goal" is roattion of string
then if we add the "s" string with itself , then there must be "goal in it and we check it by using indexOf operator."
  */

public class StringRotation { 
    public static boolean stringRotate(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++) {
            if(s.equals(goal)){
                return true;
            }
            s = rotate(s);
        }
        return false;
    }
    public static String rotate(String s) {
        char ch[] = s.toCharArray();
        char temp = ch[0];
        for(int i=0;i<ch.length-1;i++) {
            ch[i] = ch[i+1];
        }
        ch[ch.length-1] = temp;
        return new String(ch);
    }

    public static boolean stringRotate2(String s , String goal) {
        if(s.length() == goal.length() && (s+s).indexOf(goal)!=-1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) { 
        String s = "abcde";
        String goal =  "abced";
        boolean ans = stringRotate(s,goal);
        boolean  ans2 = stringRotate2(s,goal);
        System.out.println("ans:"+ans);
        System.out.println("ans2:"+ ans2);
    
        
    }
}
