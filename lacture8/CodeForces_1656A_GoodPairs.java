package lacture8;

import java.util.Scanner;

public class CodeForces_1656A_GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many time you want to Iterate : ");
        int t = sc.nextInt();
        while (t-- > 0){
            int maxElement =Integer.MIN_VALUE;
            int minElement = Integer.MAX_VALUE;
            int maxIndex = 0;
            int minIndex = 0;
            System.out.println("Enter the total number of element in the Array: ");
            int n = sc.nextInt();
            System.out.println("Enter the Element of the Array: ");
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(a > maxElement){
                    maxElement = a;
                    maxIndex = i+1;
                }
                if(a < minElement){
                    minIndex = i+1;
                    minElement = a;
                }
            }
                System.out.println(minIndex + " " + maxIndex);
        }
    }
}
