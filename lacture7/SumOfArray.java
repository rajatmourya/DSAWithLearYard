package lacture7;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        int arr[] = Arrays.getArray(n);
        Arrays.display(arr);
        System.out.println(sum(arr,n));
    }

    public static int sum(int arr[], int n) {
        int sum = 0;
        for(int e: arr){
            sum += e;
        }
        return sum;
    }
}

