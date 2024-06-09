package lacture6;

import java.util.Scanner;

public class PerfectNumbers {

//    Write a java program to find all Perfect numbers in a given range.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Range start from: ");
        int start = sc.nextInt();
        System.out.println("Range end: ");
        int stop = sc.nextInt();

        for (int i = start; i <= stop; i++) {
            int sum = 0;
            for (int j = 1; j <= i/2; j++) {
                if(i%j==0){
                    sum += j;
                }
            }
            if (sum == i){
                System.out.print(i + " ");
            }
        }
    }
}
