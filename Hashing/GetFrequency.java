
/*
 * 
 * Approach is 
 * 1. Store all the number in hashmap with their frequency 
 * 2. Iterate over the hash map 
 * 3.Decalre variables for maxFreq minFreq maxKey minKey
 * 4.while iterating check for condition 
 * condition 1--> if the freq is larger then update max freq and maxKey while if freq is equal then we need 
 * smaller key as required in question/.
 * same for minFreq and minKey
* return the two key for num or two freq for their freq

 */



import java.util.HashMap;
import java.util.Map;

public class GetFrequency {
    static int[] getFrequencies(int arr[]) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int maxKey = -1;
        int minFreq = Integer.MAX_VALUE;
        int minKey = -1;
        for (Map.Entry<Integer, Integer> entrySet : hmap.entrySet()) {
            int freq = entrySet.getValue();
            int key = entrySet.getKey();
            if (freq > maxFreq || (freq == maxFreq) && key < maxKey) {
                maxFreq = freq;
                maxKey = key;
            }
            if (freq < minFreq || (freq == minFreq) && key < minKey) {
                minFreq = freq;
                minKey = key;
            }
        }
        return new int[] { maxKey, minKey };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 4 };
        int ans[] = getFrequencies(arr);
        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }
    }
}
