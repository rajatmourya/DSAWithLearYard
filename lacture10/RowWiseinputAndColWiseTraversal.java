package lacture10;

import java.util.Scanner;

public class RowWiseinputAndColWiseTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        // Take inpt row-wise
        for (int i = 0; i < r; i++) {
            // Take input of all the elements
            // in the ith row
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print Column-wise
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
