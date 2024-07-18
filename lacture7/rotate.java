package lacture7;


import java.util.Scanner;
import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the position of rotation");
        int pos = sc.nextInt();
        Arrays.sort(arr);
        leftrotate(arr,n,pos);

    }
    public static void leftrotate(int[] arr, int n, int numberOfRotation){
        int[] temp = new int[2*n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
            temp[n+i] = arr[i];
        }
        for (int i = numberOfRotation; i < n+numberOfRotation; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}

