/**
 * GCD
 */
public class GCD {
    static int gcd(int number1,int number2) {
        int min = Math.min(number1,number2);
        int ans = 1;
        for(int i=1;i<=min;i++) {
            if(number1%i==0 && number2%i==0) {
               ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 4;
        int ans = gcd(number1,number2);
        System.out.println("ans:" + ans);
    }
}