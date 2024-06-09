package lacture6;

import java.util.Scanner;

public class Fibonacciseries {

//    Write a java program to print Fibonacci series up to n terms using loop.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of series you want: ");
        int n = sc.nextInt();
        int prev = 0;
        int next = 1;
        for (int i = 1; i <= 10; i++) {
            int temp = next;
            next = prev + next;
            System.out.print(prev + " ");
            prev = temp;
        }
    }

}
