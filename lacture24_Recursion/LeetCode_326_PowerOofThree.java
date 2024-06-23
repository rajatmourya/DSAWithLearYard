package lacture24_Recursion;

import java.util.Scanner;

public class LeetCode_326_PowerOofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n%3 != 0) return false;
        return isPowerOfThree(n/3);
    }
}
