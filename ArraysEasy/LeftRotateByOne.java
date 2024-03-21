/*
 * Given an array of N integers, left rotate the array by one place.
 * Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1

1. since we have to rotate by just one place , we can store the first index value in a variable.
2. then  we traverse the array from 0th index to <n-1 , thats becasue we are doing arr[i] = arr[i+1] , so that
the array size does not give error.
3 then we store the first index value to the last index 
4. we get the rotated array by one place.
 */

public class LeftRotateByOne {
    static int[] rotate(int arr[],int n) {
        int firstValue = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstValue;
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int ans [] = rotate(arr,arr.length);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
