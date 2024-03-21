// Problem Statement: Given an array, we have to find the largest element in the array.


/* 
 Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.
*/

/* 
 1. Create a max variable initialize with Integer.MIN_VALUE
 2. Use the for loop and interate every element of array
 3.Compare each element of array with the max value , if the array element is larger than the max value
   then update the max variable with that array value.
 4. At last , return the max value.
*/
class LargestElement {
    static int getLargest(int arr[] , int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]) {
        int arr [] = {2,5,1,3,0};
        int ans = getLargest(arr,arr.length);
        System.out.println("ans "+ ans);
    }

}