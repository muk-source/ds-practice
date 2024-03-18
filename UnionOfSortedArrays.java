/*
 * Given two sorted arrays, ‘a’ and ‘b’, of size ‘n’ and ‘m’, respectively, return the union of the arrays.
The union of two sorted arrays can be defined as an array consisting of the common and the distinct elements of the two arrays. \
The final array should be sorted in ascending order.

Input: ‘n’ = 5 ‘m’ = 3
‘a’ = [1, 2, 3, 4, 6]
‘b’ = [2, 3, 5]

Output: [1, 2, 3, 4, 5, 6]

Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
Distinct elements in ‘a’ are: [1, 4, 6]
Distinct elements in ‘b’ are: [5]
Union of ‘a’ and ‘b’ is: [1, 2, 3, 4, 5, 6]

1.Union of arrays means all the common elements + all other elements of both the arrays.
2.we traverse both the arrays with two pointer appraoch . we will check if the element of "a" array 
  is less than "b" array then we will add the "a" array in list and vice versa. 
3 imp points are we will check if the list is empty or last element inserted in list is not equal to current elment of array.
4. after all this , if elements are still there in any array , then we will put all those elements in list also.
 */

import java.util.ArrayList;

public class UnionOfSortedArrays {
    static ArrayList<Integer> unionOfArrays(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } else {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while(i<n) {
            if(ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while(j<m) {
            if(ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }
        return ans;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 6 };
        int b[] = { 2, 3, 5 };
        ArrayList<Integer> ans = new ArrayList<>();
        ans = unionOfArrays(a, b);
        for(Integer i : ans) {
            System.out.print(i + " ");
        }
    }
}
