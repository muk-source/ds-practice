

public class SumOfFirstN {
    static int printSum(int x) {
        if(x == 0) {
            return 0;
        }
        return x + printSum(x-1);
    }
    public static void main(String[] args) {
        int x = 5;
        int ans = printSum(x);
        System.out.println(ans);
    }
}
