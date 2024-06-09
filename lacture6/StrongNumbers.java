package lacture6;

import lacture7.ArrayDisplay;

import java.util.Arrays;
import java.util.Scanner;

public class StrongNumbers {

//    Write a java program to print Strong numbers between 1 to n.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Range start from: ");
//        int start = sc.nextInt();
        int start = 1;
        System.out.println("Range end: ");
        int stop = sc.nextInt();
        int ans[] = strong(start,stop);
        ArrayDisplay.Display.display(ans);
    }

    public static int[] strong(int start, int stop){
        int ar= 0;
        int arr[] = new int[50];
        Arrays.fill(arr,0);
        for (int i = start; i <= stop; i++) {
            int strongNumber = 0;
            int temp = i;
            while (temp != 0){
                int num = temp%10;
                strongNumber += Factorial.fact(num);
                temp /= 10;
//                System.out.println(temp);
            }
            if (strongNumber == i){
                arr[ar] = i;
                ar +=1;
            }
        }
        return arr;
    }


}
