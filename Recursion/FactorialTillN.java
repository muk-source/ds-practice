/*
 * You are given an integer ’n’.



Your task is to return a sorted array (in increasing order) containing all the factorial numbers which are less than or equal to ‘n’.



The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.

Input: ‘n’ = 7

Output: 1 2 6

==> its basically printing all factorial till that number 
like 1! = 1
2! = 2x1= 2
3! = 3x2x1 = 6
and so on 
we take a varibale factorial = 1 as we are doing multiplication
Approach is simple
1. We take a while loop till the given number 
2. at every step , we keep calcuating the facotrial. for calculating factorial we are using i = 1 also.

Explanation: Factorial numbers less than or equal to ‘7’ are ‘1’, ‘2’, and ‘6’.
 */

import java.util.ArrayList;
import java.util.List;

public class FactorialTillN {
    static void printFactorialTillN(int n) {
        List<Long> list = new ArrayList<>();
        long factorial = 1;
        int i = 1;
        while(factorial<=n) {
            list.add(factorial);
            i++;
            factorial = factorial * i;
        }
        for(long x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int n = 7;
        printFactorialTillN(n);
    }
}
