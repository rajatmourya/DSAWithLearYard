package Lacture3;

import java.util.Scanner;

public class DoesItDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many time you want to iterate : ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the number : ");
            int N = sc.nextInt();
            DoesItDivideHelpper(N);
        }
    }
    public static void DoesItDivideHelpper(int N){
        int P = 1;
        int S = 0;
        for (int i = 1; i <= N; i++) {
            P *= i;
            S += i;
        }

        String result = (P % S == 0) ? "YES":"NO";
        System.out.println(result);
//        if (P % S == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }


}
