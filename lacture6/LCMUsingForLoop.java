package lacture6;

import java.util.Scanner;

public class LCMUsingForLoop {

//        Write a java program to input two numbers from user and find the LCM using for loop.

    public static void main(String[] args) {
        int lcm = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("enter the Second Number: ");
        int num2 = sc.nextInt();
        int max = num1 > num2 ? num1 : num2;
        int i = max;
        while(true) {
            if (i%num1==0 && i%num2==0){
                lcm = i;
                break;
            }
            i += max;
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
    }
}
