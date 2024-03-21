import java.util.HashMap;

public class LongestSubArrayWithKSum {
    static int getLongestSubarray(int arr[], long k) {
        // we will be generating all subarrays
        /*
         * let consider i as starting index and j as ending index which is also the
         * current element
         * for ex when i=0 j =0 => sum = 0 + arr[0] => sum = 2 => 2!=10(k) so no update
         * of len but sum = 2
         * in next loop i = 0 j =1 => sum = 2 + arr[1] => sum = 5 => 5! = 10(k) so no
         * update of len but sum = 5
         * in next loop i=0; j=2 => sum = 5 + arr[2] => sum = 10 => 10 == 10{k} so len =
         * Math.max(0, (2-0+1)) => len = 3
         * 
         * in this way loop moves
         */
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    static int getLongestSubarray2(int arr[], long k) {

        /*
         * 1. we are using prefix sum approach, which means as we traversing the array ,
         * we keep on adding
         * the elements of array and store it in hash map like sum as key and index as
         * value.
         * 2. so approach begins
         * --> we start traversing the array
         * --> add the values of the array in the sum
         * --> if the sum == k (required value ) , we update the maxLength with array
         * 'i' index
         * --> if the sum is not in hashmap , we just put it in hashmap
         * --> Other wise we will look for "sum-k" in hashmap , if we find that , then
         * we will take the index
         * from the hashmap for the subarray till "sum-k" and subtract it from current
         * index , which will give us
         * the k sum subarray , and we will check it with max lenght andupdate it.
         * 
         * -------------------------------------GFG approach. same but diff lang
         * Initialize sum = 0 and maxLen = 0.
         * Create a hash table having (sum, index) tuples.
         * For i = 0 to n-1, perform the following steps:
         * Accumulate arr[i] to sum.
         * If sum == k, update maxLen = i+1.
         * Check whether sum is present in the hash table or not. If not present, then
         * add it to the hash table as (sum, i) pair.
         * Check if (sum-k) is present in the hash table or not. If present, then obtain
         * index of (sum-k) from the hash table as index. Now check if maxLen <
         * (i-index), then update maxLen = (i-index).
         */
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == k) {
                maxLength = i + 1;
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
            if (preSumMap.containsKey(sum - k)) {
                int len = i - preSumMap.get(sum - k);
                maxLength = Math.max(maxLength, len);
            }
        }
        return maxLength;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 1, 9 };
        long k = 10;
        int len = getLongestSubarray(arr, k);
        int len2 = getLongestSubarray2(arr, k);
        System.out.println("ans : " + len);
        System.out.println("ans2 : " + len2);

    }
}
