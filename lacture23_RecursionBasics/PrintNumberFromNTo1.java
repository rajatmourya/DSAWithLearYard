package lacture23_RecursionBasics;

import java.util.Scanner;

public class PrintNumberFromNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Number from ? to 1 to :");
        int n = sc.nextInt();
        printNTo1(n);
    }

    static void printNTo1(int n){
        if(n == 1) {
            System.out.print(1);
        }else {
            System.out.print(n + " ");
            printNTo1(n-1);
        }
    }
}
