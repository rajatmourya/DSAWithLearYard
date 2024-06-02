package lacture11;

import java.util.Scanner;

public class MatrixMultiplication {

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

    public static void DispayMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] multipicationMatrix(int[][] m1, int[][] m2, int nr1,int nc1, int nc2) {
        int ans[][] = new int[nr1][nc2];
        for (int i = 0; i < nr1; i++) {
            for (int j = 0; j < nc2; j++) {
                int sum = 0;
                for (int k = 0; k < nr1 -1; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                ans[i][j] = sum;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Row of the First Matrix");
        int nr1 = sc.nextInt();
        System.out.println("Enter the number of Column of the First  Matrix");
        int nc1 = sc.nextInt();
        int[][] m1 = getMatrix(nr1, nc1);
        System.out.println("Enter the number of Row of the Second Matrix");
        int nr2 = sc.nextInt();
        System.out.println("Enter the number of Column of the Second  Matrix");
        int nc2 = sc.nextInt();
        int[][] m2 = getMatrix(nr2, nc2);

        if(nc1 == nr1){
            int[][] multiplication = multipicationMatrix(m1, m2,nr1, nc1, nc2);
            System.out.println("Your answer is:");
            DispayMatrix(multiplication);
        }else{
            System.out.println("Multiplication note posible");
        }
        
        

    }

    

    
    
}
