package lacture7;

import java.util.Scanner;

public class LeetCode_1512_NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        int arr[] = Arrays.getArray(n);
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        int goodPair = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    goodPair += 1;
                }
            }
        }
        return goodPair;
    }
}
