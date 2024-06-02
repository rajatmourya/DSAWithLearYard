package lacture10;

import java.util.Scanner;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;
        int sum1 = 0;

        int arr[][] = new int[r][c];

        // Take inpt row-wise
        for (int i = 0; i < r; i++) {
            // Take input of all the elements
            // in the ith row
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // sum of diagonal value
        for (int i = 0; i < r; i++) {
           for (int j = 0; j < c; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        // sum of diagonal value
        for (int i = 0; i < r; i++) {
            sum1 += arr[i][i];
        }

        System.out.println(sum);
        System.out.println(sum1);
    }

    

    
}
