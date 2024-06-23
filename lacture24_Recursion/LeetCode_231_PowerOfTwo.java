package lacture24_Recursion;

import java.util.Scanner;

public class LeetCode_231_PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println(powerOfTwo(n));
    }
    public static boolean powerOfTwo(int n) {
        if(n <= 0) return false;
        if (n == 1) return true;
        if(n%2 != 0) return false;
        return powerOfTwo(n/2);
    }
}
