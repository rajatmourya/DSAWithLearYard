package lacture9;

import java.util.Scanner;

public class GeeksforGeeks_sumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
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
        System.out.println(sol.sumOfMatrix(row, col, mat));
    }
}

class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum += Grid[i][j];
            }
        }
        return sum;
    }
}
