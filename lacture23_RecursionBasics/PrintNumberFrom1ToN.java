package lacture23_RecursionBasics;

import java.util.Scanner;

public class PrintNumberFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of the Number from 1 to :");
        int n = sc.nextInt();
        print1ToN(1, n);
    }

    static void print1ToN(int s, int n){
        if(s == n) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(s + " ");
        print1ToN(s+1, n);
    }
}
