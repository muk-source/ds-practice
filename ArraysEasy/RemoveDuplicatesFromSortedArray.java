/*
Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.
 * Example 1: 

Input: arr[1,1,2,2,2,3,3]

Output: arr[1,2,3,_,_,_,_]

Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2: 

Input: arr[1,1,1,2,2,3,3,3,3,4,4]

Output: arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

HashSet Approach
1. We take hashset becuase it contains only unique elements
2. we traverse the whole array and put all elements in hashset.
3. return the size of the hashset , it will have only the unique elemets 
4. But it will take  O(N*logN)+ O(n)
5.so will take a two pointer approach problem 
6.Take a variable i as 0;
7.Use a for loop by using a variable ‘j’ from 1 to length of the array.
8.If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
9. After completion of the loop return i+1, i.e size of the array of unique elements.
 */

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

    static int removeDuplicates(int arr[] , int n) {
        HashSet<Integer> numberSet = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
            numberSet.add(arr[i]);
        }
        return numberSet.size();
    }
    static int removeDuplicates2(int arr[] , int n) {
        int i = 0;
        for(int j=1;j<n;j++) {
            if(arr[i]!=arr[j]) {
                i++;
                arr[i] = arr[j]; 
            }
        }
        return i+1;
    }
    public static void main(String args[]) {
        int arr[] = {1,1,2,2,2,3,3};
        int ans = removeDuplicates(arr,arr.length);
        int ans2 = removeDuplicates2(arr,arr.length);
        System.out.println("ans" + ans);
        System.out.println("second ans " + ans2);

    }
}
