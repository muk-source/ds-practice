/*
 * 
 * Problem Statement: Given an array that contains only 1 and 0 return the 
 * count of maximum consecutive ones in the array.
 * 
 * Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Input: prices = {1, 0, 1, 1, 0, 1} 

Output: 2

Explanation: There are two consecutive 1's in the array. 

1. we have to find the consecutive ones, so we will declare two varibales with count and max_count
2.we start traversing the array if we find 1 , we increase the count and update the max count by using max function
3.if we find other than 1 then we make count 0 as the chain will break , and we have to start the count once again.
 */

public class MaxConsecutiveOnes {
    static int consecutiveones(int arr[], int n) {
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                max_count = Math.max(count, max_count);
            } else {
                count = 0;
            }
        }
        return max_count;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 0, 1, 1, 0, 1};
        int ans = consecutiveones(arr, arr.length);
        System.out.println("ans " + ans);
    }

}
