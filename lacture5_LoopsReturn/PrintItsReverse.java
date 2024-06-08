package lacture5_LoopsReturn;

import java.util.Scanner;

public class PrintItsReverse {

//    Write a java program to enter a number and print its reverse.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        while (temp != 0){
            reverse = (reverse*10) + (temp%10);
            temp /= 10;
        }
        System.out.println(reverse);
    }
}
