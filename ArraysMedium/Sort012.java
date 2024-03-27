/*
 * 
 * ist apporach is very simple just sort the array by any method like Arrays.sort() and we get the ans
 * but this would take O(N*log N)
 * 
 * second apporach is we take three variables with like count0 ,count1,count2 and traverse the array once
 * and increase the count . Then will use three loops to modify the array according to count
 * count 0 --> from 0 to  < count0 
 * count 1 --> count0 to  < count0 + count1
 * count2 --> count0 + count1 to  < arr.length
 * 
 * so for traversing the array it will be O(N) and for the three loops also , it will aslo be O(N) so total
 * ==> o(N) + O(N)
 * 
 * for optimal approach we will use "DUTCH NATIONAL FLAG ALGO "
 * This algorithm contains 3 pointers i.e. low, mid, and high, and 3 main rules.  The rules are the following:

arr[0….low-1] contains 0. [Extreme left part]
arr[low….mid-1] contains 1.
arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
The middle part i.e. arr[mid….high] is the unsorted segment
since our entire array is unsorted we will make mid pointer to arr[0] and high to arr[n-1];

we will have three conditions in this 
1.if(arr[mid] == 0) 

The steps will be the following:

First, we will run a loop that will continue until mid <= high.
There can be three different values of mid pointer i.e. arr[mid]
If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid.
 Now the subarray from index 0 to (low-1) only contains 0.
If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 
as it should according to the rules.
If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high.
 Now the subarray from index high+1 to (n-1) only contains 2.
In this step, we will do nothing to the mid-pointer as even after swapping, 
the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.
 */

import java.util.Arrays;

public class Sort012 {
    public static int[] sortByCollection(int arr[]) {
         Arrays.sort(arr);
         return arr;
    }

    public static int[] sortByCount(int arr[]) {
        int count0 = 0;
        int count1=0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                count0++;
            }else if(arr[i] == 1) {
                count1++;
            }else {
                count2++;
            }
        }
        for(int i=0;i<count0;i++) {
            arr[i] = 0;
        }

        for(int i=count0;i<count0+count1;i++) {
            arr[i] = 1;
        }

        for(int i=count0+count1;i<arr.length;i++) {
            arr[i] = 2;
        }
        return arr;
    }

    public static int[] sortByDutch(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid<=high) {
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1) {
                mid++;
            }else {
                int temp = arr[high];
                arr[high] = arr[mid] ;
                arr[mid] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2, 1, 0};
        int ans[] = sortByCollection(arr);
        int ans2[] = sortByCount(arr);
        int ans3[] = sortByDutch(arr);
        for(int i=0;i<ans.length;i++){
            System.err.print(ans[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<ans2.length;i++){
            System.err.print(ans2[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<ans3.length;i++){
            System.err.print(ans3[i]+ " ");
        }

    }
}
