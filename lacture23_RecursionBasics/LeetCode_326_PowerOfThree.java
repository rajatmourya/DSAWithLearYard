package lacture23_RecursionBasics;

import java.util.Scanner;

public class LeetCode_326_PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println(new Solution().isPowerOfThree(n));
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        return isPowerOfThreeHelper(n);
    }

    boolean isPowerOfThreeHelper(int n) {
        if(n == 1) return true;
        if(n % 3 != 0) return false;
        return isPowerOfThreeHelper(n/3);
    }
}
