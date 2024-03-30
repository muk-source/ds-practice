/*
 * Variety-1
when positive is equal to negative elements in array
Problem Statement:

There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
 Without altering the relative order of positive and negative elements, you must return an array of 
 alternately positive and negative values.

Note: Start the array with positive elements.
ist approach is very simple segregate the numbers into two arrays one is pos and other is neg
then loop over the lenght of array /2 and now fill the original array by placing pos elemtns from pos array at
even index and neg elements at odd index.
time complexity is O(n) 
space compexity is O(n)

----------------------------------------------------------------------------------------------------
when postive and negative are not equal
Variety-2
Problem Statement:
There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values. 
The leftover elements should be placed at the very end in the same order as in array A.
 */

import java.util.ArrayList;

public class AlternateNumbers {
    static int[] alternate(int arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0) {
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length/2;i++) {
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }

    static int[] alternate2(int arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0) {
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }

        if(pos.size() < neg.size()) {
            for(int i=0;i<pos.size();i++) {
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = 2*pos.size();
            for(int i=pos.size();i<neg.size();i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }else{
            for(int i=0;i<neg.size();i++) {
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = 2*neg.size();
            for(int i=neg.size();i<pos.size();i++) {
                arr[index] = pos.get(i);
                index++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};
        int arr2[] = {1,2,-3,-1,-2,-3};
        int ans[] = alternate(arr);
        int ans2[] = alternate2(arr2);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<ans2.length;i++) {
            System.out.print(ans2[i] + " ");
        }
    }
}
