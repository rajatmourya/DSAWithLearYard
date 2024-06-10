package lacture7;

import java.util.Scanner;

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
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0 && arr[i+1]==0){
                break;
            }
            System.out.print(arr[i] + " ");
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
