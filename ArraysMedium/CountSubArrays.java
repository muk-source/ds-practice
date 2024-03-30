/*
 * The steps are as follows:

First, we will declare a map to store the prefix sums and their counts.
Then, we will set the value of 0 as 1 on the map.
Then we will run a loop(say i) from index 0 to n-1(n = size of the array).
For each index i, we will do the following:
We will add the current element i.e. arr[i] to the prefix sum.
We will calculate the prefix sum i.e. x-k, for which we need the occurrence.
We will add the occurrence of the prefix sum x-k i.e. mpp[x-k] to our answer.
Then we will store the current prefix sum in the map increasing its occurrence by 1.
Question: Why do we need to set the value of 0?
Let’s understand this using an example. Assume the given array is [3, -3, 1, 1, 1] and k is 3. Now, for index 0, we get the total prefix sum as 3, and k is also 3. So, the prefix sum of the remove-part should be x-k = 3-3 = 0. Now, if the value is not previously set for the key 0 in the map, we will get the default value 0 for the key 0 and we will add 0 to our answer. This will mean that we have not found any subarray with sum 3 till now. But this should not be the case as index 0 itself is a subarray with sum k i.e. 3.
So, in order to avoid this situation we need to set the value of 0 as 1 on the map beforehand.
 */

 // try to watch the video on striver
// 
import java.util.HashMap;

public class CountSubArrays {
    static int count(int arr[],int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int presum=0;
        int count=0;
        hmap.put(0,1);
        for(int i=0;i<arr.length;i++) {
            presum+=arr[i];
            int remove = presum-k;
            count += hmap.getOrDefault(remove,0);
            hmap.put(presum,hmap.getOrDefault(presum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        int k = 6;
        int ans = count(arr,k);
        System.out.println(ans);
    }
}
