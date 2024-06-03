package Lacture3;

import java.util.Scanner;

public class GCDvsLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many time you want to iterate : ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            System.out.print(n - 3 + " " + 1 + " " + 1 + " " + 1);
            System.out.println();
        }
    }
}


