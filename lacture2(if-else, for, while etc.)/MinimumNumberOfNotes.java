package Lacture2;

import java.util.Scanner;

public class MinimumNumberOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int n = sc.nextInt();
        int temp = n;
        int note500, note100, note50, note20, note10, note5, note2, note1;
        note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;
        if(temp >= 500){
            note500 = temp/500;
            temp -= (note500 * 500);
        }
        if (temp >= 100){
            note100 = temp/100;
            temp -= (note100 *100);
        }
        if (temp >= 50){
            note50 = temp/50;
            temp -= note50*50;
        }
        if (temp >= 20){
            note20 = temp/20;
            temp -= (note20 *20);
        }
        if (temp >= 10){
            note10 = temp/10;
            temp -= note10*10;
        }
        if (temp >= 5){
            note5 = temp/5;
            temp -= (note5 * 5);
        }
        if (temp >= 2){
            note2 = temp/2;
            temp -= note2*2;
        }
        if (temp >= 1){
            note1 = temp/1;
            temp -= note1*1;
        }

        System.out.println("Total Number of Notes for amount " + n + ":");
        System.out.println("500 = " + note500);
        System.out.println("100 = " + note100);
        System.out.println("50 = " + note50);
        System.out.println("20 = " + note20);
        System.out.println("10 = " + note10);
        System.out.println("5 = " + note5);
        System.out.println("2 = " + note2);
        System.out.println("1 = " + note1);









    }
}
