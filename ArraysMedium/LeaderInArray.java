

/*
 * approach is simple so we will be traversing from backwards and we will declare max varible with INteger.MIN_VALUE
 * while traversing we will check if arr[i] > max , if yes we will add the element in list and update teh max
 * at the end will return the list with ans; 
 */
import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    static List<Integer> leader(int arr[]){
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length - 1;i>=0;i--) {
            if(arr[i] > max) {
                ans.add(arr[i]);
            }
            max = Math.max(max,arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1 };
        List<Integer> ans = leader(arr);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }   
     }

}
