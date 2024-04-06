/*
 * 344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

class ReverseString {
    static char[] reverse(char ch[]){
        int left = 0;
        int right = ch.length - 1;
        while(left<=right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return ch;
    }
    public static void main(String[] args) {
        char ch[] = {'h','e','l','l','o','w'}; // single quotes for char and double quotes for string
        char ans[] = reverse(ch);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }


    }
}