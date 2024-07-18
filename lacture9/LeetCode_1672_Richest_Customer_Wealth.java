package lacture9;

import java.util.Scanner;

public record LeetCode_1672_Richest_Customer_Wealth() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solutionl sol = new Solutionl();
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
        System.out.println(sol.maximumWealth(mat));
    }
}

class Solutionl {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
