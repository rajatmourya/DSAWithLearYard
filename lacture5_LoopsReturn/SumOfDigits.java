package lacture5_LoopsReturn;

import java.util.Scanner;

public class SumOfDigits {

//    Write a java program to input a number and calculate sum of digits.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        do{
            sum += (n%10);
            n /= 10;
        }while ( n != 0);
        System.out.println("Sum of Digits is :" + sum);
    }
}
