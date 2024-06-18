package lacture23_RecursionBasics;

import java.util.Scanner;

public class FibonacSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println(fibonac(n));
    }
    static int fibonac(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonac(n-1) + fibonac(n-2);
    }
}
