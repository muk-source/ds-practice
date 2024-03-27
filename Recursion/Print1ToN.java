/*
 * You are given an integer ‘n’.
Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.
 */



public class Print1ToN {
    public static void addtoArray(int i,int x,int arr[]) {
        if(i==x) {
            return;
        }
        arr[i] = i+1;
        i++;
        addtoArray(i, x, arr);
    }
    public static int[] printNos(int x) {
        int arr[] = new int[x];
        int i=0;
        addtoArray(i,x,arr);
        return arr;
    }

    public static void main(String[] args) {
        int x = 5;
        int ans [] = printNos(x);
        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }
    }
}
 