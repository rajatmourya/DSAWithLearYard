package lacture5_LoopsReturn;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] agr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Even numbers between 1 to " + n + " :");
        for (int i = 2; i <= n; i+=2) {
                System.out.print(i + ",");
        }
    }
}
