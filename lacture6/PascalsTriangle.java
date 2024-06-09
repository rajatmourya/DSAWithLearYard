package lacture6;

import java.util.Scanner;

public class PascalsTriangle {

//    Write a java program to print pascal's triangle up to n rows using loop.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int value = Factorial.fact(i)/(Factorial.fact(j)* Factorial.fact(i-j));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
