/*
 * Given an array nums, return true if the array was originally sorted in non-decreasing order,
 *  then rotated some number of positions (including zero). Otherwise, return false.
 * Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:

Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 

approach is simple , so we have to check if array is sorted
there can be some cases
1. if the array is sorted like arr = 1,2,3,4,5 --> we will return true in this case
2. one case is that array was sorted but now it has made some rotations like  3,4,5,1,2 , so 
    if we rotate back from 1 then the array will become 1,2,3,4,5
    in sorted and rotated array , we know that there will be one pivot element which will be smaller than its
    previous element , and it will be only one or no one { 1,2,3,4,5--> in this case}.
    so we will track this by count and if count<=1 , we will return true otherwise return false.
 */

public class IsArraySortedAndRotated {
    static boolean check(int arr[]){
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }

        if(arr[arr.length-1]>arr[0]){
            count++;
        }

        if(count>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        boolean ans = check(arr);
        System.out.println(ans);
    }
}
