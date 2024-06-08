package lacture4;

import java.util.Scanner;

public class MiscellaneousStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int n = sc.nextInt();
//        int n = 5;
        diamondStarPattern(n);
        System.out.println();
        rightArrowStarPattern(n);
        System.out.println();
        plusSignPattern(n);
        System.out.println();
        crossStarPattern(n);
        System.out.println();
        eightStarPattern(n);
        System.out.println();

    }

    public static void diamondStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = n-1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightArrowStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = (n-2)*2; j > i*2; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void plusSignPattern(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n-1){
                    System.out.print("+");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (int i = 1; i < n*2; i++) {
            System.out.print("+");
        }


        for (int i = 1; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (j == n-1){
                    System.out.print("+");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void crossStarPattern(int n) {
        for (int i = 1; i <= n*2-1; i++) {
            for (int j = 1; j <= n*2-1; j++) {
                if( (i==j) || j == ((2*n)-i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void eightStarPattern(int n) {

        for (int i = 1; i <= n*2-1; i++) {
            if(i == 1 || i == n || i == n*2 -1){
                for (int j = 1; j < n; j++) {
                    if(j > 1 && j < n) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }else {
                for (int j = 1; j <= n; j++) {
                    if(j == 1 || j == n){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
