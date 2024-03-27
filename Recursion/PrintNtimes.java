import java.util.ArrayList;
import java.util.List;

public class PrintNtimes {
    public static void printName(int i,int n,List<String> list) {
        if(i==n) {
            return;
        }
        list.add("Mukund Moona");
        printName(++i, n, list);
    }
    public static List<String> printNTimes(int n) {
        List<String> list = new ArrayList<>();
        int i=0;
        printName(i,n,list);
        return list;
    }
   public static void main(String[] args) {
    int x = 3;
    printNTimes(x);
    List<String> ans = printNTimes(x);
    for(String i : ans) {
        System.out.println(i);
    }
   } 
}
