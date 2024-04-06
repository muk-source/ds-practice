public class RotateMatrixBy90 {
    static int[][] rotate(int matrix[][]){
        // first we will  transposing the matrix  without using extra space;
        int n = matrix.length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // now we will reverse the each row to get the rotated ans
        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int ans[][] = rotate(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
