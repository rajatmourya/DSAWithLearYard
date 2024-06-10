package lacture7;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        int arr[] = Arrays.getArray(n);
        System.out.println(arraySortedOrNot(arr,n));
    }
    public static boolean arraySortedOrNot(int[] arr, int n) {
        int f = 0;
        int r = 1;
        for (int i = 0; i < n-1; i++) {
            if(arr[r] < arr[f]){
                return false;
            }
            f++;
            r++;
        }
        return true;
    }
}
