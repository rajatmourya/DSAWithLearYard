package lacture24_Recursion;

import java.util.Scanner;

public class LeetCode_50_Pow_X_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        double x = sc.nextDouble();
        System.out.println("Enter the Power of the Number: ");
        int n = sc.nextInt();
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n){
        if(n > 0){
            return myPowHelpper(x,n);
        }else {
            double ans = myPowHelpper(x,n*(-1));
            return 1/ans;
        }
    }

    public static double myPowHelpper(double x, int n) {
        if(n == 0) return 1;
        double p = myPowHelpper(x,n/2);
        if(n%2==0) return p * p;
        return p * p * x;
    }
}
