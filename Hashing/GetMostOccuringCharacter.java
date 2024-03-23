import java.util.HashMap;
import java.util.Map;

public class GetMostOccuringCharacter {
    static void mostOccuring(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        s = s.replaceAll("\\s", "");
        for(char c:s.toCharArray()) {
            hmap.put(c,hmap.getOrDefault(c, 0)+1);
        }
        int maxCount = 0;
        char c = '\u0000';

        
        for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
            if(entry.getValue()>maxCount) {
                maxCount = entry.getValue();
                System.out.println(entry.getKey());
                c = entry.getKey();
            }
        }
        System.out.println("char:"+c);
    }
    public static void main(String[] args) {
        String s = "my name is mukund";
        mostOccuring(s);

    }
}
