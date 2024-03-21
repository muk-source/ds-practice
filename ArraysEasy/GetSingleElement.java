/*
 * 
 * Given a non-empty array of integers arr, every element appears twice except for one. 
 * Find that single one.
 * 
 * Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.

three approaches-
ist apporach--> linear search
we will traverse the whole array and for each array element we will run another loop and increases its count
if we found the same value . Since for single value element , we will find this only once , so we will
return the elemnt whose count is 1;

2nd approach --> Hashing
we will use HashMap , We know that in hashmap keys are unique , so every time we will traverse the array,
we will store the value as key and its frequency as value , and will increase if we get the same key again ,
so in this case also we will return the frequency with 1 element as key.

3rd approach --> XOR
we kknow that a^a == 0 
0^a = a 
so all double elements give the 0 and the single element ex b^0 will give b, which is the solution.

 */

import java.util.HashMap;

public class GetSingleElement {
    static int singleElement(int arr[] , int n) {
        int xor = 0;
        for(int i=0;i<arr.length;i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    static int singleElement2(int arr[],int n) {
        for(int i=0;i<n;i++) {
            int count = 0;
            for(int j=0;j<n;j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    static int singleElement3(int arr[], int n) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        for(Integer i : hmap.keySet()) {
            if(hmap.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {4,1,2,1,2};
        int ans1 = singleElement(arr,arr.length);
        int ans2 = singleElement2(arr,arr.length);
        int ans3 = singleElement3(arr,arr.length);
        System.out.println("ans  "+  ans1);
        System.out.println("ans2  "+  ans2);
        System.out.println("ans3  "+  ans3);

    }
}
