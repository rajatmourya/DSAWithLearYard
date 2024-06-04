package lacture4;

import java.util.Scanner;

public class pyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
//        int n = sc.nextInt();
        int n = 5;
//        pyramidStarPattern(n);
//        hollowPyramidStarPattern(n);
//        invertedPyramidStarPattern(n);
        hollowInvertedPyramidStarPattern(n);

    }
    
    public static void pyramidStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1-i; j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    public static void hollowPyramidStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1-i; j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if(i == n-1 || j == 0) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                if (j== i-1 || i == n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void invertedPyramidStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = n-1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowInvertedPyramidStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1; j >= i; j--) {
                if (j == n-1 || i == 0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j < n ; j++) {  //i == 0 ||
                if (j == n-i-1 || i==0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}
