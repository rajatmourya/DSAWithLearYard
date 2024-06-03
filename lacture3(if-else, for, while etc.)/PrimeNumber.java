package Lacture3;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many time you want to iterate : ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the number : ");
            int N = sc.nextInt();
            System.out.println(isPrime(N));
        }

    }
    public static String isPrime(int N){
        boolean[] arr = new boolean[N+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i*i <= N ; i++) {
            for (int j = 2*i; j <= N; j+= i) {
                arr[j] = false;
            }
        }
        return arr[N]?"YES":"NO";
    }

}
