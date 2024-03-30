/*
 * Input: [-3, -4, 5, -1, 2, -4, 6, -1]
Output: 8
Explanation: Subarray [5, -1, 2, -4, 6] is the max sum contiguous subarray with sum 8.

Input: [-2, 3, -1, 2]
Output: 4
Explanation: Subarray [3, -1, 2] is the max sum contiguous subarray with sum 4.

We would be solving the problem by following approaches –

Simple approach ==> we will be calculating the sum with every subarray and compare it with maxSUm 
will be using two for loops fot this so that every element can be traversed from itself to end to generate subarrays.
Efficient Approach: Kadane’s Algorithm

==>Define two-variable currSum which stores maximum sum ending here and maxSum which stores maximum sum so far.
Initialize currSum with 0 and maxSum with INT_MIN.
Now, iterate over the array and add the value of the current element to currSum and check
If currSum is greater than maxSum, update maxSum equals to currSum.
If currSum is less than zero, make currSum equal to zero.
Finally, print the value of maxSum.
 */

public class MaximumSubArraySum {
    static int maxSubarray(int arr[]){
        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        int startIndex = -1;
        int start = -1;
        int endIndex = -1;
        
        for(int i=0;i<n;i++) {
            if(sum == 0) {
             start = i;
            }
            sum += arr[i];
            if(sum>maxSum) {
                maxSum = sum;
                startIndex = start;
                endIndex=i;

            }
            if(sum<0) {
                sum = 0;
            }
        }
        for(int j=startIndex;j<=endIndex;j++) {
            System.out.print(arr[j]+ " "); // printing the subarray
           
        }
        System.out.println();
        return maxSum;
    }

    static int maxSubarray2(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
                if(sum>maxSum) {
                    maxSum = sum;
                }
            }

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubarray(arr);
        int ans2 = maxSubarray2(arr);
        System.out.println(ans);
        // System.out.println(ans2);
    }
}
