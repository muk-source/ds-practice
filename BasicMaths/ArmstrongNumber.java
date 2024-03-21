/*
 * Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number.
 */

public class ArmstrongNumber {
    static boolean checkArmstrong(int number){
        int temp = number;
        int originalNumber = number;
        int count = 0;
        while(temp!=0) {
            count++;
            temp=temp/10;
        }
        int sum = 0;
        while(originalNumber>0) {
            int x = originalNumber%10;
            sum+=Math.pow(x,count);
            originalNumber=originalNumber/10;
        }
        System.out.println("sum:"+sum);
        if(sum==number) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 153;
        boolean ans = checkArmstrong(number);
        System.out.println("ans" + ans);

    }
}
