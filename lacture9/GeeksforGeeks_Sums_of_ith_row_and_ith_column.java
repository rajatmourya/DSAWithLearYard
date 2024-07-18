package lacture9;

import java.util.Scanner;

public class GeeksforGeeks_Sums_of_ith_row_and_ith_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Row:");
        int row = sc.nextInt();
        System.out.println("Enter the number of Column:");
        int col = sc.nextInt();
        System.out.println("Enter the Element of the Matrix:");
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(sumOfRowCol(row, col, mat));
    }
    static int sumOfRowCol(int N, int M, int A[][]) {
        int trav = Math.min(N,M);
        for (int i = 0; i < trav; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < M; j++) {
                rowSum += A[i][j];
            }
            for (int j = 0; j < N; j++) {
                colSum += A[j][i];
            }
            if(rowSum != colSum){
                return 0;
            }
        }
        return 1;
    }
}
