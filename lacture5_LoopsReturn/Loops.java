package lacture5_LoopsReturn;

import java.util.Scanner;

class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintReverseNumber printReverseNumber = new PrintReverseNumber();
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        System.out.println(printReverseNumber.reverse(num));
    }
}


class PrintReverseNumber{
    public int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        return rev;
    }
}
