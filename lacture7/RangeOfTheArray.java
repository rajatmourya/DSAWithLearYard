package lacture7;

import java.util.Scanner;

public class RangeOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of the Array: ");
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a > maxElement){
                maxElement = a;
            }
            if(a < minElement){
                minElement = a;
            }
        }
        System.out.println("The Range of the Array is: " + (maxElement - minElement));
    }
}
