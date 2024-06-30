package lacture23_RecursionBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class LeetCode_303_RangeSumQueryImmutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> nums = new ArrayList<>();
        System.out.println("Enter the length of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the main Array : ");
        int[] num =new int[n];
        for (int i = 0; i < n; i++) {
           num[i] = sc.nextInt();
        }
//        int[] num = {-2, 0, 3, -5, 2, -1};
        nums.add(num);


        System.out.println("How many range u want to enter");
        int r = sc.nextInt();
        while (r-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
//            int[] temp = {sc.nextInt(),sc.nextInt()};
            int[] temp = {a,b};
            nums.add(temp);
        }
        for (int i = 0;i< nums.size();i++) {
            System.out.println(nums.get(i));
        }
//        NumArray obj = new NumArray(nums.get(0));
//        for (int i = 0; i < r; i++) {
//            int f = nums.get(i+1)[0];
//            int l = nums.get(i+1)[1];
//            System.out.println( obj.sumRange(f,l));
//        }


    }
}

class NumArray {
    int[]  arr;

    public NumArray(int[] nums) {
        arr = nums;
    }

    public int sumRange(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            ans += arr[i];
        }
        return ans;
    }
}