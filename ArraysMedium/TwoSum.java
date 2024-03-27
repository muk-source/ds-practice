
/*
 * 
so the approach is simple 
first approach is for every array element , we will look for its partner eleemnt which can sum upto target
we can do this by using two loops first will be go from 0 to till <n and the inner loop will be j = i+1 till n 
and will sum and check with target , so it will be O(n^2) for two loops

another will be using hashing using hashmap , we will do target - arr[i] and check for it in hashmap and if there is
then we will get our elements and they will sum to target otherwise we will be inserting the element in hashmap with
elemnt and index
we are traversing the array once so it will be O(n);
 */

import java.util.HashMap;

class TwoSum {
    public static int[] sum(int arr[],int target) {
        int n = arr.length;
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i] + arr[j] == target) {
                    ans[0] = i;;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static int[] sum2(int arr[],int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0;i<arr.length;i++) {
            int needed = target - arr[i];
            if(hmap.containsKey(needed)){
                ans[0] = hmap.get(needed);
                ans[1] = i;
                return ans;
            } 
            hmap.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,11,5,8,6};
        int target = 14;
        int ans [] = sum(arr,target);
        int ans2 [] = sum2(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        for(int i=0;i<ans2.length;i++) {
            System.out.println(ans2[i]);
        }
    } 
}