/*
 * 
 * ist approach is simple , we store the frequency in hashmap and then will check if any frequecy is greater than
 * n/2 then we will return that key which is the required element.
 * 
 * 2nd approach is Moore's Voting algo
 * 
 * Intuition:
If the array contains a majority element, its occurrence must be greater than the floor(N/2).
 Now, we can say that the count of minority elements and majority elements is equal up to a certain point in the array. So when we traverse through the array we try to keep
 track of the count of elements and the element itself for which we are tracking the count. 

After traversing the whole array, we will check the element stored in the variable.
 If the question states that the array must contain a majority element, the stored element will be 
 that one but if the question does not state so, then we need to check if the stored element is the 
 majority element or not. If not, then the array does not contain any majority element.


 Approach: 
Initialize 2 variables:
Count –  for tracking the count of element
Element – for which element we are counting
Traverse through the given array.
If Count is 0 then store the current element of the array as Element.
If the current element and Element are the same increase the Count by 1.
If they are different decrease the Count by 1.
The integer present in Element should be the result we are expecting 
 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majority(int arr[]) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value>arr.length/2) {
                return key;
            }
        }
        return -1;
    }

    static int majority2(int arr[]) {
        int element = 0 ;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(count == 0) {
                element = arr[i];
                count++;
            }else if(arr[i] == element) {
                count++;
            }else {
                count--;
            }
        }
        int count2 = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == element) {
                count2++;
            }
        }
        if(count2 > arr.length/2) {
            return element;
        }

        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        int ans = majority(arr);
        int ans2 = majority2(arr);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
