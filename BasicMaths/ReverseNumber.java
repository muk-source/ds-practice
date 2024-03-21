public class ReverseNumber {
    static int reverse(int x) {
        int reverse = 0;
        while(x > 0) {
            int num = x%10;
            reverse = reverse*10 + num;
            x = x/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int x = 123;
        int ans = reverse(x);
        System.err.println("ans " + ans);
    }
}
