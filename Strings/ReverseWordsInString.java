// Approach is simple 
// we first remove the trailing spaces from starting and ending using trim() method
// then we split the array on the basis of white space character , \\s+ split the aaray on the basis
// of one or more chracters
// then we jsut swap the elements for reversing the array and return it as String using join method
// first args in join method used as between array eleemnts

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        // we are first removing the trail spaces from left and right and then splitiing the array on the basis
        // of one or more white space characters
        String ans[] = s.trim().split("\\s+");
        int left = 0;
        int right = ans.length-1;
        while(left<=right){
            String temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }
        


        return String.join(" ", ans);
    }
    public static void main(String[] args) {
        String s = "   the     sky is blue   ";
        // String ans[] = s.trim().split("\\s+");
        // System.out.println(Arrays.toString(ans));
        String ans = reverseWords(s);
        System.out.println(ans);


    }
}
