/* 
 * Given an array, find the second smallest and second largest element in the array.
 *  Print ‘-1’ in the event that either of them doesn’t exist.
*/
/*
 * Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
	Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
	Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 */

/* 
 Second Largest Element in array 
 1.We will need two variables "largest" and "secondLargest" initialize with Integer.MIN Value.
 2. if the current element of array is larger than largest , then we will update the "largest" and "secondlargest".
 3. if the current element is not greater than largest but greater than second largest and current element is not equal to largest ,
 then we will update the second largest .
 4.After traversing the whole array , we get the secondlargest element.
 */
public class SecondLargestElement {
    static int findSecondLargest(int arr[] , int n) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
               
            } else if(arr[i] > secondlargest && arr[i]!=largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    
    static int findSecondSmallest(int arr[] , int n) {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
                
            } else if(arr[i] < secondsmallest && arr[i]!=smallest) {
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,4,7,7,5};
        int secondLargest = findSecondLargest(arr,arr.length);
        int secondsmallest = findSecondSmallest(arr,arr.length);
        System.out.println("second Largest :" + secondLargest + " " + "second Smallest : " + secondsmallest);

    }
}
