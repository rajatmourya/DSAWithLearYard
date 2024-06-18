package lacture7;

import java.util.Scanner;
import java.util.*;

public class Arrays {
    public static int[] getArray(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static long[] getArray(long n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the Array: ");
        long[] arr = new long[Math.toIntExact(n)];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[][] getArray(int n, int m){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the Array: ");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void  display(int[] arr){
        for(int e: arr){
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void  display(long[] arr){
        for(long e: arr){
            System.out.print(e + " ");
        }
    }

    public static void  display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int  sum(int[] arr){
        int sum = 0;
        for(int e: arr){
            sum += e;
        }
        return sum;
    }

}
