package Lacture2;

import java.util.Scanner;

public class CheckWhetherGivenCharacterIsAlphabetDigitOrSpecialCharacte {
    public static void main(String[] args) {
        // Input character from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch = scanner.next().charAt(0);

        if(ch > 'a' && ch < 'z' || ch > 'A' && ch < 'Z'){
            System.out.println("Character is Alphabet");
        } else if (ch > '0' && ch < '9') {
            System.out.println("Character is Number");
        }else {
            System.out.println("Character is Special Character");
        }
    }
}
