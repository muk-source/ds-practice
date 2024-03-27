
public class Fibonacci {
    static int[] print(int n) {
        if(n==1) {
            return new int[] {0};
        }
        if(n==2) {
            return new int[] {0,1};
        }
        int arr[] = new int[n];
        
        int firstNumber = 0;
        int secondNumber = 1;
        arr[0] = firstNumber;
        arr[1] = secondNumber;
        int i=2;
        while(i<n) {
            int thirdNumber = firstNumber + secondNumber;
            arr[i] = thirdNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int number = 1;
        int arr[] = print(number);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    
}
