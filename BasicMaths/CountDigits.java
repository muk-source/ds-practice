/*
 * Problem statement
You are given a number ’n’.
Find the number of digits of ‘n’ that evenly divide ‘n’.
Example:
Input: ‘n’ = 336

Output: 3

Explanation:
336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times.
 */

/**
 * CountDigits
 */
import java.util.*;
public class CountDigits {
    static int count(int n) {
        int c = 0;
        int number = n;
        while(number > 0) {
            int x = number % 10;
            if(x!=0 && n%x ==0) {
                c++;
            }
            number = number/10;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = count(n);
        System.out.println("ans:"+ans);
    }
}