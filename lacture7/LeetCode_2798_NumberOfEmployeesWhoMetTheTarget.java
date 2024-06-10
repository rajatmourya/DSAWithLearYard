package lacture7;

import java.util.Scanner;

public class LeetCode_2798_NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        int arr[] = Arrays.getArray(n);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        System.out.println("There are " + numberOfEmployeesWhoMetTarget(arr,target) + " employees who met the target.");
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int e: hours){
            if(e >= target){
                count += 1;
            }
        }
        return count;
    }
}
