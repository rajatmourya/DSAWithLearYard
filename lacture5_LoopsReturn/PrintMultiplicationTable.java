package lacture5_LoopsReturn;

import java.util.Scanner;

public class PrintMultiplicationTable {

//    Write a java program to print multiplication table of any number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
