public class SpiralMatrix {
    static int[] printSpiral(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int ans[] = new int[n*m];
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n - 1;
        int x = 0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++) {
                ans[x++] = arr[top][i];
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                ans[x++] = arr[i][right];
            }
            right--;
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                    ans[x++] = arr[bottom][i];
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom;i>=top;i--) {
                    ans[x++] = arr[i][left];
                }
                left++;
            }
        }
        return ans;
    }
   public static void main(String[] args) {
    int arr[][] = {{ 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 } };
    int arr2[][] = {{1,2,3,4}};
    int arr3[][] = {{1},{2},{4}};
    int ans[] = printSpiral(arr3);
    for(int i=0;i<ans.length;i++) {
        System.out.print(ans[i] + " ");
    }

   } 
}
