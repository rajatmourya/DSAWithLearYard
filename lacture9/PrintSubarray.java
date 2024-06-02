package lacture9;

import java.util.Scanner;

public class PrintSubarray {

    public static void display(int arr[], int n){
        for (int i = 0; i < n; i++) {

            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(arr[i]);

            if (i < n-1) {
                System.out.print(",");
            }else{
                System.out.print("]");
            }
        }
        System.out.println();
    }
    

    public static void displaySubarray(int arr[], int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            
        }
    }


    public static void main(String[] args) {
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // int arr[] = {1,2,3,4};
        // int n = 4;

        displaySubarray(arr,n);

    }
    
}
