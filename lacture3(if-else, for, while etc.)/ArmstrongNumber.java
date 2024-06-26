package Lacture3;

import java.util.Scanner;
import  java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println(armstrongNumber(n));
    }
    static String armstrongNumber(int n){
        int sum = 0;
        int temp = n;
        int power = 0;
        while(temp!=0){
            temp /= 10;
            power++;
        }
        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit,power);
            temp /= 10;
        }
        System.out.println(sum);
        if(sum == n) {
            return "Yes";
        }
        return "No";
    }
}
