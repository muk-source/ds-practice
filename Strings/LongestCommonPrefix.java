/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Approach 
we have to get the common prefix so we will first take the first string of the array as commom prefix
Now we will traverse the array from 1 to length and check if our firstString is present in other String 
for example we will check first "flower" in "flow" , since it is not present , we keep on decreasing the 
size of the prefix , in the next turn "flower" becomes "flowe" then "flow" now :"flow is present in
 second string but not in third so we will keep on decreasing the lenght so :"flow" becomes "flo"
 and finally it becomes "fl"
 this happens because of the "indexOf" method in string , it looks for string in another string 
 */

public class LongestCommonPrefix {
    public static String longestPrefix(String strs[]){
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++) {
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        String ans = longestPrefix(strs);
        System.out.println(ans);

    }
}
