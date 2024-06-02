package lacture11;

import java.util.Scanner;

public class SpiralOrder {

    public static int[][] getMatrix(int nr, int nc) {
        Scanner sc = new Scanner(System.in);
        int[][] temp = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                temp[i][j] = sc.nextInt();
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {{1,2,3,4,5,6},
                       {18,19,20,21,22,7},
                       {17,28,29,30,23,8},
                       {16,27,26,25,24,9},
                       {15,14,13,12,11,10}};

        int R = 5;
        int C = 6;

        // System.out.println("Enter the number of Row of the Matrix");
        // int R = sc.nextInt();
        // System.out.println("Enter the number of Column of the Matrix");
        // int C = sc.nextInt();

        // int[][] arr = getMatrix(R, C);

        int topRow = 0, botRow = R - 1, leftCol = 0, rightCol = C - 1;

        while(topRow <= botRow && leftCol <= rightCol) {
            // Top Row (left to right)
            for (int c = leftCol; c < rightCol; ++c)
                System.out.print(arr[topRow][c] + " ");

            if (topRow == botRow) {
                System.out.print(arr[topRow][rightCol] + " ");
            }

            // Right col (top to bottom)
            for (int r = topRow; r < botRow; ++r)
                System.out.print(arr[r][rightCol] + " ");

            if (leftCol == rightCol) {
                System.out.print(arr[botRow][rightCol] + " ");
            }

            // Bot Row (right to left)
            for (int c = rightCol; c > leftCol; --c)
                System.out.print(arr[botRow][c] + " ");

            // Left Col (bottom to top)
            for (int r = botRow; r > topRow; --r)
                System.out.print(arr[r][leftCol] + " ");

            // Compress the boundary
            topRow++;
            leftCol++;
            botRow--;
            rightCol--;
        }   
    }
}
