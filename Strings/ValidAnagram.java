/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Apporach is simple ,
1. We will take a frequency array to count the each cahracters
2. Now two strings are anagram if they have same frequency 
3. We can do this by using one single array by increasing the count of each character in ist iteration 
and then decreasing the count in second loop .
4 Now we will check the array if evenry element in array is 0 then we can return true otherwise false
 */

public class ValidAnagram {
    public static boolean validAnagram(String s , String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length()!=t.length()){
            return false;
        }
        int frequency[] = new int [26];
        for(int i=0;i<s.length();i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++) {
            frequency[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<frequency.length;i++) {
            if(frequency[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = validAnagram(s,t);
        System.out.println("ans:"+ans);
    }
}
