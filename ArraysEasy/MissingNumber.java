/* 
 * 
 * Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
 * Find the number(between 1 to N), that is not present in the given array.
Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

three approaches for this question -->
first approach is using linear search.
We will use two for loop , the outer loop traverses from 1 to N and inner loop traverses from 0 to array length
for every outer loop value , we will traverse every inner loop value . 
we will be using flag , if we find the outer loop value in inner loop , we will update the flag to 1 and break;
if we did not find the outer loop value in inner loop the flag remains 0 , we will return that value from outer loop 


Second approach is Hashing-->
we will use an Hash array of size N+1 , thats becasue we will have to check for N also and since array indexing
starts from 0 so we will use N+1  for example N = 5 , 
we will then increase the frequency of hashArray by 1 if we have that value in actual array .
then we will again traverse the hash array from 1 to N and check if the any index value is 0 , that element is 
missing and we will return that index.

Third Approach is XOR
Two important properties of XOR are the following:

XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2

Now, let’s XOR all the numbers between 1 to N.
xor1 = 1^2^…….^N

Let’s XOR all the numbers in the given array.
xor2 = 1^2^……^N (contains all the numbers except the missing one).

Now, if we again perform XOR between xor1 and xor2, we will get:
xor1 ^ xor2 = (1^1)^(2^2)^……..^(missing Number)^…..^(N^N)

Here all the numbers except the missing number will form a pair and each pair will result in 0 according to the XOR property. The result will be = 0 ^ (missing number) = missing number (according to property 2).

So, if we perform the XOR of the numbers 1 to N with the XOR of the array elements, we will be left with the missing number.

 */

public class MissingNumber {
    static int missing(int arr[],int N) {
        for(int i=1;i<=N;i++) {
            int flag=0;
            for(int j=0;j<arr.length;j++) {
                if(arr[j] == i){
                    flag=1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }
    static int missing2(int a[], int N) {
        int hashArray[] = new int[N+1];
        for(int i=0;i<a.length;i++) {
            hashArray[a[i]]++;
        }

        for(int i=1;i<=N;i++) {
            if(hashArray[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    static int missing3(int a[] , int N) {
        int xor1 = 0;
        int xor2 = 0;
        int n = N-1;
        for(int i=0;i<n;i++) {
            xor1 = xor1 ^ a[i];
            xor2 = xor2 ^ (i+1);
        }
        xor2 = xor2 ^ N;
        return xor1 ^ xor2;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,4,5};
        int N = 5;
        int ans = missing(arr,N);
        int hashingans = missing(arr,N);
        int xorans = missing(arr,N);
        System.out.println("ans "+ ans);
        System.out.println("hashingans "+ hashingans);
        System.out.println("xor ans "+ xorans);
    }
}
