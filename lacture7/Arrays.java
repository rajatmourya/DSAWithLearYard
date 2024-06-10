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

    public static void  display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0 && arr[i+1]==0){
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
