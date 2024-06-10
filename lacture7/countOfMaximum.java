package lacture7;

import java.util.Scanner;
import java.util.Arrays;

public class countOfMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many time you want to Iterate : ");
        int t = sc.nextInt();
        while (t-- > 0){
            System.out.println("Enter the total number of element in the Array: ");
            int n = sc.nextInt();
            int a[] = new int[10001];
            Arrays.fill(a,0);
            int count = Integer.MIN_VALUE;
            int value = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                a[arr[i]] += 1;
            }
            for(int i = 1; i <= 10000; i++){
                if(count < a[i]){
                    count = a[i];
                    value = i;
                }
            }
            System.out.println(value + " " + count);
        }
    }
}