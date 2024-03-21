public class CheckPrime {
    static boolean checkPrime(int number) {
        for(int i=2;i<number;i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       int number = 26;
       boolean ans = checkPrime(number);
       System.out.println("ans : "+ ans); 
    }
}
