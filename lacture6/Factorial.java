package lacture6;

import java.util.Scanner;

public class Factorial {

//    Write a java program to input a number and calculate its factorial using for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
