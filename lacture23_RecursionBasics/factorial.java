package lacture23_RecursionBasics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    static int fac(int n){
        if(n == 1) return 1;
        return n*fac(n-1);
    }
}
