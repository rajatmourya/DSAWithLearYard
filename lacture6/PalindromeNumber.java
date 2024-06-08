package lacture6;

import java.util.Scanner;

public class PalindromeNumber {

//    Write a java program to input number from user and check number is palindrome or not.
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
        if(n == reverse){
            System.out.println(n + " is palindrome");
        }else {
            System.out.println(n + " is not palindrome");
        }
    }
}
