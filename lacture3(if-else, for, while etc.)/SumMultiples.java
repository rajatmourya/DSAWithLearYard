package Lacture3;

import java.util.Scanner;

public class SumMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Positive Integer: ");
        int n = sc.nextInt();
        System.out.println(sumOfMultiples(n));

    }

    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
