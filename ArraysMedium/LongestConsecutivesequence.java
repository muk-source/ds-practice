/*
 * Problem Statement: You are given an array of ‘N’ integers.
 *  You need to find the length of the longest sequence which contains the consecutive elements.
 * Example 1:

Input: [100, 200, 1, 3, 2, 4]

Output: 4

Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

Input: [3, 8, 5, 7, 6]

Output: 4

Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.

ist apporahc is simple , we will take the array element and now will look for arrayelement+1 in array
doing the linear search , if we find that then we increase the count .At last compare the ;ongest and count 
and returnthe lonegst 

second approach is we first sort the array and then we will have certain conditopn
one conditon is lastSmaller which is used to find teh consecutive sequence , 
if lastSmaller = arr[i] - 1 then we increase the count  and if last Smaller  == arr[i] whcih measn same element
is gets repeated so we do nothing but when lastSmaller != arr[i] , then we resatrt the count  to 1 and update the 
last Samller.
 */

import java.util.Arrays;

public class LongestConsecutivesequence {
    static boolean search(int arr[],int x) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
                return true;
            }

        }
        return false;
    }
    static int longestsequence(int arr[]) {
        int longest = 1;
        

        for(int i=0;i<arr.length;i++) {
            int x = arr[i];
            int count = 1;
            while(search(arr,x+1) == true) {
                x = x+1;
                count+=1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }

    static int optimalSolution(int arr[]) {
        int count = 1;
        int longest = 1;
        int lastSmaller = Integer.MAX_VALUE;
        Arrays.sort(arr); // sort
        for(int i=0;i<arr.length;i++) {
            if(arr[i] - 1 == lastSmaller) {
                count = count + 1;
                lastSmaller = arr[i];
            }else if(lastSmaller != arr[i]) {
                count = 1;
                lastSmaller=arr[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] ={100, 200, 1, 3, 2, 4};
        int ans = longestsequence(arr);
        int ans2 = optimalSolution(arr);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
