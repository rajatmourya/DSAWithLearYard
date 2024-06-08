package lacture5_LoopsReturn;

import java.util.Scanner;

public class CountNumberOfDigits {

//    Write a java program to input a number from user and count number of digits in the given integer.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int n = sc.nextInt();
        int count = 1;
        while (n/10 != 0){
            count+= 1;
            n /= 10;
        }
        System.out.println("Total digits: " + count);
    }
}
