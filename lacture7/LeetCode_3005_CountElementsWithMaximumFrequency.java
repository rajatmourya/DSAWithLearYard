package lacture7;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_3005_CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        int arr[] = lacture7.Arrays.getArray(n);
        System.out.println(maxFrequencyElements(arr));
    }

    public static int maxFrequencyElements(int[] nums) {
        int a[] = new int[101];
        int maxFre = 0;
        Arrays.fill(a,0);
        for(int e: nums){
            a[e] += 1;
        }
        int temp = a[0];
        for (int e : a) {
            if(e > temp){
                maxFre = e;
                temp = e;
            }else if(e == temp){
                maxFre += e;
            }
        }
        return maxFre;
    }
}
