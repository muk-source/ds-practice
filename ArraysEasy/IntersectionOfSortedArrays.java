/* 
 * You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. 
 * Both these arrays are sorted in non-decreasing order.
 *  You have to find the intersection of these two arrays.

Intersection of two arrays is an array that consists of all the common elements occurring in both arrays.

arr1 = 1 2 2 2 3 4
 arr2 = 2 2 3 3

intersection array = 2 2 3

1.Intersection is common elements between two arrays.
2. since the  array is SORTED , we can use two pointer approach .
3. We use "i" pointer for "a" array while "j" for "b" arrays and then we check and compare the elements
for example we check a[i] < b[j] , since the array is sorted we know that a[i] will always be the smaller for
all other elements in b so we increase the pointer as i++ , same we did for "b" array and pointer j,
4. as both condition of these two failed , this means we get the common element , so add this in list and increase the 
pointer for both the arrays.
5. After traversing both the arrays , we finally get the intersection of two arrays.
*/

import java.util.ArrayList;

public class IntersectionOfSortedArrays {
    static ArrayList<Integer> intersection(int a[],int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        while(i<n && j<m) {
            if(a[i]<b[j]) {
                i++;
            } else if(b[j]<a[i]) {
                j++;
            } else{
                list.add(a[i]);
                i++;
                j++;
            }
        }
        return list;
    }
    public static void main(String args[]) {
        int arr1[] = {1,2,2,2,3,4};
        int arr2[] = {2,2,3,3};
        ArrayList<Integer> list = new ArrayList<>();
        list = intersection(arr1,arr2);
        for(Integer i:list) {
            System.out.print(i+ " ");
        }

    }
}
