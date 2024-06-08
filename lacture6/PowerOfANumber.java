package lacture6;

import java.util.Scanner;

public class PowerOfANumber {

//    Write a java program to find power of a number using for loop.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Base: ");
        int base = sc.nextInt();
        System.out.println("enter the Exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}
