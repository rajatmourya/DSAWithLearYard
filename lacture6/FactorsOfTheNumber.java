package lacture6;

import java.util.Scanner;

public class FactorsOfTheNumber {

//    Write a java program to input a number from user and find all factors of the given number using for loop.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(n);
    }
}
