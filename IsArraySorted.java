/* Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. 
If the array is sorted then return True, Else return False.

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.

Example 2:
Input: N = 5, array[] = {5,4,6,7,8}
Output: False.

1.Start traversing the whole array with for loop starting with index 1
2.Compare each array element with its previous element , if the previous element is larger than the current element 
then we can say that array is not sorted and return  false
3. if the whole array traverses successfully then we can return true .
*/

public class IsArraySorted {
    static boolean isSorted(int arr[] , int n) {
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int arr[] = {5,4,6,7,8};
        boolean value = isSorted(arr,arr.length);
        System.out.println("ans "+ value);
    }
}
