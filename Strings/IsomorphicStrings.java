/*
 * 205. Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true


Approach -> so we have to map each character from one string to another String and mapping should be 
from both sides and thats why while using one HashMap at first we are checking the mappping from first String
in second while taking the key and in else block we are checking teh mapping from second string in first
for ex s = paper , t=title
p->t
a->i
p->t
e->l
r->e 
 
check this ->https://w3resource.com/java-exercises/basic/java-basic-exercise-185.php
 */

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean check(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> cmap = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(cmap.containsKey(schar)){ // checking if s exist in map , if yes then we will check its correspong t matches with t char
                if(cmap.get(schar)!=t.charAt(i)){
                    return false;
                }
            }else {
                if(cmap.containsValue(tchar)){
                    return false;
                }
                cmap.put(schar,tchar);
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        boolean ans = check(s,t);
        System.out.println("ans:"+ans);

    }
}
