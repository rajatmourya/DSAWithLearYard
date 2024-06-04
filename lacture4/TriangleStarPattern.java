package lacture4;

import java.util.Scanner;

public class TriangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
//        int n = sc.nextInt();
        int n = 5;
//        rightTriangleStarPattern(n);
//        hollowRightTriangleStarPattern(n);
//        mirroredRightTriangleStarPattern(n);
//        invertedRightTriangleStarPattern(n);
        hollowInvertedRightTriangleStarPattern(n);



    }

    public static void rightTriangleStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void hollowRightTriangleStarPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(i == j || j == 0 || i == n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void mirroredRightTriangleStarPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1-i; j > 0; j--) {
                System.out.print(" ");;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedRightTriangleStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1-i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void  hollowInvertedRightTriangleStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1-i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
