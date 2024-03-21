public class Palindrome {
    static boolean checkPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while(temp > 0) {
            int n = temp%10;
            reverse = reverse*10+n;
            temp = temp/10;
        }
        if(reverse == x) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int x = 51415;
        boolean ans = checkPalindrome(x);
        System.out.println("ans :"+ ans);

    }
}
