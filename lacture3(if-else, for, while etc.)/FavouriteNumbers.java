package Lacture3;

import java.util.Scanner;

public class FavouriteNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Case: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter your favourite Number: ");
            int n = sc.nextInt();
            if(n % 2 == 0 && n % 7 == 0 ){
                System.out.println("Alice");
            }else if(n % 2 != 0 && n % 9 == 0){
                System.out.println("Bob");
            }else{
                System.out.println("Charlie");
            }
        }
    }
}
