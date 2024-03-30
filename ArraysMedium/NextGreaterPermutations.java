/*
 * Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the
 *  lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange to the lowest possible order 
(i.e., sorted in ascending order

Input format: Arr[] = {1,3,2}
Output: Arr[] = {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}.
 So, the next permutation just after {1,3,2} is {2,1,3}.

 Find the break-point, i: Break-point means the first index i from the back of the given array where arr[i]
  becomes smaller than arr[i+1].
For example, if the given array is {2,1,5,4,3,0,0}, the break-point will be index 1(0-based indexing).
 Here from the back of the array, index 1 is the first index where arr[1] i.e. 1 is smaller than arr[i+1] i.e. 5.
To find the break-point, using a loop we will traverse the array backward and store the index i where 
arr[i] is less than the value at index (i+1) i.e. arr[i+1].
If such a break-point does not exist i.e. if the array is sorted in decreasing order, 
the given permutation is the last one in the sorted order of all possible permutations.
 So, the next permutation must be the first i.e. the permutation in increasing order.
So, in this case, we will reverse the whole array and will return it as our answer.
If a break-point exists:
Find the smallest number i.e. > arr[i] and in the right half of index i(i.e. from index i+1 to n-1) 
and swap it with arr[i].
Reverse the entire right half(i.e. from index i+1 to n-1) of index i. And finally, return the array.
Note: For a better understanding of intuition, please watch the video at the bottom of the page.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextGreaterPermutations {
    static List<Integer> next(List<Integer> A) {
        // finding the index from last where we got A[i] < A[i+1];
        int n = A.size();
        int index = -1;
        for(int i=n-2;i>=0;i--) {
            if(A.get(i) < A.get(i+1)) {
                index = i;
                break;
            }
        }
        // if index  == -1 , this means that the array is in decreasing order , hence the next permutation 
        // will be reverse of the current array i.e. in ascending order
        if(index == -1) {
            Collections.reverse(A);
            return A;
        }

        // if index!= -1 then we will see the smallest in the rigth part but greater than index and as we know the 
        // the right part is in descending order (as we have checked in above loop by findinf the index) if index to swap it with index
        for(int i=n-1;i>index;i--) {
            if(A.get(i) > A.get(index)){
                // we will swap
                int temp = A.get(i);
                A.set(i,A.get(index));
                A.set(index,temp);
                break;
            }
        }

        // now to make it next permutation , which means the closest number to the current permutation ,
        /// we will reverse the right part of index

        List<Integer> subList = A.subList(index + 1, n);
        Collections.reverse(subList);

        return A;
    }
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> list = next(A);
        for(int i = 0;i<list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
