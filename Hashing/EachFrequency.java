import java.util.HashMap;
import java.util.Map;

public class EachFrequency {
    static void printFrequency(int arr[]){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            hmap.put(arr[i],hmap.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()) {
            System.err.println(entry.getKey()+ "--->"+ entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        printFrequency(arr);
    }
}
