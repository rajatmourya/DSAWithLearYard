package Lacture2;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total unit: ");
        int unit = sc.nextInt();
        double amount = 0;

        if (unit <= 50){
            amount = unit * 0.50;
        } else if (unit <= 150) {
            amount = 25 + ((unit - 50) * 0.75);
        } else if (unit <= 250) {
            amount = 100 + ((unit - 150) * 1.20);
        }else {
            amount = 220 +  ((unit -250 ) * 1.50);
        }


        amount += ((amount * 20)/100);

        System.out.println("Total amount of " + unit + "units is: "+ amount);
    }
}
