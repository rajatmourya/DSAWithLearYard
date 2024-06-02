package lacture7;

import java.util.*;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is: ");
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i]+ " ");
        // }

        // Array to String

        System.out.println(Arrays.toString(arr));

         // Sort the Array

         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));

         // 

    }

   
    
}
