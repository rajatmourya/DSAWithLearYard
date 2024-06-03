package Lacture3;

import java.util.Scanner;
import java.lang.Math;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the first number : ");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(bootgcd(a,b));
    }
    public static int gcd(int a, int b) {
        int result = 1;
        for (int i = Math.min(a, b); i > 1 ; i--) {
            if(b % i == 0){
                result = i;
                break;
            }
        }
        return result;
    }

    public static int bootgcd(int a, int b) {
        while (a != b){
            if(a > b){
                a -= b;
            }
            if(b > a){
                b -= a;
            }
        }
        return a;
    }


}
