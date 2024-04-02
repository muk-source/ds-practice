/*
 * Given an array 'arr' with 'n' elements, 
 * the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
 * 
 * Example:
'arr '= [1,2,3,4,5] 
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.
Step 1: Copy the first k elements into the temp array.

Step 2: Shift n-k elements from last by k position to the left

Step 3: Copy the elements into the main array from the temp array.


for right rotation
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .
5


for left and right rotation , we are taking extra array , so to avoid that we are using reverse algo approach
in which in left rotation case , we reverse the first k elements and reverse the n-k elements and then reverse
the whole array.

arr=1,2,3,4,5   
rev(k) = 2,1
rev(n-k) = 5,4,3
now arr = 2,1,5,4,3
rev(arr) = 3,4,5,1,2 which is the result we want .
Right -->
Step 1: Reverse the last k elements of the array

Step 2: Reverse the first n-k elements of the array.

Step 3: Reverse the whole array.
 */

public class LeftRotateByMany {
    static int[] rotateByLeft(int arr[], int n, int k) {
        k = k % n; // if value of k is more than the size of array , this will get the actual value
                   // of k for rotating the array.
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
        return arr;
    }

    static int[] rotateByRight(int arr[], int n, int k) {
        k = k % n;
        int temp[] = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - (n - k)] = arr[i];
        }

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    static void rotatebyReverse(int arr[], int n, int k) {
        k = k % n;
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);
        reverse(0,n-1,arr);

    }

    static void reverse(int startIndex,int lastIndex,int arr[]) {
        while (startIndex<=lastIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };  
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr3[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        int ans[] = rotateByLeft(arr, arr.length, k);
        int ans2[] = rotateByRight(arr2, arr2.length, k);
        rotatebyReverse(arr3, arr3.length, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i] + " ");
        }

        System.out.println();

        for(int i=0;i<arr3.length;i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
