import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrix {
    static ArrayList<ArrayList<Integer>> zero(ArrayList<ArrayList<Integer>> matrix, int n, int m ) {

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix.get(i).get(j) == 0) {
                    markRow(matrix,n,m,i);
                    markColumn(matrix,n,m,j);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
    static void markRow (ArrayList<ArrayList<Integer>> matrix, int n, int m , int i) {
        for(int j=0;j<m;j++) {
            if(matrix.get(i).get(j)!= 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static void markColumn (ArrayList<ArrayList<Integer>> matrix, int n, int m , int j) {
        for(int i=0;i<n;i++) {
            if(matrix.get(i).get(j)!= 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> zero2(ArrayList<ArrayList<Integer>> matrix, int n, int m ) {
        int row[] = new int[n];
        int col []= new int[m];
        for(int i=0;i<n;i++) {
              for(int j=0;j<m;j++){
                if(matrix.get(i).get(j) ==0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                if(row[i] == -1 || col[j] == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int n = 2;
        int m = 3;
        matrix.add(new ArrayList<>(Arrays.asList(2,4,3)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,0)));
        // have to comment because matrix chnages..
        // ArrayList<ArrayList<Integer>> ans = zero(matrix,n,m);
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         System.out.print(ans.get(i).get(j) + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println("-----------------------------------------------");
        ArrayList<ArrayList<Integer>> ans2 = zero2(matrix,n,m);
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(ans2.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
    }
}
