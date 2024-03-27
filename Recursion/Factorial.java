

public class Factorial {
    static int printFactorial(int x) {
        if(x==0) {
            return 1;
        }
        return x * printFactorial(x-1);
    
    }
    public static void main(String[] args) {
        int x = 5;
        int ans = printFactorial(x); 
        System.out.println(ans);
    }
}
