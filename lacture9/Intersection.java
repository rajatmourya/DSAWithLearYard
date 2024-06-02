package lacture9;

import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        // int arr1[] = new int[100];
        // int arr2[] = new int[100];

        int arr1[] = {1,2,1,6,3,4};
        int arr2[] = {2,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        
        // int n1 = sc.nextInt();
        // for(int i = 0; i < n1; i++){
        //     arr1[i] = sc.nextInt();
        // }

        // int n2 = sc.nextInt();
        // for(int i = 0; i < n2; i++){
        //     arr2[i] = sc.nextInt();
        // }

        for (int i : arr1) {
            for (int j : arr2) {
                if(i == j){
                    System.out.print(i + " ");
                }
            }
            
        }
    }
    
}
