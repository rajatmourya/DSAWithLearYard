package Lacture3;

import java.util.Scanner;
import java.lang.Math;
import java.util.Stack;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many time you want to iterate : ");
        int t = sc.nextInt();
        while (t-- > 0){
            System.out.println("Enter the first number : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second number : ");
            int b = sc.nextInt();
            System.out.println(bootgcd(a,b));
            System.out.println(euclidGcd(a,b));
        }


    }

    public static int euclidGcd(int a, int b){
//        if (b==0) return a;
//        return euclidGcd(b,a%b);

        return a % b == 0 ? b : euclidGcd(b,a%b);

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
