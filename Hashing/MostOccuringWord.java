import java.util.HashMap;
import java.util.Map;

public class MostOccuringWord {
    static String findMostOccurredWord(String s) {
        String st[] = s.trim().split("\\s+");
        for(int i=0;i<st.length;i++){
            System.out.println("word-->" + st[i]);
        }
        HashMap<String,Integer> hmap = new HashMap<>();
        for(String word:st) {
            String lowercaseWord = word.toLowerCase();
            hmap.put(lowercaseWord,hmap.getOrDefault(word, 0)+1);
        }
        int maxCount = 0;
        String mostOccuredWord = null;
        for(Map.Entry<String,Integer> entry:hmap.entrySet()){
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostOccuredWord = entry.getKey();
            }
        }
        System.out.println(mostOccuredWord+ ":" + maxCount);
        return " ";
    }
    public static void main(String[] args) {
        String input = "   my     name is mukund mukund mukund";
        String ans = findMostOccurredWord(input);
        System.out.println("ans" + ans);
       
    }
}

