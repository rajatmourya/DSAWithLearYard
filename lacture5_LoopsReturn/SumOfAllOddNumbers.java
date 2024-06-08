package lacture5_LoopsReturn;

import java.util.Scanner;

public class SumOfAllOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("sum of all Odd numbers between 1 to " + n + " :");
        for (int i = 1; i <= n; i+=2) {
            sum += i;
        }
        System.out.print(sum);
    }
}
