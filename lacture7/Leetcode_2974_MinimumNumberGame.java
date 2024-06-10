package lacture7;

import java.util.Scanner;
import java.util.Arrays;

public class Leetcode_2974_MinimumNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        int arr[] = lacture7.Arrays.getArray(n);
        lacture7.Arrays.display(numberGame(arr));
    }
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i+=2) {
            ans[i] = nums[i+1];
            ans[i+1] = nums[i];
        }
        return ans;
    }
}
